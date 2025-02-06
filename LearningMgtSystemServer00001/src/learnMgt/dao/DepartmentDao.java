/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.dao;

import java.util.List;
import learnMgt.model.Departments;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ELOHOME LTD
 */
public class DepartmentDao {
    public Departments registerDepartments(Departments depObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(depObj);
            tr.commit();
            ss.close();
            return depObj;
        } catch (Exception e) {
        }
        return null;
    }
    public Departments updateDepartments(Departments depObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(depObj);
            tr.commit();
            ss.close();
            return depObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
     public Departments deleteDepartments(Departments depObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(depObj);
            tr.commit();
            ss.close();
            return depObj;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public Departments findDepartmentsById(Departments depObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Departments theDepartments = (Departments) ss.get(Departments.class,depObj.getDepartmentId());
            ss.close();
            return theDepartments;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public List<Departments> retrieveAllDepartments(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Departments> books = ss.createQuery("SELECT depObj FROM Departments depObj ").list();
            ss.close();
            return books;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    } 
}
