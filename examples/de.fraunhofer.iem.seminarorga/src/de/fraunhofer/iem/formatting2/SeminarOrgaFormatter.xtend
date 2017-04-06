/*
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.formatting2

import com.google.inject.Inject
import de.fraunhofer.iem.seminarOrga.Assignment
import de.fraunhofer.iem.seminarOrga.Preference
import de.fraunhofer.iem.seminarOrga.Rating
import de.fraunhofer.iem.seminarOrga.Seminar
import de.fraunhofer.iem.seminarOrga.Student
import de.fraunhofer.iem.seminarOrga.Supervise
import de.fraunhofer.iem.seminarOrga.Supervisor
import de.fraunhofer.iem.seminarOrga.Topic
import de.fraunhofer.iem.services.SeminarOrgaGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SeminarOrgaFormatter extends AbstractFormatter2 {
	
	@Inject extension SeminarOrgaGrammarAccess

	def dispatch void format(Seminar seminar, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Supervisor supervisor : seminar.getSupervisors()) {
			supervisor.format;
		}
		for (Student student : seminar.getStudents()) {
			student.format;
		}
		for (Topic topic : seminar.getTopics()) {
			topic.format;
		}
		for (Preference preference : seminar.getPreferences()) {
			preference.format;
		}
		for (Rating rating : seminar.getRatings()) {
			rating.format;
		}
		for (Supervise supervise : seminar.getSupervises()) {
			supervise.format;
		}
		for (Assignment assignment : seminar.getAssignments()) {
			assignment.format;
		}
		seminar.regionFor.keyword(";").append[newLine]
		
	}
		def dispatch void format(Assignment assignment, extension IFormattableDocument document) {
		assignment.regionFor.keyword(";").append[newLine]
		}
			
		def dispatch void format(Supervise supervise, extension IFormattableDocument document) {
		supervise.regionFor.keyword(";").append[newLine]
		}
		
		def dispatch void format(Topic topic, extension IFormattableDocument document) {
		topic.regionFor.keyword(";").append[newLine]
		}
		
		def dispatch void format(Rating rating, extension IFormattableDocument document) {
		rating.regionFor.keyword(";").append[newLine]
		}			
		
		def dispatch void format(Student student, extension IFormattableDocument document) {
		student.regionFor.keyword(";").append[newLine]
		}			
		
		def dispatch void format(Preference preference, extension IFormattableDocument document) {
		preference.regionFor.keyword(";").append[newLine]
		}			
		
	// TODO: implement for 
}