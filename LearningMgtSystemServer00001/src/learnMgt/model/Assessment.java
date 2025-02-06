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
@Table(name = "assessments")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_id")
    private Long assessmentId;

    @Column(name = "title")
    private String title;

    // Define other attributes as needed
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

     @ManyToMany(mappedBy = "assessments")   
    private Set<Learner> learners = new HashSet<>();

//   @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(name = "learner_assessment",
//            joinColumns = @JoinColumn(name = "learner_id"),
//            inverseJoinColumns = @JoinColumn(name = "assessment_id"))
//    private Set<Learner> learners = new HashSet<>();
    public Assessment() {
    }

    public Assessment(Long assessmentId, String title, Courses course) {
        this.assessmentId = assessmentId;
        this.title = title;
        this.course = course;
    }

}
