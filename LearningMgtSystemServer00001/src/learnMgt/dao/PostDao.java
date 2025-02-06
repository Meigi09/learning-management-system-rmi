/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Post;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class PostDao {
     public Post registerPost(Post poObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(poObj);
            tr.commit();
            ss.close();
            return poObj;
        } catch (Exception e) {
        }
        return null;
    }
      public Post updatePost(Post poObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(poObj);
            tr.commit();
            ss.close();
            return poObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Post deletePost(Post poObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(poObj);
            tr.commit();
            ss.close();
            return poObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Post findPostById(Post poObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Post thePost = (Post) ss.get(Post.class,poObj.getPostId());
            ss.close();
            return thePost;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Post> retrieveAllPost(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Post> books = ss.createQuery("SELECT poObj FROM Post poObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    } 
}
