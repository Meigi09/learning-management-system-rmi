/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author ELOHOME LTD
 */

public class Assessment {
   
    private Long assessmentId;
   
    private String title;
   
    private Courses course;

    private Set<Learner> learners = new HashSet<>();

    public Assessment() {
    }

    public Assessment(Long assessmentId, String title, Courses course) {
        this.assessmentId = assessmentId;
        this.title = title;
        this.course = course;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
