/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.AssignmentDao;
import learnMgt.model.Assignment;
import learnMgt.service.AssignmentService;

/**
 *
 * @author ELOHOME LTD
 */
public class AssignmentServiceImpl extends UnicastRemoteObject implements AssignmentService{

    public AssignmentServiceImpl() throws RemoteException{
    }

    private AssignmentDao dao=new AssignmentDao();
    @Override
    public Assignment saveAssignment(Assignment assignment) throws RemoteException {
        return dao.registerAssignment(assignment);
    }

    @Override
    public Assignment updateAssignment(Assignment assignment) throws RemoteException {
        return dao.updateAssignment(assignment);
    }

    @Override
    public Assignment removeAssignment(Assignment assignment) throws RemoteException {
        return dao.deleteAssignment(assignment);
    }

    @Override
    public Assignment searchAssignment(Assignment assignment) throws RemoteException {
        return dao.findAssignmentById(assignment);
    }

    @Override
    public List<Assignment> findAllAssignment() throws RemoteException {
        return dao.retrieveAllAssignment();
    }
    
}
