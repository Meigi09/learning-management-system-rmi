/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model. Gradebook;

/**
 *
 * @author ELOHOME LTD
 */
public interface GradebookService extends Remote{
     Gradebook saveGradebook( Gradebook gradebook)  throws RemoteException;
     Gradebook updateGradebook( Gradebook gradebook)  throws RemoteException;
     Gradebook removeGradebook( Gradebook gradebook)  throws RemoteException;
     Gradebook searchGradebook( Gradebook gradebook)  throws RemoteException;
    List< Gradebook> findAllGradebook()throws RemoteException;
}
