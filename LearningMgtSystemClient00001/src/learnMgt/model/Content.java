/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;



/**
 *
 * @author ELOHOME LTD
 */

public class Content {
   
    private Long contentId;

    private String type;
    
    private String title;

    private String description;
 
    private String fileOrLink;

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

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileOrLink() {
        return fileOrLink;
    }

    public void setFileOrLink(String fileOrLink) {
        this.fileOrLink = fileOrLink;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
    
    
}
