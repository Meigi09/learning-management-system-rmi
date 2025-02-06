/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Analytics;

/**
 *
 * @author ELOHOME LTD
 */
public interface AnalyticsService extends Remote{
    Analytics saveAnalytics(Analytics analytics)  throws RemoteException;
    Analytics updateAnalytics(Analytics analytics)  throws RemoteException;
    Analytics removeAnalytics(Analytics analytics)  throws RemoteException;
    Analytics searchAnalytics(Analytics analytics)  throws RemoteException;
    List<Analytics> findAllAnalytics()throws RemoteException;
}
