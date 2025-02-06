/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.TokenDao;
import learnMgt.model.Tokens;
import learnMgt.service.TokenService;

/**
 *
 * @author ELOHOME LTD
 */
public class TokenServiceImpl extends UnicastRemoteObject implements TokenService{

    public TokenServiceImpl() throws RemoteException{
    }
    private TokenDao dao=new TokenDao();

    @Override
    public Tokens saveToken(Tokens token) throws RemoteException {
        return dao.registerTokens(token);
    }

    @Override
    public Tokens updateToken(Tokens token) throws RemoteException {
        return dao.updateTokens(token);
    }

    @Override
    public Tokens removeToken(Tokens token) throws RemoteException {
        return dao.deleteTokens(token);
    }

    @Override
    public Tokens searchToken(Tokens token) throws RemoteException {
        return dao.findTokensById(token);
    }

    @Override
    public List<Tokens> findAllTokens() throws RemoteException {
        return dao.retrieveAllTokens();
    }
    
}
