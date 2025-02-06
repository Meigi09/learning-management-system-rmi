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
@Table(name = "contents")
public class Content {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private Long contentId;
    
    @Column(name = "type")
    private String type;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "file_or_link")
    private String fileOrLink;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    public Content() {
    }

    public Content(Long contentId, String type, String title, String description, String fileOrLink, Courses course) {
        this.contentId = contentId;
        this.type = type;
        this.title = title;
        this.description = description;
        this.fileOrLink = fileOrLink;
        this.course = course;
    }
    
    
}
