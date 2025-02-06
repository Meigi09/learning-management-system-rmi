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

public class Instructor {
    
    private Long instructorId;

    private Users user;

    public Instructor() {
    }

    public Instructor(Long instructorId, Users user) {
        this.instructorId = instructorId;
        this.user = user;
    }  

    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
}
