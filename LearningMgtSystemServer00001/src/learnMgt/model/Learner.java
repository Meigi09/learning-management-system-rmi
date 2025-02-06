/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
@Table(name = "learners")
public class Learner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "learner_id")
    private Long learnerId;

    @OneToOne
    @JoinColumn(name = "user_code")
    private Users user;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "learner_assessment",
            joinColumns = @JoinColumn(name = "learner_id"),
            inverseJoinColumns = @JoinColumn(name = "assessment_id"))
    private Set<Assessment> assessments = new HashSet<>();
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "learner_assignments",
            joinColumns = @JoinColumn(name = "learner_id"),
            inverseJoinColumns = @JoinColumn(name = "assignment_id")
    )
    private Set<Assignment> assignments = new HashSet<>();
    
      @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "learner_courses",
            joinColumns = @JoinColumn(name = "learner_id"),
            inverseJoinColumns = @JoinColumn(name = "courses_id")
    )
    private Set<Courses> courses = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "learner_discussions",
            joinColumns = @JoinColumn(name = "learner_id"),
            inverseJoinColumns = @JoinColumn(name = "discussion_id")
    )
    private Set<DiscussionForum> discussions = new HashSet<>();
    
    public Learner() {
    }

    public Learner(Long learnerId, Users user) {
        this.learnerId = learnerId;
        this.user = user;
    }

}
