/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Calendar;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class CalendarDao {
     public Calendar registerCalendar(Calendar calObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(calObj);
            tr.commit();
            ss.close();
            return calObj;
        } catch (Exception e) {
        }
        return null;
    }
       public Calendar updateCalendar(Calendar calObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(calObj);
            tr.commit();
            ss.close();
            return calObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Calendar deleteCalendar(Calendar calObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(calObj);
            tr.commit();
            ss.close();
            return calObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Calendar findCalendarById(Calendar calObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Calendar theCalendar = (Calendar) ss.get(Calendar.class,calObj.getEventId());
            ss.close();
            return theCalendar;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Calendar> retrieveAllCalendar(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Calendar> books = ss.createQuery("SELECT calObj FROM Calendar calObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
