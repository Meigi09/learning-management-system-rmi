/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.CoursesDao;
import learnMgt.model.Courses;
import learnMgt.service.CoursesService;

/**
 *
 * @author ELOHOME LTD
 */
public class CoursesServiceImpl extends UnicastRemoteObject implements CoursesService{

    public CoursesServiceImpl() throws RemoteException{
    }
    private CoursesDao dao=new CoursesDao();

    @Override
    public Courses saveCourses(Courses courses) throws RemoteException {
        return dao.registerCourses(courses);
    }

    @Override
    public Courses updateCourses(Courses courses) throws RemoteException {
        return dao.updateCourses(courses);
    }

    @Override
    public Courses removeCourses(Courses courses) throws RemoteException {
        return dao.deleteCourses(courses);
    }

    @Override
    public Courses searchCourses(Courses courses) throws RemoteException {
        return dao.findCoursesById(courses);
    }

    @Override
    public List<Courses> findAllCourses() throws RemoteException {
        return dao.retrieveAllCourses();
    }
}
