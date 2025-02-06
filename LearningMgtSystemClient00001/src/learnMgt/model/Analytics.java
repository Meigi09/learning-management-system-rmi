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

public class Analytics {
   
    private Long analyticsId;
  
    private Courses course;

    public Analytics() {
    }

    public Analytics(Long analyticsId, Courses course) {
        this.analyticsId = analyticsId;
        this.course = course;
    }

    public Long getAnalyticsId() {
        return analyticsId;
    }

    public void setAnalyticsId(Long analyticsId) {
        this.analyticsId = analyticsId;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
    
    
}
