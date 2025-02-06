/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Users implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer userid;
   
    private String username;    
    private String password;
    private String email;

    private String firstName;
 
    private String lastName;

    private String role; 
    private Departments departments; 
    private byte[] Imageprofile;
    private Date registrationDate;

    private Date loginDate;

    public Users() {
    }

    public Users(Integer userid, String username, String password, String email, String firstName, String lastName, String role, Departments departments, byte[] Imageprofile, Date registrationDate, Date loginDate) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.departments = departments;
        this.Imageprofile = Imageprofile;
        this.registrationDate = registrationDate;
        this.loginDate = loginDate;
    }

   
 

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

      
    public byte[] getImageprofile() {
        return Imageprofile;
    }

    public void setImageprofile(byte[] Imageprofile) {
        this.Imageprofile = Imageprofile;
    }

    
    
    
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    
    
    
}
