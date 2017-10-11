package se.sigmatechnology.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.sigmatechnology.entity.Course;
import se.sigmatechnology.entity.Student;
import se.sigmatechnology.registration.service.ServiceRegistration;
;import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pke on 2017-10-10.
 */

@RestController
public class ControllerRegistration {

    @Autowired
    private ServiceRegistration serviceRegistration;


    // Student-related operations
    @RequestMapping("/students")
    public ArrayList<Student> getAllStudents(){
        return serviceRegistration.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/students/{sid}")
    public Student getStudent(@PathVariable("sid") String studentId) {
        return serviceRegistration.getStudent(studentId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student){
        this.serviceRegistration.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public void deleteStudent(@PathVariable("id") String id){
        this.serviceRegistration.deleteStudent(id);
    }

    // Course-related operations
    @RequestMapping("/courses")
    public ArrayList<Course> getAllCourses(){
        return serviceRegistration.getAllCourses();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
    public Course getCourse(@PathVariable("id") String courseId){
        return serviceRegistration.getCourse(courseId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/course/{id}")
    public void deleteCourse(@PathVariable("id") String id) {
        this.serviceRegistration.deleteCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/course")
    public void addCourse(@RequestBody Course course) {
        this.serviceRegistration.addCourse(course);
    }

}
