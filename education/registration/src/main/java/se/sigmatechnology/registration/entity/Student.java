package se.sigmatechnology.registration.entity;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by pke on 2017-10-10.
 */
public class Student {
    @NotNull
    private String id;
    @NotNull
    private String fullName;
    private Date birthDate;
    private String placeOfBirth;
    private String fieldOfStudy;
    @NotNull
    private String email;

    public Student(){
        // default Constructor
    }

    private Student(final String id, final String fullName, final String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    private Student(String id, String fullName, Date birthDate, String placeOfBirth, String fieldOfStudy, String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.placeOfBirth = placeOfBirth;
        this.fieldOfStudy = fieldOfStudy;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public String getFieldOfStudy() {
        return this.fieldOfStudy;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class StudentBuilder{
        private String nestedId;
        private String nestedFullName;
        private Date nestedBirthDate;
        private String nestedPlaceOfBirth;
        private String nestedFieldOfStudy;
        private String nestedEmail;

        public StudentBuilder(final String studentId, final String fullName, final String email) {
            this.nestedId = studentId;
            this.nestedFullName = fullName;
            this.nestedBirthDate = new Date();
            this.nestedPlaceOfBirth = "";
            this.nestedFieldOfStudy = "";
            this.nestedEmail = email;
        }

        public StudentBuilder setBirthDate(Date nestedBirthDate) {
            this.nestedBirthDate = nestedBirthDate;
            return this;
        }

        public StudentBuilder setPlaceOfBirth(String nestedPlaceOfBirth) {
            this.nestedPlaceOfBirth = nestedPlaceOfBirth;
            return this;
        }

        public StudentBuilder setFieldOfStudy(String nestedFieldOfStudy) {
            this.nestedFieldOfStudy = nestedFieldOfStudy;
            return this;
        }

        public Student build(){
            return new Student(nestedId,
                    nestedFullName,
                    nestedBirthDate,
                    nestedPlaceOfBirth,
                    nestedFieldOfStudy,
                    nestedEmail);
        }
    }
}
