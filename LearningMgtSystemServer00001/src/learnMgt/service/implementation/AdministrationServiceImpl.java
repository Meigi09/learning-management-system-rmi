/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.AdministrationDao;
import learnMgt.model.Administration;
import learnMgt.service.AdministrationService;

/**
 *
 * @author ELOHOME LTD
 */
public class AdministrationServiceImpl extends UnicastRemoteObject implements AdministrationService{

    public AdministrationServiceImpl() throws RemoteException{
    }   

    private AdministrationDao dao=new AdministrationDao();
    @Override
    public Administration saveAdmin(Administration admin) throws RemoteException {
        return dao.registerAdministration(admin);
    }

    @Override
    public Administration updateAdmin(Administration admin) throws RemoteException {
        return dao.updateAdministration(admin);
    }

    @Override
    public Administration removeAdmin(Administration admin) throws RemoteException {
        return dao.deleteAdministration(admin);
    }

    @Override
    public Administration searchAdmin(Administration admin) throws RemoteException {
        return dao.findAdministrationById(admin);
    }

    @Override
    public List<Administration> findAllAdmin() throws RemoteException {
        return dao.retrieveAllAdministration();
    }
    
}
