/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Assignment;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class AssignmentDao {
      public Assignment registerAssignment(Assignment assObj){
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
        public Assignment updateAssignment(Assignment assObj){
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
     public Assignment deleteAssignment(Assignment assObj){
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
    
    public Assignment findAssignmentById(Assignment assObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Assignment theAssignment = (Assignment) ss.get(Assignment.class,assObj.getAssignmentId());
            ss.close();
            return theAssignment;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Assignment> retrieveAllAssignment(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Assignment> books = ss.createQuery("SELECT assObj FROM Assignment assObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
