/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Courses;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class CoursesDao {
      public Courses registerCourses(Courses coObj){
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
      public Courses updateCourses(Courses coObj){
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
     public Courses deleteCourses(Courses coObj){
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
    
    public Courses findCoursesById(Courses coObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Courses theCourses = (Courses) ss.get(Courses.class,coObj.getCourseId());
            ss.close();
            return theCourses;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Courses> retrieveAllCourses(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Courses> books = ss.createQuery("SELECT coObj FROM Courses coObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
