package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.psm.allocation.algorithm.ilp.tests.util.FixedStructureILPComparator;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

@RunWith(value = Parameterized.class)
public class UnorderedILPTest extends QVToTransformationSingleOutExtentTest {
	private static final ExpectedTransformationStatus success = new ExpectedTransformationStatus();
	
	public UnorderedILPTest(ExpectedTransformationStatus expectedTransformationStatus, String expectedURI,
			String transformationURI, String aslURI, String oclContextURI) {
		super(expectedTransformationStatus, (Object) expectedURI,
				transformationURI, getConfigurationPropertyMap(),
				aslURI, oclContextURI);
	}
	
	@Parameters
	public static Collection<Object[]> getTestData() {
		List<Object[]> testDataList = new ArrayList<Object[]>();
		testDataList.addAll(ForbiddenLocationConstraint2ILPTest.getTestData());
		testDataList.addAll(ImplicationConstraint2ILPTest.getTestData());
		testDataList.addAll(fixupTestData(OclContext2ILPTest.getTestData()));
		testDataList.addAll(SequencePart2ILPTest.getTestData());
		return testDataList;
	}
	
	public static Collection<Object[]> fixupTestData(Collection<Object[]> testData) {
		List<Object[]> newTestData = new ArrayList<Object[]>(testData.size());
		for (Object[] data : testData) {
			Object[] newData = new Object[data.length + 1];
			newData[0] = success;
			System.arraycopy(data, 0, newData, 1, data.length);
			newTestData.add(newData);
		}
		return newTestData;
	}
	
	public static Map<String, Object> getConfigurationPropertyMap() {
		Map<String, Object> configurationPropertyMap = new HashMap<String, Object>();
		configurationPropertyMap.put("config", "reproducibleILP=false");
		return configurationPropertyMap;
	}
	
	@Override
	protected void checkTransformationResult() {
		checkTransformationResult(runner, expectedList);
	}
	
	public static void checkTransformationResult(QVToTransformationRunner runner,
			List<ExpectedOutput> expectedList) {
		List<ModelExtent> outExtentList = runner.getOutExtents();
		Assert.assertEquals(1, outExtentList.size());
		List<EObject> transformationResultList = outExtentList.get(0)
				.getContents();
		Assert.assertEquals(1,  transformationResultList.size());
		FixedStructureILPComparator.assertSameILP(
				(IntegerLinearProgram) expectedList.get(0).getData(),
				(IntegerLinearProgram) transformationResultList.get(0));
	}
}
