/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.AnalyticsDao;
import learnMgt.model.Analytics;
import learnMgt.service.AnalyticsService;

/**
 *
 * @author ELOHOME LTD
 */
public class AnalyticsServiceImpl extends UnicastRemoteObject implements AnalyticsService{

    public AnalyticsServiceImpl() throws RemoteException{
    }

    private AnalyticsDao dao=new AnalyticsDao();
            
    @Override
    public Analytics saveAnalytics(Analytics analytics) throws RemoteException {
        return dao.registerAnalytics(analytics);
    }

    @Override
    public Analytics updateAnalytics(Analytics analytics) throws RemoteException {
        return dao.updateAnalytics(analytics);
    }

    @Override
    public Analytics removeAnalytics(Analytics analytics) throws RemoteException {
        return dao.deleteAnalytics(analytics);
    }

    @Override
    public Analytics searchAnalytics(Analytics analytics) throws RemoteException {
        return dao.findAnalyticsById(analytics);
    }

    @Override
    public List<Analytics> findAllAnalytics() throws RemoteException {
        return dao.retrieveAllAnalytics();
    }
    
}
