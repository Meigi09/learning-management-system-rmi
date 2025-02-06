/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model. Instructor;

/**
 *
 * @author ELOHOME LTD
 */
public interface InstructorService extends Remote{
     Instructor saveInstructor( Instructor instructor)  throws RemoteException;
     Instructor updateInstructor( Instructor instructor)  throws RemoteException;
     Instructor removeInstructor( Instructor instructor)  throws RemoteException;
     Instructor searchInstructor( Instructor instructor)  throws RemoteException;
    List< Instructor> findAllInstructor()throws RemoteException;
}
