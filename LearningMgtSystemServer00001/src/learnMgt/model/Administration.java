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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "administrators")
public class Administration {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long adminId;

    @OneToOne
    @JoinColumn(name = "user_code")
    private Users user;
    
    @Column(name = "permissions")
    private String permissions;

    public Administration() {
    }

    public Administration(Long adminId, Users user, String permissions) {
        this.adminId = adminId;
        this.user = user;
        this.permissions = permissions;
    }
    
    
}
