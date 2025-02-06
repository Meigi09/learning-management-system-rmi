/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.CalendarDao;
import learnMgt.model.Calendar;
import learnMgt.service.CalendarService;

/**
 *
 * @author ELOHOME LTD
 */
public class CalendarServiceImpl extends UnicastRemoteObject implements CalendarService{

    public CalendarServiceImpl() throws RemoteException{
    }

    private CalendarDao dao=new CalendarDao();
            
    @Override
    public Calendar saveCalendar(Calendar calendar) throws RemoteException {
        return dao.registerCalendar(calendar);
    }

    @Override
    public Calendar updateCalendar(Calendar calendar) throws RemoteException {
        return dao.updateCalendar(calendar);
    }

    @Override
    public Calendar removeCalendar(Calendar calendar) throws RemoteException {
        return dao.deleteCalendar(calendar);
    }

    @Override
    public Calendar searchCalendar(Calendar calendar) throws RemoteException {
        return dao.findCalendarById(calendar);
    }

    @Override
    public List<Calendar> findAllCalendar() throws RemoteException {
        return dao.retrieveAllCalendar();
    }
    
}
