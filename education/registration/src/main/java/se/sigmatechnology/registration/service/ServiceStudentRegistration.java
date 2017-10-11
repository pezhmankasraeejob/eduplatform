package se.sigmatechnology.registration.service;

import org.springframework.stereotype.Service;
import se.sigmatechnology.entity.Course;
import se.sigmatechnology.entity.Student;

import java.util.*;

/**
 * Created by pke on 2017-10-10.
 */

@Service
public class ServiceStudentRegistration {

    ArrayList<Student> studentArrayList = new ArrayList<Student>();

    public ServiceStudentRegistration() {
        Student studentA = new Student
                .StudentBuilder("jd19661009-1234",
                "John Doe",
                "john.doe@sigma.se")
                .setFieldOfStudy("Maths")
                .build();

        Student studentB = new Student
                .StudentBuilder("ah19761022-4321",
                "Alice Hamilton",
                "alice.hamilton@sigma.se")
                .setFieldOfStudy("Phsyics")
                .build();

        Student studentC = new Student
                .StudentBuilder("rd19861109-0987",
                "Ruddy Donson",
                "ruddy.donson@sigma.se")
                .setFieldOfStudy("Astronomy")
                .build();

        this.studentArrayList.add(studentA);
        this.studentArrayList.add(studentB);
        this.studentArrayList.add(studentC);
    }

    // Student-related services
    public ArrayList<Student> getAllStudents() {
        return this.studentArrayList;
    }

    public Student getStudent(String studentId) {
        Student answer = new Student.StudentBuilder("xx00000000-0000",
                "xx",
                "xx@x.x")
                .build();

        for (Student tempStudent : studentArrayList) {
            if (tempStudent.getId().equals(studentId)) {
                answer.setId(tempStudent.getId());
                answer.setFullName(tempStudent.getFullName());
                answer.setPlaceOfBirth(tempStudent.getPlaceOfBirth());
                answer.setFieldOfStudy(tempStudent.getFieldOfStudy());
                answer.setBirthDate(tempStudent.getBirthDate());
                answer.setEmail(tempStudent.getEmail());
            }
        }
        return answer;
    }

    public void addStudent(Student student) {
        this.studentArrayList.add(student);
    }

    public void deleteStudent(String id) {
        this.studentArrayList.removeIf(t -> t.getId().equals(id));
    }
}
