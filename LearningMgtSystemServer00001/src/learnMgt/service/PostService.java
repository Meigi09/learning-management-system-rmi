/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model. Post;

/**
 *
 * @author ELOHOME LTD
 */
public interface PostService extends Remote{
     Post savePost( Post post)  throws RemoteException;
     Post updatePost( Post post)  throws RemoteException;
     Post removePost( Post post)  throws RemoteException;
     Post searchPost( Post post)  throws RemoteException;
    List< Post> findAllPost()throws RemoteException;
}
