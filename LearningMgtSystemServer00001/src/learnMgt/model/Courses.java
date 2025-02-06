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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "courses")
public class Courses implements Serializable{
    private static final long serialVersionUID = 1L;

     @Id    
    @Column(name = "course_code")
    private String courseId;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @ManyToMany(mappedBy = "courses")
    private Set<Learner> learners = new HashSet<>();
    
    @OneToMany(mappedBy = "course")
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

   
}
