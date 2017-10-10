package se.sigmatechnology.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.sigmatechnology.entity.Course;
import se.sigmatechnology.entity.Student;
import se.sigmatechnology.registration.service.ServiceRegistration;
;import java.util.ArrayList;
import java.util.List;

/**
 * Created by pke on 2017-10-10.
 */

@RestController
public class ControllerRegistration {

    @Autowired
    private ServiceRegistration serviceRegistration;

    @RequestMapping("/students")
    public ArrayList<Student> getAllStudents(){
        return serviceRegistration.getAllStudents();
    }

    @RequestMapping("/courses")
    public ArrayList<Course> getAllCourses(){
        return serviceRegistration.getAllCourses();
    }
}
