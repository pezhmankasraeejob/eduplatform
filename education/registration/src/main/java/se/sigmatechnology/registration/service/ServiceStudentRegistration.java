package se.sigmatechnology.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.sigmatechnology.registration.dao.StudentRepository;
import se.sigmatechnology.registration.entity.Student;

import java.util.*;

/**
 * Created by pke on 2017-10-10.
 */

@Service
public class ServiceStudentRegistration {

    @Autowired
    private StudentRepository studentRepository;

    public ServiceStudentRegistration() {

    }

    // Student-related services
    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();

        this.studentRepository.findAll()
                .forEach(students::add);

        return students;
    }

    public void addStudent(Student student) {
        this.studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        this.studentRepository.delete(id);
    }

    public void updateStudent(Student student) {
        this.studentRepository.save(student);
    }
}
