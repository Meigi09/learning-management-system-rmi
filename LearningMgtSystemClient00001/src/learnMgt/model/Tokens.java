/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.util.Date;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author ELOHOME LTD
 */

public class Tokens {
 
    private Long tokenId;

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

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }
    
}
