/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Learner;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class LearnerDao {
      public Learner registerLearner(Learner leaObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(leaObj);
            tr.commit();
            ss.close();
            return leaObj;
        } catch (Exception e) {
        }
        return null;
    }
       public Learner updateLearner(Learner leaObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(leaObj);
            tr.commit();
            ss.close();
            return leaObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Learner deleteLearner(Learner leaObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(leaObj);
            tr.commit();
            ss.close();
            return leaObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Learner findLearnerById(Learner leaObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Learner theLearner = (Learner) ss.get(Learner.class,leaObj.getLearnerId());
            ss.close();
            return theLearner;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Learner> retrieveAllLearner(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Learner> books = ss.createQuery("SELECT leaObj FROM Learner leaObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    } 
}
