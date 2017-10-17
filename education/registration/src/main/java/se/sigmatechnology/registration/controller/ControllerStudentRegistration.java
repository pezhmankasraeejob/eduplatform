package se.sigmatechnology.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.sigmatechnology.registration.entity.Student;
import se.sigmatechnology.registration.service.ServiceStudentRegistration;

import java.util.ArrayList;

/**
 * Created by pke on 2017-10-10.
 */

@RestController
public class ControllerStudentRegistration {

    @Autowired
    private ServiceStudentRegistration serviceStudentRegistration;

    @RequestMapping(value = "/students")
    public ArrayList<Student> getAllStudents(){
        return this.serviceStudentRegistration.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student){
        this.serviceStudentRegistration.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student")
    public void updateStudent(@RequestBody Student student){
        this.serviceStudentRegistration.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public void deleteStudent(@PathVariable("id") String studentId){
        this.serviceStudentRegistration.deleteStudent(studentId);
    }
}