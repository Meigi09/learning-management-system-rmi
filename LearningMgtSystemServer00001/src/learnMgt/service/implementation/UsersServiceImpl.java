/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.UserDao;
import learnMgt.model.Users;
import learnMgt.service.UsersService;

/**
 *
 * @author ELOHOME LTD
 */
public class UsersServiceImpl extends UnicastRemoteObject implements UsersService{

    public UsersServiceImpl() throws RemoteException{
    }
    private UserDao dao=new UserDao();

    @Override
    public Users saveUsers(Users users) throws RemoteException {
        return dao.registerUser(users);
    }

    @Override
    public Users updateUsers(Users users) throws RemoteException {
        return dao.updateUsers(users);
    }

    @Override
    public Users removeUsers(Users users) throws RemoteException {
        return dao.deleteUser(users);
    }

    @Override
    public Users searchUsers(Users users) throws RemoteException {
        return dao.findUserById(users);
        
    }

    @Override
    public List<Users> findAllUsers() throws RemoteException {
        return dao.retrieveAllUsers();
    }
    
}
