/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Tokens;

/**
 *
 * @author ELOHOME LTD
 */
public interface TokenService extends Remote {

    Tokens saveToken(Tokens token) throws RemoteException;

    Tokens updateToken(Tokens token) throws RemoteException;

    Tokens removeToken(Tokens token) throws RemoteException;

    Tokens searchToken(Tokens token) throws RemoteException;

    List<Tokens> findAllTokens() throws RemoteException;
}
