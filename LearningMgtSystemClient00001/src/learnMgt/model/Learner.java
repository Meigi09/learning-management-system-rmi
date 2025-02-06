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

public class Learner {
   
    private Long learnerId;

    private Users user;

    public Learner() {
    }

    public Learner(Long learnerId, Users user) {
        this.learnerId = learnerId;
        this.user = user;
    }

    public Long getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(Long learnerId) {
        this.learnerId = learnerId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
}
