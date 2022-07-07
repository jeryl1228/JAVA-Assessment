package com.generation.service;
import com.generation.model.Student;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    StudentService studentService = new StudentService();

    @Test
    public void isSubscribed() {
        assertFalse(studentService.isSubscribed("1234"));
    }

    @Test
    public void findStudent()throws ParseException{
            DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            Student student1 = new Student("123", "J", "J@gmail", formatter.parse("12/20/1995"));
            studentService.subscribeStudent(student1);
            assertEquals(student1, studentService.findStudent("123"));
        }
    }
