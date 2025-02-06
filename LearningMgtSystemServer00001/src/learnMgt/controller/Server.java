/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import learnMgt.service.implementation.AdministrationServiceImpl;
import learnMgt.service.implementation.AnalyticsServiceImpl;
import learnMgt.service.implementation.AssessmentServiceImpl;
import learnMgt.service.implementation.AssignmentServiceImpl;
import learnMgt.service.implementation.CalendarServiceImpl;
import learnMgt.service.implementation.ContentServiceImpl;
import learnMgt.service.implementation.CoursesServiceImpl;
import learnMgt.service.implementation.DepartmentServiceImpl;
import learnMgt.service.implementation.DiscussionServiceImpl;
import learnMgt.service.implementation.EnrollmentServiceImpl;
import learnMgt.service.implementation.GradebookServiceImpl;
import learnMgt.service.implementation.InstructorServiceImpl;
import learnMgt.service.implementation.LearnerServiceImpl;
import learnMgt.service.implementation.PostServiceImpl;
import learnMgt.service.implementation.QuestionServiceImpl;
import learnMgt.service.implementation.TokenServiceImpl;
import learnMgt.service.implementation.UsersServiceImpl;


public class Server {

    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(5000);
            theRegistry.rebind("administration", new AdministrationServiceImpl());
            theRegistry.rebind("analytics", new AnalyticsServiceImpl());
            theRegistry.rebind("assessment", new AssessmentServiceImpl());
            theRegistry.rebind("assignment", new AssignmentServiceImpl());
            theRegistry.rebind("calendar", new CalendarServiceImpl());
            theRegistry.rebind("content", new ContentServiceImpl());
            theRegistry.rebind("courses", new CoursesServiceImpl());
            theRegistry.rebind("department", new DepartmentServiceImpl());
            theRegistry.rebind("discusion", new DiscussionServiceImpl());
            theRegistry.rebind("enrollment", new EnrollmentServiceImpl());
            theRegistry.rebind("gradebook", new GradebookServiceImpl());
            theRegistry.rebind("instructor", new InstructorServiceImpl());
            theRegistry.rebind("learner", new LearnerServiceImpl());
            theRegistry.rebind("post", new PostServiceImpl());
            theRegistry.rebind("question", new QuestionServiceImpl());
            theRegistry.rebind("token", new TokenServiceImpl());
            theRegistry.rebind("user", new UsersServiceImpl());
            System.out.println("Server is running on port 5000");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
