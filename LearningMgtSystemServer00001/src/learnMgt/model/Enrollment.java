/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "enrollments")
public class Enrollment {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private Long enrollmentId;
    
    // Define other attributes as needed

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    @ManyToOne
    @JoinColumn(name = "learner_id")
    private Learner learner;

    public Enrollment() {
    }

    public Enrollment(Long enrollmentId, Courses course, Learner learner) {
        this.enrollmentId = enrollmentId;
        this.course = course;
        this.learner = learner;
    }
    
    
}
