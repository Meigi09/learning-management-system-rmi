/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.PostDao;
import learnMgt.model.Post;
import learnMgt.service.PostService;

/**
 *
 * @author ELOHOME LTD
 */
public class PostServiceImpl extends UnicastRemoteObject implements PostService{

    public PostServiceImpl() throws RemoteException{
    }
    private PostDao dao=new PostDao();

    @Override
    public Post savePost(Post post) throws RemoteException {
        return dao.registerPost(post);
    }

    @Override
    public Post updatePost(Post post) throws RemoteException {
        return dao.updatePost(post);
    }

    @Override
    public Post removePost(Post post) throws RemoteException {
        return dao.deletePost(post);
    }

    @Override
    public Post searchPost(Post post) throws RemoteException {
        return dao.findPostById(post);
    }

    @Override
    public List<Post> findAllPost() throws RemoteException {
        return dao.retrieveAllPost();
    }
}
