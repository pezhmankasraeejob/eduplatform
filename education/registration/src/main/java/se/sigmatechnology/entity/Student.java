package se.sigmatechnology.entity;

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
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public String getEmail() {
        return email;
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
