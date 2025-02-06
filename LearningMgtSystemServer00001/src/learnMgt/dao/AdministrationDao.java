/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Administration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class AdministrationDao {
   public Administration registerAdministration(Administration admObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(admObj);
            tr.commit();
            ss.close();
            return admObj;
        } catch (Exception e) {
        }
        return null;
    }
    public Administration updateAdministration(Administration admObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(admObj);
            tr.commit();
            ss.close();
            return admObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Administration deleteAdministration(Administration admObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(admObj);
            tr.commit();
            ss.close();
            return admObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Administration findAdministrationById(Administration admObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Administration theAdministration = (Administration) ss.get(Administration.class,admObj.getAdminId());
            ss.close();
            return theAdministration;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Administration> retrieveAllAdministration(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Administration> books = ss.createQuery("SELECT admObj FROM Administration admObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    } 
}
