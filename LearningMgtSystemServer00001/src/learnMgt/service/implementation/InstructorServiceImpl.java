/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.InstructorDao;
import learnMgt.model.Instructor;
import learnMgt.service.InstructorService;

/**
 *
 * @author ELOHOME LTD
 */
public class InstructorServiceImpl extends UnicastRemoteObject implements InstructorService {

    public InstructorServiceImpl() throws RemoteException{
    }
    private InstructorDao dao=new InstructorDao();

    @Override
    public Instructor saveInstructor(Instructor instructor) throws RemoteException {
        return dao.registerInstructor(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) throws RemoteException {
        return dao.updateInstructor(instructor);
    }

    @Override
    public Instructor removeInstructor(Instructor instructor) throws RemoteException {
        return dao.deleteInstructor(instructor);
    }

    @Override
    public Instructor searchInstructor(Instructor instructor) throws RemoteException {
        return dao.findInstructorById(instructor);
    }

    @Override
    public List<Instructor> findAllInstructor() throws RemoteException {
        return dao.retrieveAllInstructor();
    }
}
