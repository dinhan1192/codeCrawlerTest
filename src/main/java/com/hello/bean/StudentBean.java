package com.hello.bean;

import com.hello.enitity.Student;
import com.hello.service.StudentService;
import com.sun.istack.Nullable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "myStudentBean")
@SessionScoped
public class StudentBean {

    @ManagedProperty(value = "#{myStudentService}")
    private StudentService studentService;

    @ManagedProperty(value = "#{student}")
    private Student student;

    private String[] favourites;
    private String[] sports;

    private long _id = 0;

    public String saveStudent() {
        student.setFavourites(String.join(", ", favourites));
        student.setSports(String.join(", ", sports));
        if(_id == 0) {
            studentService.create(student);
        } else{
            studentService.update(student);
            _id = 0;
        }
        student = new Student();
        return "listStudent?faces-redirect=true";
    }

    public String edit(long id) {
        _id = id;
        student = studentService.findById(id);
        if (student == null) {
            return "not-found";
        }
        this.favourites = student.getFavourites().split(", ");
        this.sports = student.getSports().split(", ");
        return "createStudent?faces-redirect=true";
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getFavourites() {
        return favourites;
    }

    public void setFavourites(String[] favourites) {
        this.favourites = favourites;
    }

    public String[] getSports() {
        return sports;
    }

    public void setSports(String[] sports) {
        this.sports = sports;
    }
}
