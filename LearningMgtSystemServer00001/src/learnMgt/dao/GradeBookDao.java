/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Gradebook;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class GradeBookDao {
    public Gradebook registerGradebook(Gradebook graObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(graObj);
            tr.commit();
            ss.close();
            return graObj;
        } catch (Exception e) {
        }
        return null;
    }
     public Gradebook updateGradebook(Gradebook graObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(graObj);
            tr.commit();
            ss.close();
            return graObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Gradebook deleteGradebook(Gradebook graObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(graObj);
            tr.commit();
            ss.close();
            return graObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Gradebook findGradebookById(Gradebook graObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Gradebook theGradebook = (Gradebook) ss.get(Gradebook.class,graObj.getGradebookId());
            ss.close();
            return theGradebook;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Gradebook> retrieveAllGradebook(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Gradebook> books = ss.createQuery("SELECT graObj FROM Gradebook graObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    } 
}
