/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author ELOHOME LTD
 */
@Setter
@Getter
@Entity
@Table(name = "userside")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
   
    @Column(name = "user_code")
    private Integer userid;

    private String username;
    private String password;
    private String email;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "role")
    private String role;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments departments;

    @Column(name = "profile_photo")
    private byte[] Imageprofile;
    @Column(name = "registration_date", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date registrationDate;

    @UpdateTimestamp
    @Column(name = "login_date")
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

}
