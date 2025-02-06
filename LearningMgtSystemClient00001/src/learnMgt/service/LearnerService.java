/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model. Learner;

/**
 *
 * @author ELOHOME LTD
 */
public interface LearnerService extends Remote{
     Learner saveLearner( Learner learner)  throws RemoteException;
     Learner updateLearner( Learner learner)  throws RemoteException;
     Learner removeLearner( Learner learner)  throws RemoteException;
     Learner searchLearner( Learner learner)  throws RemoteException;
    List< Learner> findAllLearner()throws RemoteException;
}
