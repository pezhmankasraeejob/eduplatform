package se.sigmatechnology.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.sigmatechnology.entity.Student;
import se.sigmatechnology.registration.service.ServiceStudentRegistration;

import java.util.ArrayList;

/**
 * Created by pke on 2017-10-10.
 */

@RestController
public class ControllerStudentRegistration {

    @Autowired
    private ServiceStudentRegistration serviceStudentRegistration;


    // Student-related operations
    @RequestMapping("/students")
    public ArrayList<Student> getAllStudents() {
        return serviceStudentRegistration.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/students/{sid}")
    public Student getStudent(@PathVariable("sid") String studentId) {
        return serviceStudentRegistration.getStudent(studentId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student) {
        this.serviceStudentRegistration.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public void deleteStudent(@PathVariable("id") String id) {
        this.serviceStudentRegistration.deleteStudent(id);
    }
}
