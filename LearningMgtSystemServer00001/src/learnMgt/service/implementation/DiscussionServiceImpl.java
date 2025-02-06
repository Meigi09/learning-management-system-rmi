/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.DiscussionDao;
import learnMgt.model.DiscussionForum;
import learnMgt.service.DiscussionService;

/**
 *
 * @author ELOHOME LTD
 */
public class DiscussionServiceImpl extends UnicastRemoteObject implements DiscussionService{

    public DiscussionServiceImpl() throws RemoteException{
    }
    private DiscussionDao dao=new DiscussionDao();

    @Override
    public DiscussionForum saveDiscussionForum(DiscussionForum discussionForum) throws RemoteException {
        return dao.registerDiscussion(discussionForum);
    }

    @Override
    public DiscussionForum updateDiscussionForum(DiscussionForum discussionForum) throws RemoteException {
        return dao.updateDiscussion(discussionForum);
    }

    @Override
    public DiscussionForum removeDiscussionForum(DiscussionForum discussionForum) throws RemoteException {
        return dao.deleteDiscussion(discussionForum);
    }

    @Override
    public DiscussionForum searchDiscussionForum(DiscussionForum discussionForum) throws RemoteException {
        return dao.findDiscussionById(discussionForum);
    }

    @Override
    public List<DiscussionForum> findAllDiscussionForum() throws RemoteException {
        return dao.retrieveAllDiscussion();
    }
    
}
