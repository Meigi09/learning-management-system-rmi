/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Departments;

/**
 *
 * @author ELOHOME LTD
 */
public interface DepartmentService extends Remote {

    Departments saveDepartment(Departments department) throws RemoteException;

    Departments updateDepartment(Departments department) throws RemoteException;

    Departments removeDepartment(Departments department) throws RemoteException;

    Departments searchDepartment(Departments department) throws RemoteException;

    List<Departments> findAllDepartments() throws RemoteException;
}
