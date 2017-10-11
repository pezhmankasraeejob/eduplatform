package se.sigmatechnology.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.sigmatechnology.entity.Course;
import se.sigmatechnology.registration.service.ServiceCourseRegistration;

import java.util.ArrayList;

/**
 * Created by pke on 2017-10-10.
 */

@RestController
public class ControllerCourseRegistration {

    @Autowired
    private ServiceCourseRegistration serviceCourseRegistration;

    // Course-related operations
    @RequestMapping("/courses")
    public ArrayList<Course> getAllCourses(){
        return serviceCourseRegistration.getAllCourses();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
    public Course getCourse(@PathVariable("id") String courseId){
        return serviceCourseRegistration.getCourse(courseId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/course/{id}")
    public void deleteCourse(@PathVariable("id") String id) {
        this.serviceCourseRegistration.deleteCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/course")
    public void addCourse(@RequestBody Course course) {
        this.serviceCourseRegistration.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/course")
    public void updateCourse(@RequestBody Course course){
        this.serviceCourseRegistration.updateCourse(course);
    }
}
