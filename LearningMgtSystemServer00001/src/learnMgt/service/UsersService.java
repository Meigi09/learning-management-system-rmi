/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model. Users;

/**
 *
 * @author ELOHOME LTD
 */
public interface UsersService extends Remote{
     Users saveUsers( Users users)  throws RemoteException;
     Users updateUsers( Users users)  throws RemoteException;
     Users removeUsers( Users users)  throws RemoteException;
     Users searchUsers( Users users)  throws RemoteException;
     
    List< Users> findAllUsers()throws RemoteException;
}
