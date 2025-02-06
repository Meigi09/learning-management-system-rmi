/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.sql.Date;
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
@Table(name = "assignments")
public class Assignment {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Long assignmentId;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "instructions")
    private String instructions;
    
    @Column(name = "due_date")
    private Date dueDate;
    
    @Column(name = "submission_method")
    private String submissionMethod;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    @ManyToMany(mappedBy = "assignments")
    private Set<Learner> learners = new HashSet<>();

    public Assignment() {
    }

    public Assignment(Long assignmentId, String title, String instructions, Date dueDate, String submissionMethod, Courses course) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.instructions = instructions;
        this.dueDate = dueDate;
        this.submissionMethod = submissionMethod;
        this.course = course;
    }
    
    
}
