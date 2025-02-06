/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Instructor;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class InstructorDao {
     public Instructor registerInstructor(Instructor insObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(insObj);
            tr.commit();
            ss.close();
            return insObj;
        } catch (Exception e) {
        }
        return null;
    }
      public Instructor updateInstructor(Instructor insObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(insObj);
            tr.commit();
            ss.close();
            return insObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Instructor deleteInstructor(Instructor insObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(insObj);
            tr.commit();
            ss.close();
            return insObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Instructor findInstructorById(Instructor insObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Instructor theInstructor = (Instructor) ss.get(Instructor.class,insObj.getInstructorId());
            ss.close();
            return theInstructor;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Instructor> retrieveAllInstructor(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Instructor> books = ss.createQuery("SELECT insObj FROM Instructor insObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
