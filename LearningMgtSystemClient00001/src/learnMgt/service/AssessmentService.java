/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Assessment;

/**
 *
 * @author ELOHOME LTD
 */
public interface AssessmentService extends Remote{
    Assessment saveAssessment(Assessment assessment)  throws RemoteException;
    Assessment updateAssessment(Assessment assessment)  throws RemoteException;
    Assessment removeAssessment(Assessment assessment)  throws RemoteException;
    Assessment searchAssessment(Assessment assessment)  throws RemoteException;
    List<Assessment> findAllAssessment()throws RemoteException;
}
