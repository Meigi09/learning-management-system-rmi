/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Analytics;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class AnalyticsDao {
      public Analytics registerAnalytics(Analytics anaObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(anaObj);
            tr.commit();
            ss.close();
            return anaObj;
        } catch (Exception e) {
        }
        return null;
    }
       public Analytics updateAnalytics(Analytics anaObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(anaObj);
            tr.commit();
            ss.close();
            return anaObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Analytics deleteAnalytics(Analytics anaObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(anaObj);
            tr.commit();
            ss.close();
            return anaObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Analytics findAnalyticsById(Analytics anaObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Analytics theAnalytics = (Analytics) ss.get(Analytics.class,anaObj.getAnalyticsId());
            ss.close();
            return theAnalytics;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Analytics> retrieveAllAnalytics(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Analytics> books = ss.createQuery("SELECT anaObj FROM Analytics anaObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
