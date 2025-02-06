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
@Table(name = "analytics")
public class Analytics {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "analytics_id")
    private Long analyticsId;
    
    // Define other attributes as needed

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    public Analytics() {
    }

    public Analytics(Long analyticsId, Courses course) {
        this.analyticsId = analyticsId;
        this.course = course;
    }
    
    
}
