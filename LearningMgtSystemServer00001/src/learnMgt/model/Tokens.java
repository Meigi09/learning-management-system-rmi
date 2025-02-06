/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import jdk.nashorn.internal.parser.TokenType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ELOHOME LTD
 */
@Setter
@Getter
@Entity
public class Tokens {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;

    @Column(nullable = false, unique = true)
    private String tokenValue;

    private Date expirationDate;

    // Other attributes as needed
    private TokenType tokenType;

    public Tokens() {
    }

    public Tokens(Long tokenId, String tokenValue, Date expirationDate, TokenType tokenType) {
        this.tokenId = tokenId;
        this.tokenValue = tokenValue;
        this.expirationDate = expirationDate;
        this.tokenType = tokenType;
    }
    
}
