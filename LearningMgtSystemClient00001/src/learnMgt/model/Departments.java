/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.io.Serializable;


/**
 *
 * @author ELOHOME LTD
 */

public class Departments implements Serializable{
  
     private static final long serialVersionUID = 1L;
    private Long departmentId;

    private String name;

    // Other attributes as needed
    private String description;

    public Departments() {
    }

    public Departments(Long departmentId, String name, String description) {
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
