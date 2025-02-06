/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Questions;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class QuestionDao {
      public Questions registerQuestions(Questions coObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(coObj);
            tr.commit();
            ss.close();
            return coObj;
        } catch (Exception e) {
        }
        return null;
    }
      public Questions updateQuestions(Questions coObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(coObj);
            tr.commit();
            ss.close();
            return coObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Questions deleteQuestions(Questions coObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(coObj);
            tr.commit();
            ss.close();
            return coObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Questions findQuestionsById(Questions coObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Questions theQuestions = (Questions) ss.get(Questions.class,coObj.getQuestionId());
            ss.close();
            return theQuestions;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Questions> retrieveAllQuestions(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Questions> books = ss.createQuery("SELECT coObj FROM Questions coObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
