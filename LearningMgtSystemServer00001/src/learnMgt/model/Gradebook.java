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
@Table(name = "gradebooks")
public class Gradebook {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gradebook_id")
    private Long gradebookId;
    private Double grades;
     @ManyToOne
    @JoinColumn(name = "assessment_id")
    private Assessment assessment;
      @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;
    private String date;
    private String comments;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    @ManyToOne
    @JoinColumn(name = "learner_id")
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

  
    
}
