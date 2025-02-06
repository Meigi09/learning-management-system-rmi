/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Enrollment;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class EnrollmentDao {
     public Enrollment registerEnrollment(Enrollment enObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(enObj);
            tr.commit();
            ss.close();
            return enObj;
        } catch (Exception e) {
        }
        return null;
    }
      public Enrollment updateEnrollment(Enrollment enObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(enObj);
            tr.commit();
            ss.close();
            return enObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Enrollment deleteEnrollment(Enrollment enObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(enObj);
            tr.commit();
            ss.close();
            return enObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Enrollment findEnrollmentById(Enrollment enObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Enrollment theEnrollment = (Enrollment) ss.get(Enrollment.class,enObj.getEnrollmentId());
            ss.close();
            return theEnrollment;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Enrollment> retrieveAllEnrollment(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Enrollment> books = ss.createQuery("SELECT enObj FROM Enrollment enObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
