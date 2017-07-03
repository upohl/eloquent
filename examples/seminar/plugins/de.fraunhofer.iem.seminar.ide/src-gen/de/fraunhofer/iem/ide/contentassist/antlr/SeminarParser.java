/*
 * generated by Xtext 2.10.0
 */
package de.fraunhofer.iem.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.fraunhofer.iem.ide.contentassist.antlr.internal.InternalSeminarParser;
import de.fraunhofer.iem.services.SeminarGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SeminarParser extends AbstractContentAssistParser {

	@Inject
	private SeminarGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSeminarParser createParser() {
		InternalSeminarParser result = new InternalSeminarParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSeminarAccess().getGroup(), "rule__Seminar__Group__0");
					put(grammarAccess.getSeminarAccess().getGroup_3(), "rule__Seminar__Group_3__0");
					put(grammarAccess.getSeminarAccess().getGroup_3_2(), "rule__Seminar__Group_3_2__0");
					put(grammarAccess.getSeminarAccess().getGroup_4(), "rule__Seminar__Group_4__0");
					put(grammarAccess.getSeminarAccess().getGroup_4_2(), "rule__Seminar__Group_4_2__0");
					put(grammarAccess.getSeminarAccess().getGroup_5(), "rule__Seminar__Group_5__0");
					put(grammarAccess.getSeminarAccess().getGroup_5_2(), "rule__Seminar__Group_5_2__0");
					put(grammarAccess.getPreferenceAccess().getGroup(), "rule__Preference__Group__0");
					put(grammarAccess.getPreferenceAccess().getGroup_3(), "rule__Preference__Group_3__0");
					put(grammarAccess.getRatingAccess().getGroup(), "rule__Rating__Group__0");
					put(grammarAccess.getSuperviseAccess().getGroup(), "rule__Supervise__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getSeminarAccess().getNameAssignment_1(), "rule__Seminar__NameAssignment_1");
					put(grammarAccess.getSeminarAccess().getSupervisorsAssignment_3_1(), "rule__Seminar__SupervisorsAssignment_3_1");
					put(grammarAccess.getSeminarAccess().getSupervisorsAssignment_3_2_1(), "rule__Seminar__SupervisorsAssignment_3_2_1");
					put(grammarAccess.getSeminarAccess().getStudentsAssignment_4_1(), "rule__Seminar__StudentsAssignment_4_1");
					put(grammarAccess.getSeminarAccess().getStudentsAssignment_4_2_1(), "rule__Seminar__StudentsAssignment_4_2_1");
					put(grammarAccess.getSeminarAccess().getTopicsAssignment_5_1(), "rule__Seminar__TopicsAssignment_5_1");
					put(grammarAccess.getSeminarAccess().getTopicsAssignment_5_2_1(), "rule__Seminar__TopicsAssignment_5_2_1");
					put(grammarAccess.getSeminarAccess().getPreferencesAssignment_6(), "rule__Seminar__PreferencesAssignment_6");
					put(grammarAccess.getSeminarAccess().getRatingsAssignment_7(), "rule__Seminar__RatingsAssignment_7");
					put(grammarAccess.getSeminarAccess().getSupervisesAssignment_8(), "rule__Seminar__SupervisesAssignment_8");
					put(grammarAccess.getSeminarAccess().getAssignmentsAssignment_9(), "rule__Seminar__AssignmentsAssignment_9");
					put(grammarAccess.getSupervisorAccess().getNameAssignment(), "rule__Supervisor__NameAssignment");
					put(grammarAccess.getStudentAccess().getNameAssignment(), "rule__Student__NameAssignment");
					put(grammarAccess.getTopicAccess().getNameAssignment(), "rule__Topic__NameAssignment");
					put(grammarAccess.getPreferenceAccess().getStudentAssignment_0(), "rule__Preference__StudentAssignment_0");
					put(grammarAccess.getPreferenceAccess().getTopicsAssignment_2(), "rule__Preference__TopicsAssignment_2");
					put(grammarAccess.getPreferenceAccess().getTopicsAssignment_3_1(), "rule__Preference__TopicsAssignment_3_1");
					put(grammarAccess.getRatingAccess().getStudentAssignment_0(), "rule__Rating__StudentAssignment_0");
					put(grammarAccess.getRatingAccess().getTopicAssignment_2(), "rule__Rating__TopicAssignment_2");
					put(grammarAccess.getRatingAccess().getRatingAssignment_4(), "rule__Rating__RatingAssignment_4");
					put(grammarAccess.getSuperviseAccess().getSupervisorAssignment_0(), "rule__Supervise__SupervisorAssignment_0");
					put(grammarAccess.getSuperviseAccess().getTopicAssignment_2(), "rule__Supervise__TopicAssignment_2");
					put(grammarAccess.getAssignmentAccess().getStudentAssignment_0(), "rule__Assignment__StudentAssignment_0");
					put(grammarAccess.getAssignmentAccess().getTopicAssignment_4(), "rule__Assignment__TopicAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSeminarParser typedParser = (InternalSeminarParser) parser;
			typedParser.entryRuleSeminar();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SeminarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeminarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}