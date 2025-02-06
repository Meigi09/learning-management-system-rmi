/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Content;

/**
 *
 * @author ELOHOME LTD
 */
public interface ContentService extends Remote{
    Content saveContent(Content content)  throws RemoteException;
    Content updateContent(Content content)  throws RemoteException;
    Content removeContent(Content content)  throws RemoteException;
    Content searchContent(Content content)  throws RemoteException;
    List<Content> findAllContent()throws RemoteException;
}
