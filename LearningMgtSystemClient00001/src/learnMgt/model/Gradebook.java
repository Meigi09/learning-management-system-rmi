/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;


/**
 *
 * @author ELOHOME LTD
 */

public class Gradebook {
   
    private Long gradebookId;
 
    private Double grades;    
    private Assessment assessment;    
    private Assignment assignment;
    private String date;
    private String comments;
    private Courses course;

    private Learner learner;

    public Gradebook() {
    }

    public Gradebook(Long gradebookId, Double grades, Assessment assessment, Assignment assignment, String date, String comments, Courses course, Learner learner) {
        this.gradebookId = gradebookId;
        this.grades = grades;
        this.assessment = assessment;
        this.assignment = assignment;
        this.date = date;
        this.comments = comments;
        this.course = course;
        this.learner = learner;
    }

    

    public Long getGradebookId() {
        return gradebookId;
    }

    public void setGradebookId(Long gradebookId) {
        this.gradebookId = gradebookId;
    }

    public Double getGrades() {
        return grades;
    }

    public void setGrades(Double grades) {
        this.grades = grades;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    
    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Learner getLearner() {
        return learner;
    }

    public void setLearner(Learner learner) {
        this.learner = learner;
    }
    
    
}
