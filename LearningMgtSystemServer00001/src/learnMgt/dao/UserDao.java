/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class UserDao {
    public Users registerUser(Users useObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(useObj);
            tr.commit();
            ss.close();
            return useObj;
        } catch (Exception e) {
        }
        return null;
    }
      public Users updateUsers(Users useObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(useObj);
            tr.commit();
            ss.close();
            return useObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Users deleteUser(Users useObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(useObj);
            tr.commit();
            ss.close();
            return useObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Users findUserById(Users useObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Users theUsers = (Users) ss.get(Users.class,useObj.getUserid());
            ss.close();
            return theUsers;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
        
    public List<Users> retrieveAllUsers(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Users> books = ss.createQuery("SELECT useObj FROM Users useObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
}
