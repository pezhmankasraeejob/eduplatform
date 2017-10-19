package se.sigmatechnology.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.sigmatechnology.registration.dao.CourseRepository;
import se.sigmatechnology.registration.entity.Course;
import se.sigmatechnology.registration.entity.Student;

import java.util.*;

/**
 * Created by pke on 2017-10-10.
 */

@Service
public class ServiceCourseRegistration {

    @Autowired
    private CourseRepository courseRepository;

    public ServiceCourseRegistration() {

    }

    // Course-related services
    public ArrayList<Course> getAllCourses() {
        ArrayList<Course> courses = new ArrayList<>();

        this.courseRepository.findAll()
        .forEach(courses::add);

        return courses;
    }

    public void addCourse(Course course) {
        this.courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        this.courseRepository.save(course);
    }

    public void deleteCourse(String courseId){
        this.courseRepository.delete(courseId);
    }
}
