package org.muml.eloquent.example.drwahnsinn.ui;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.muml.eloquent.example.drwahnsinn.Position;
import org.muml.eloquent.example.drwahnsinn.RelationCollection;
import org.muml.eloquent.example.drwahnsinn.TileRelation;

import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;

// This is mostly based on http://docs.oracle.com/javase/8/javafx/graphics-tutorial/javafx-3d-graphics.htm#CHDGHHEJ
// However, it needs a bit more love here and there...
public class Visualizer {
	private static final int SCENE_WIDTH = 900;
	private static final int SCENE_HEIGHT = 900;
	
	// cube size
	private static final int SIZE = 50;
	
	private static final String KEY_NEXT = "n";
	private static final String KEY_PREV = "p";
	
	private static final PhongMaterial materialExisting =
			new PhongMaterial(Color.CORAL);
	private static final PhongMaterial materialNew =
			new PhongMaterial(Color.AQUAMARINE);
	
	private URI modelURI;
	
	private XYRotationGroup group;
	private Group cubeGroup;
	
	public Visualizer(URI modelURI) {
		this.modelURI = modelURI;
	}
	
	protected void createCube(double x, double y, double z) {
		Box box = new Box(SIZE, SIZE, SIZE);
		box.setTranslateX(x * SIZE);
		box.setTranslateY(y * SIZE);
		box.setTranslateZ(z * SIZE);
		box.setMaterial(materialNew);
		cubeGroup.getChildren().add(box);
	}
	
	protected void createCube(Position position) {
		createCube(position.getX(), position.getY(), position.getZ());
	}
	
	protected void markExisting() {
		// this is not really clever...
		for (Node node : cubeGroup.getChildren()) {
			if (node instanceof Box) {
				((Box) node).setMaterial(materialExisting);
			}
		}
	}
	
	protected void processTileRelation(TileRelation tileRelation) {
		List<Position> positionList = new ArrayList<Position>(tileRelation.getPositions());
		positionList.sort(positionComparator);
		markExisting();
		for (Position position : positionList) {
			createCube(position);
		}
	}
	
	protected RelationCollection loadModel() {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(modelURI, true);
		if (resource.getContents().size() != 1) {
			throw new IllegalArgumentException("Too many model elements");
		} else if (!(resource.getContents().get(0) instanceof RelationCollection)) {
			throw new IllegalArgumentException("Unexpected model content");
		}
		return (RelationCollection) resource.getContents().get(0);
	}
	
	protected static class PositionComparator implements Comparator<Position> {

		@Override
		public int compare(Position p1, Position p2) {
			if (p1.getX() < p2.getX()) {
				return -1;
			} else if (p1.getX() > p2.getX()) {
				return 1;
			} else if (p1.getY() < p2.getY()) {
				return -1;
			} else if (p1.getY() > p2.getY()) {
				return 1;
			} else if (p1.getZ() < p2.getZ()) {
				return -1;
			} else if (p1.getZ() > p2.getZ()) {
				return 1;
			}
			return 0;
		}
		
	}
	
	protected static final PositionComparator positionComparator = new PositionComparator();
	
	protected static class TileRelationComparator implements Comparator<TileRelation> {

		@Override
		public int compare(TileRelation tr1, TileRelation tr2) {
			List<Position> l1 = new ArrayList<Position>(tr1.getPositions());
			List<Position> l2 = new ArrayList<Position>(tr2.getPositions());
			// these cases should never happen...
			if (l1.isEmpty() && l2.isEmpty()) {
				return 0;
			} else if (l1.isEmpty()) {
				return -1;
			} else if (l2.isEmpty()) {
				return 1;
			}
			// we sort a lot - we should do the more cleverly... (e.g., we
			// sort the same tile relation several times)
			l1.sort(positionComparator);
			l2.sort(positionComparator);
			return positionComparator.compare(l1.get(0), l2.get(0));
		}
		
	}
	
	protected static final TileRelationComparator tileRelationComparator =
			new TileRelationComparator();
	
	protected ListIterator<TileRelation> tileRelationIt;
	
	protected void initModel() {
		RelationCollection relationCollection = loadModel();
		List<TileRelation> tileRelationList = new ArrayList<TileRelation>(
				relationCollection.getTileRelations());
		tileRelationList.sort(tileRelationComparator);
		tileRelationIt = tileRelationList.listIterator();
	}
	
	protected static class XYRotationGroup extends Group {
		public Rotate rx;
		public Rotate ry;
		
		public XYRotationGroup() {
			super();
			rx = new Rotate(0, Rotate.X_AXIS);
			ry = new Rotate(0, Rotate.Y_AXIS);
			getTransforms().addAll(rx, ry);
		}
	}

	public Scene createScene() {
		group = new XYRotationGroup();
		cubeGroup = new Group();
		group.getChildren().add(cubeGroup);
		Scene scene = new Scene(group, SCENE_WIDTH, SCENE_HEIGHT, true,
				SceneAntialiasing.BALANCED);
		scene.setCamera(createCamera());
		installMouseDragEnteredHandler(scene);
		installMouseDraggedHandler(scene);
		installKeyTypedHandler(scene);
		initModel();
		return scene;
	}
	
	protected Camera createCamera() {
		PerspectiveCamera camera = new PerspectiveCamera(true);
		camera.setFarClip(1500.0);
		camera.setTranslateZ(-1000);
		return camera;
	}
	
	private double mouseXPos, mouseYPos;
	
	protected void installMouseDragEnteredHandler(Scene scene) {
		scene.setOnMouseDragEntered(event -> {
			if (!event.isPrimaryButtonDown()) {
				return;
			}
			mouseXPos = event.getSceneX();
			mouseYPos = event.getSceneY();
		});
	}
	
	protected void installMouseDraggedHandler(Scene scene) {
		// based on http://docs.oracle.com/javase/8/javafx/graphics-tutorial/sampleapp3d-code.htm#CJAFJADF
		scene.setOnMouseDragged(event -> {
			if (!event.isPrimaryButtonDown()) {
				return;
			}
			double mouseXPosOld = mouseXPos;
			double mouseYPosOld = mouseYPos;
			mouseXPos = event.getSceneX();
			mouseYPos = event.getSceneY();
			group.rx.setAngle(group.rx.getAngle() - (mouseXPos - mouseXPosOld));
			group.ry.setAngle(group.ry.getAngle() - (mouseYPos - mouseYPosOld));
		});
	}
	
	protected void installKeyTypedHandler(Scene scene) {
		scene.setOnKeyTyped(event -> {
			if (event.getCharacter().equals(KEY_NEXT)
					&& tileRelationIt.hasNext()) {
				processTileRelation(tileRelationIt.next());
			} else if (event.getCharacter().equals(KEY_PREV)
					&& tileRelationIt.hasPrevious()) {
				int size = tileRelationIt.previous().getPositions().size();
				cubeGroup.getChildren().remove(cubeGroup.getChildren().size() - size,
						cubeGroup.getChildren().size());
			}
		});
	}
	
	public static Scene createScene(URI modelURI) {
		return new Visualizer(modelURI).createScene();
	}

}
