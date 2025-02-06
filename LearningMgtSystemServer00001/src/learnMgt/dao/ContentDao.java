/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Content;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class ContentDao {
      public Content registerContent(Content contObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(contObj);
            tr.commit();
            ss.close();
            return contObj;
        } catch (Exception e) {
        }
        return null;
    }
      public Content updateContent(Content contObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(contObj);
            tr.commit();
            ss.close();
            return contObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Content deleteContent(Content contObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(contObj);
            tr.commit();
            ss.close();
            return contObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Content findContentById(Content contObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Content theContent = (Content) ss.get(Content.class,contObj.getContentId());
            ss.close();
            return theContent;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Content> retrieveAllContent(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Content> books = ss.createQuery("SELECT contObj FROM Content contObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
