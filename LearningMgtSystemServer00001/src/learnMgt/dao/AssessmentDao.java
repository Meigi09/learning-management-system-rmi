/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;

import learnMgt.model.Assessment;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class AssessmentDao {
     public Assessment registerAssessment(Assessment assObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(assObj);
            tr.commit();
            ss.close();
            return assObj;
        } catch (Exception e) {
        }
        return null;
    }
       public Assessment updateAssessment(Assessment assObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(assObj);
            tr.commit();
            ss.close();
            return assObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Assessment deleteAssessment(Assessment assObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(assObj);
            tr.commit();
            ss.close();
            return assObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Assessment findAssessmentById(Assessment assObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Assessment theAssessment = (Assessment) ss.get(Assessment.class,assObj.getAssessmentId());
            ss.close();
            return theAssessment;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Assessment> retrieveAllAssessment(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Assessment> books = ss.createQuery("SELECT assObj FROM Assessment assObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
