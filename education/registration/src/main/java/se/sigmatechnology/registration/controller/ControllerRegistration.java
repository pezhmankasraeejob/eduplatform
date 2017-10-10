package se.sigmatechnology.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(method = RequestMethod.GET, value = "/students/{sid}")
    public Student getStudent(@PathVariable("sid") String studentId) {
        return serviceRegistration.getStudent(studentId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
    public Course getCourse(@PathVariable("id") String courseId){
        return serviceRegistration.getCourse(courseId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student){
        this.serviceRegistration.addStudent(student);
    }
}
