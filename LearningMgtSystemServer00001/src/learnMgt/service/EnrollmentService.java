/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model. Enrollment;

/**
 *
 * @author ELOHOME LTD
 */
public interface EnrollmentService extends Remote{
     Enrollment saveEnrollment( Enrollment enrollment)  throws RemoteException;
     Enrollment updateEnrollment( Enrollment enrollment)  throws RemoteException;
     Enrollment removeEnrollment( Enrollment enrollment)  throws RemoteException;
     Enrollment searchEnrollment( Enrollment enrollment)  throws RemoteException;
    List< Enrollment> findAllEnrollment()throws RemoteException;
}
