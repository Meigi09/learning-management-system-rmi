/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import learnMgt.model.Questions;

/**
 *
 * @author ELOHOME LTD
 */
public interface QuestionService extends Remote{
    Questions saveQuestions(Questions questions)  throws RemoteException;
    Questions updateQuestions(Questions questions)  throws RemoteException;
    Questions removeQuestions(Questions questions)  throws RemoteException;
    Questions searchQuestions(Questions questions)  throws RemoteException;
    List<Questions> findAllQuestions()throws RemoteException;
}
