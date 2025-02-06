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

public class DiscussionForum {
   
    private Long discussionId;
 
    private String topic;

    private Courses course;

    private Set<Learner> learners = new HashSet<>(); 

    public DiscussionForum() {
    }

    public DiscussionForum(Long discussionId, String topic, Courses course) {
        this.discussionId = discussionId;
        this.topic = topic;
        this.course = course;
    }

    public Long getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
