/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Calendar;

/**
 *
 * @author ELOHOME LTD
 */
public interface CalendarService extends Remote{
    Calendar saveCalendar(Calendar calendar)  throws RemoteException;
    Calendar updateCalendar(Calendar calendar)  throws RemoteException;
    Calendar removeCalendar(Calendar calendar)  throws RemoteException;
    Calendar searchCalendar(Calendar calendar)  throws RemoteException;
    List<Calendar> findAllCalendar()throws RemoteException;
}
