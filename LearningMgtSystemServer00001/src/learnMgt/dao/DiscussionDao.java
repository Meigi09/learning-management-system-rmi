/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.DiscussionForum;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class DiscussionDao {
      public DiscussionForum registerDiscussion(DiscussionForum discObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(discObj);
            tr.commit();
            ss.close();
            return discObj;
        } catch (Exception e) {
        }
        return null;
    }
      public DiscussionForum updateDiscussion(DiscussionForum discObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(discObj);
            tr.commit();
            ss.close();
            return discObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public DiscussionForum deleteDiscussion(DiscussionForum discObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(discObj);
            tr.commit();
            ss.close();
            return discObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public DiscussionForum findDiscussionById(DiscussionForum discObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            DiscussionForum theDiscussion = (DiscussionForum) ss.get(DiscussionForum.class,discObj.getDiscussionId());
            ss.close();
            return theDiscussion;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<DiscussionForum> retrieveAllDiscussion(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<DiscussionForum> books = ss.createQuery("SELECT discObj FROM DiscussionForum discObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
