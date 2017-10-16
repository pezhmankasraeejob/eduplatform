package se.sigmatechnology.registration.entity;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by pke on 2017-10-10.
 */
public class StudentTest {

    private static Student student;

    @BeforeClass
    public static void prepareTest(){
        student = new Student
                .StudentBuilder("Id76JD", "John Doe", "jd@sigma.se")
                .setFieldOfStudy("Maths")
                .build();
    }

    @Test
    public void testGettersSetters(){
        Assert.assertEquals("Id76JD", student.getId());

        Assert.assertEquals("Maths", student.getFieldOfStudy());

        Assert.assertEquals("jd@sigma.se", student.getEmail());
    }

}
