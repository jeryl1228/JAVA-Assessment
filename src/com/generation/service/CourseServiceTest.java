package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    CourseService courseService = new CourseService();
    @Test
    public void getCourse(){
        assertEquals(courseService.getCourse("INTRO-WEB-1"), courseService.getCourse("INTRO-WEB-1"));

    }

    @Test
    public void showEnrollStudent()throws ParseException{
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Student student1 = new Student("123", "J", "J@gmail", formatter.parse("12/20/1995"));
        courseService.enrollStudent("INTRO-WEB-1", student1);
        assertTrue(courseService.showEnrolledStudents("INTRO-WEB-1").contains(student1));
    }
}