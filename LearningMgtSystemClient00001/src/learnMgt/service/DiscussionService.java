/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.DiscussionForum;

/**
 *
 * @author ELOHOME LTD
 */
public interface DiscussionService extends Remote{
   DiscussionForum saveDiscussionForum(DiscussionForum discussionForum)  throws RemoteException;
   DiscussionForum updateDiscussionForum(DiscussionForum discussionForum)  throws RemoteException;
   DiscussionForum removeDiscussionForum(DiscussionForum discussionForum)  throws RemoteException;
   DiscussionForum searchDiscussionForum(DiscussionForum discussionForum)  throws RemoteException;
    List<DiscussionForum> findAllDiscussionForum()throws RemoteException;
}
