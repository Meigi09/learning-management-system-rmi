/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Tokens;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class TokenDao {
    public Tokens registerTokens(Tokens tokObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(tokObj);
            tr.commit();
            ss.close();
            return tokObj;
        } catch (Exception e) {
        }
        return null;
    }
    public Tokens updateTokens(Tokens tokObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(tokObj);
            tr.commit();
            ss.close();
            return tokObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Tokens deleteTokens(Tokens tokObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(tokObj);
            tr.commit();
            ss.close();
            return tokObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Tokens findTokensById(Tokens tokObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Tokens theTokens = (Tokens) ss.get(Tokens.class,tokObj.getTokenId());
            ss.close();
            return theTokens;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Tokens> retrieveAllTokens(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Tokens> books = ss.createQuery("SELECT tokObj FROM Tokens tokObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    } 
}
