/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author ELOHOME LTD
 */
@Setter
@Getter
@Entity
@Table(name = "discussions")
public class DiscussionForum {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discussion_id")
    private Long discussionId;
    
    @Column(name = "topic")
    private String topic;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    @ManyToMany(mappedBy = "discussions")
    private Set<Learner> learners = new HashSet<>(); 

    public DiscussionForum() {
    }

    public DiscussionForum(Long discussionId, String topic, Courses course) {
        this.discussionId = discussionId;
        this.topic = topic;
        this.course = course;
    }
    
}
