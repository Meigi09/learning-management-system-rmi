/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ELOHOME LTD
 */
@Setter
@Getter
@Entity
public class Calendar {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;

    // Additional attributes as needed

    @ManyToOne
    @JoinColumn(name = "course_id") 
    private Courses course;

    public Calendar() {
    }

    public Calendar(Long eventId, String title, String description, Date startDate, Date endDate, Courses course) {
        this.eventId = eventId;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.course = course;
    }
    
    
}
