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

public class Enrollment {
  
    private Long enrollmentId;
 
    private Courses course;

    private Learner learner;

    public Enrollment() {
    }

    public Enrollment(Long enrollmentId, Courses course, Learner learner) {
        this.enrollmentId = enrollmentId;
        this.course = course;
        this.learner = learner;
    }

    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
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
