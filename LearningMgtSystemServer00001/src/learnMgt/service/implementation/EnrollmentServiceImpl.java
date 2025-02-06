/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.EnrollmentDao;
import learnMgt.model.Enrollment;
import learnMgt.service.EnrollmentService;

/**
 *
 * @author ELOHOME LTD
 */
public class EnrollmentServiceImpl extends UnicastRemoteObject implements EnrollmentService{

    public EnrollmentServiceImpl() throws RemoteException{
    }
    private EnrollmentDao dao=new EnrollmentDao();

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) throws RemoteException {
        return dao.registerEnrollment(enrollment);
    }

    @Override
    public Enrollment updateEnrollment(Enrollment enrollment) throws RemoteException {
        return dao.updateEnrollment(enrollment);
    }

    @Override
    public Enrollment removeEnrollment(Enrollment enrollment) throws RemoteException {
        return dao.deleteEnrollment(enrollment);
    }

    @Override
    public Enrollment searchEnrollment(Enrollment enrollment) throws RemoteException {
        return dao.findEnrollmentById(enrollment);
    }

    @Override
    public List<Enrollment> findAllEnrollment() throws RemoteException {
        return dao.retrieveAllEnrollment();
    }
    
}
