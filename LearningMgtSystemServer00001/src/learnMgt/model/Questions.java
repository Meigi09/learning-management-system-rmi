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
@Table(name = "questions")
public class Questions {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
     private Long questionId;
    
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String answer;
    @ManyToOne
    @JoinColumn(name = "assessment_id")
    private Assessment asses;

    public Questions() {
    }

    public Questions(Long questionId, String title, String option1, String option2, String option3, String answer, Assessment asses) {
        this.questionId = questionId;
        this.title = title;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answer = answer;
        this.asses = asses;
    }
    
    
}
