/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import learnMgt.dao.QuestionDao;
import learnMgt.model.Questions;
import learnMgt.service.QuestionService;

/**
 *
 * @author ELOHOME LTD
 */
public class QuestionServiceImpl extends UnicastRemoteObject implements QuestionService{

    public QuestionServiceImpl() throws RemoteException{
    }
    private QuestionDao dao=new QuestionDao();

    @Override
    public Questions saveQuestions(Questions questions) throws RemoteException {
        return dao.registerQuestions(questions);
    }

    @Override
    public Questions updateQuestions(Questions questions) throws RemoteException {
        return dao.updateQuestions(questions);
    }

    @Override
    public Questions removeQuestions(Questions questions) throws RemoteException {
        return dao.deleteQuestions(questions);
    }

    @Override
    public Questions searchQuestions(Questions questions) throws RemoteException {
        return dao.findQuestionsById(questions);
    }

    @Override
    public List<Questions> findAllQuestions() throws RemoteException {
        return dao.retrieveAllQuestions();
    }
}
