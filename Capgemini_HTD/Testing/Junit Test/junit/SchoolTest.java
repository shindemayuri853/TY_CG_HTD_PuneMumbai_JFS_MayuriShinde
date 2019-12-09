package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {
private School school;

@BeforeEach
public void creatObject() {
	school = new School();
}

@Test
public void testRegisterStudent() {
	Student student = new Student("Dimple", 85.2,"F");
	Student stu = school.registerStudent(student);
	assertEquals(1, stu.getId());
}// end of testRegisterStudent()

@Test
public void testRegisterStudentNull() {
	assertThrows(NullPointerException.class, ()-> school.registerStudent(null));
}
}// end of test
