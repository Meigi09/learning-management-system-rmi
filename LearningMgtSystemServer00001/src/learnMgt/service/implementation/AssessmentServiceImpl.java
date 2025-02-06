/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.AssessmentDao;
import learnMgt.model.Assessment;
import learnMgt.service.AssessmentService;

/**
 *
 * @author ELOHOME LTD
 */
public class AssessmentServiceImpl extends UnicastRemoteObject implements AssessmentService{

    public AssessmentServiceImpl() throws RemoteException{
    }

    private AssessmentDao dao=new AssessmentDao();
    @Override
    public Assessment saveAssessment(Assessment assessment) throws RemoteException {
        return dao.registerAssessment(assessment);
    }

    @Override
    public Assessment updateAssessment(Assessment assessment) throws RemoteException {
        return dao.updateAssessment(assessment);
    }

    @Override
    public Assessment removeAssessment(Assessment assessment) throws RemoteException {
        return dao.deleteAssessment(assessment);
    }

    @Override
    public Assessment searchAssessment(Assessment assessment) throws RemoteException {
        return dao.findAssessmentById(assessment);
    }

    @Override
    public List<Assessment> findAllAssessment() throws RemoteException {
        return dao.retrieveAllAssessment();
    }
    
    
}
