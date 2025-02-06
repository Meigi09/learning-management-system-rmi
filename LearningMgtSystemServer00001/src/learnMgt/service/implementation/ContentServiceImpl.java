/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.ContentDao;
import learnMgt.model.Content;
import learnMgt.service.ContentService;

/**
 *
 * @author ELOHOME LTD
 */
public class ContentServiceImpl extends UnicastRemoteObject implements ContentService{

    public ContentServiceImpl() throws RemoteException{
    }

    private ContentDao dao=new ContentDao();
    @Override
    public Content saveContent(Content content) throws RemoteException {
        return dao.registerContent(content);
    }

    @Override
    public Content updateContent(Content content) throws RemoteException {
        return dao.updateContent(content);
    }

    @Override
    public Content removeContent(Content content) throws RemoteException {
        return dao.deleteContent(content);
    }

    @Override
    public Content searchContent(Content content) throws RemoteException {
        return dao.findContentById(content);
    }

    @Override
    public List<Content> findAllContent() throws RemoteException {
        return dao.retrieveAllContent();
    }
    
}
