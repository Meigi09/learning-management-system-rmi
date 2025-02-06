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

public class Administration {
    
    private Long adminId;

    private Users user;
  
    private String permissions;

    public Administration() {
    }

    public Administration(Long adminId, Users user, String permissions) {
        this.adminId = adminId;
        this.user = user;
        this.permissions = permissions;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
    
    
}
