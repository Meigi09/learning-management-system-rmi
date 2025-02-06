/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Assignment;

/**
 *
 * @author ELOHOME LTD
 */
public interface AssignmentService extends Remote{
    Assignment saveAssignment(Assignment assignment)  throws RemoteException;
    Assignment updateAssignment(Assignment assignment)  throws RemoteException;
    Assignment removeAssignment(Assignment assignment)  throws RemoteException;
    Assignment searchAssignment(Assignment assignment)  throws RemoteException;
    List<Assignment> findAllAssignment()throws RemoteException;
}
