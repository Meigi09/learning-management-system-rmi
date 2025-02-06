/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.DepartmentDao;
import learnMgt.model.Departments;
import learnMgt.service.DepartmentService;

/**
 *
 * @author ELOHOME LTD
 */
public class DepartmentServiceImpl extends UnicastRemoteObject implements DepartmentService{

    public DepartmentServiceImpl() throws RemoteException{
    }
    private DepartmentDao dao=new DepartmentDao();

    @Override
    public Departments saveDepartment(Departments department) throws RemoteException {
        return dao.registerDepartments(department);
    }

    @Override
    public Departments updateDepartment(Departments department) throws RemoteException {
        return dao.updateDepartments(department);
    }

    @Override
    public Departments removeDepartment(Departments department) throws RemoteException {
        return dao.deleteDepartments(department);
    }

    @Override
    public Departments searchDepartment(Departments department) throws RemoteException {
        return dao.findDepartmentsById(department);
    }

    @Override
    public List<Departments> findAllDepartments() throws RemoteException {
        return dao.retrieveAllDepartments();
    }
    
}
