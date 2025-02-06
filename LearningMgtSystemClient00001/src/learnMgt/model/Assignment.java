/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author ELOHOME LTD
 */

public class Assignment {
   
    private Long assignmentId;
   
    private String title;
  
    private String instructions;
    
    private Date dueDate;
   
    private String submissionMethod;

  
    private Courses course;
   
    private Set<Learner> learners = new HashSet<>();

    public Assignment() {
    }

    public Assignment(Long assignmentId, String title, String instructions, Date dueDate, String submissionMethod, Courses course) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.instructions = instructions;
        this.dueDate = dueDate;
        this.submissionMethod = submissionMethod;
        this.course = course;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getSubmissionMethod() {
        return submissionMethod;
    }

    public void setSubmissionMethod(String submissionMethod) {
        this.submissionMethod = submissionMethod;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Set<Learner> getLearners() {
        return learners;
    }

    public void setLearners(Set<Learner> learners) {
        this.learners = learners;
    }
    
    
}
