/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.GradeBookDao;
import learnMgt.model.Gradebook;
import learnMgt.service.GradebookService;

/**
 *
 * @author ELOHOME LTD
 */
public class GradebookServiceImpl extends UnicastRemoteObject implements GradebookService{

    public GradebookServiceImpl() throws RemoteException{
    }
    private GradeBookDao dao=new GradeBookDao();

    @Override
    public Gradebook saveGradebook(Gradebook gradebook) throws RemoteException {
        return dao.registerGradebook(gradebook);
    }

    @Override
    public Gradebook updateGradebook(Gradebook gradebook) throws RemoteException {
        return dao.updateGradebook(gradebook);
    }

    @Override
    public Gradebook removeGradebook(Gradebook gradebook) throws RemoteException {
        return dao.deleteGradebook(gradebook);
    }

    @Override
    public Gradebook searchGradebook(Gradebook gradebook) throws RemoteException {
        return dao.findGradebookById(gradebook);
    }

    @Override
    public List<Gradebook> findAllGradebook() throws RemoteException {
        return dao.retrieveAllGradebook();
    }
    
}
