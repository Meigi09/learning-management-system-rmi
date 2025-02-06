/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Administration;


public interface AdministrationService extends Remote{
    Administration saveAdmin(Administration admin)  throws RemoteException;
    Administration updateAdmin(Administration admin)  throws RemoteException;
    Administration removeAdmin(Administration admin)  throws RemoteException;
    Administration searchAdmin(Administration admin)  throws RemoteException;
    List<Administration> findAllAdmin()throws RemoteException;
}
