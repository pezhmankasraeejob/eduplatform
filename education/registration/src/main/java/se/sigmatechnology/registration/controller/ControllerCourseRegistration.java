package se.sigmatechnology.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.sigmatechnology.registration.entity.Course;
import se.sigmatechnology.registration.entity.Student;
import se.sigmatechnology.registration.service.ServiceCourseRegistration;

import java.util.ArrayList;

/**
 * Created by pke on 2017-10-10.
 */

@RestController
public class ControllerCourseRegistration {

    @Autowired
    private ServiceCourseRegistration serviceCourseRegistration;

    // GET
    @RequestMapping("/courses")
    public ArrayList<Course> getAllCourses(){
        return serviceCourseRegistration.getAllCourses();
    }

    // POST
    @RequestMapping("/course")
    public void addCourse(@RequestBody Course course){
        this.serviceCourseRegistration.addCourse(course);
    }

    // PUT
    @RequestMapping(value = "/course", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course){
        this.serviceCourseRegistration.updateCourse(course);
    }

    @RequestMapping(value = "/course/{courseId}", method = RequestMethod.PUT)
    public void addStudentsToCourse(@PathVariable("courseId") String courseId){
        Course course = new Course.CourseBuilder(courseId)
                .build();

        this.serviceCourseRegistration.addCourse(course);
    }


    // DELETE
    @RequestMapping(value = "/course/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable("id") String courseId){
        this.serviceCourseRegistration.deleteCourse(courseId);
    }

}
