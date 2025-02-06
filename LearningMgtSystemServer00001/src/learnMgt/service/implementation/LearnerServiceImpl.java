/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.LearnerDao;
import learnMgt.model.Learner;
import learnMgt.service.LearnerService;

/**
 *
 * @author ELOHOME LTD
 */
public class LearnerServiceImpl extends UnicastRemoteObject implements LearnerService{

    public LearnerServiceImpl() throws RemoteException{
    }
    private LearnerDao dao= new LearnerDao();

    @Override
    public Learner saveLearner(Learner learner) throws RemoteException {
        return dao.registerLearner(learner);
    }

    @Override
    public Learner updateLearner(Learner learner) throws RemoteException {
        return dao.updateLearner(learner);
    }

    @Override
    public Learner removeLearner(Learner learner) throws RemoteException {
        return dao.deleteLearner(learner);
    }

    @Override
    public Learner searchLearner(Learner learner) throws RemoteException {
        return dao.findLearnerById(learner);
    }

    @Override
    public List<Learner> findAllLearner() throws RemoteException {
        return dao.retrieveAllLearner();
    }
}
