/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author ELOHOME LTD
 */

public class Courses implements Serializable{
    
   private static final long serialVersionUID = 1L;

    private String courseId;
    
    private String title;
    
    private String description;
    
    private Date startDate;
    
    private Date endDate;

    private Instructor instructor;

    private Set<Learner> learners = new HashSet<>();
    
    private Set<Calendar> events = new HashSet<>(); 

    public Courses() {
    }

    public Courses(String courseId, String title, String description, Date startDate, Date endDate, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructor = instructor;
    }  

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Set<Learner> getLearners() {
        return learners;
    }

    public void setLearners(Set<Learner> learners) {
        this.learners = learners;
    }

    public Set<Calendar> getEvents() {
        return events;
    }

    public void setEvents(Set<Calendar> events) {
        this.events = events;
    }
    
}
