/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Courses;

/**
 *
 * @author ELOHOME LTD
 */
public interface CoursesService extends Remote{
    Courses saveCourses(Courses courses)  throws RemoteException;
    Courses updateCourses(Courses courses)  throws RemoteException;
    Courses removeCourses(Courses courses)  throws RemoteException;
    Courses searchCourses(Courses courses)  throws RemoteException;
    List<Courses> findAllCourses()throws RemoteException;
}
