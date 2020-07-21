package com.hello.service;

import com.hello.dao.AccountDao;
import com.hello.dao.StudentDao;
import com.hello.enitity.Account;
import com.hello.enitity.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@ManagedBean(name = "myStudentService")
@SessionScoped
public class StudentService {

    @ManagedProperty(value = "#{myStudentDao}")
    private StudentDao studentDao;

    public void create(Student student) {
        student.setId(Calendar.getInstance().getTimeInMillis());
        student.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        student.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        studentDao.insertStudent(student);
    }

    public void update(Student student) {
        student.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        studentDao.updateStudent(student);
    }

    public List<Student> getList() {
        return studentDao.getAllStudents();
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student findById(long id) {
        return studentDao.findById(id);
    }
}
