package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.TeacherView;

public class TeacherController {
    private TeacherService service;
    private TeacherView view;

    public TeacherController(TeacherService service, TeacherView view) {
        this.service = service;
        this.view = view;
    }

    public void addTeacher(int id, String name, String subject) {
        Teacher teacher = new Teacher(id, name, subject);
        service.addTeacher(teacher);
    }

    public void editTeacher(int id, String newName, String newSubject) {
        if (service.editTeacher(id, newName, newSubject)) {
            System.out.println("Учитель успешно отредактирован");
        } else {
            System.out.println("Учитель с данным ID не найден");
        }
    }

    public void showTeachers() {
        view.showTeachers(service.getTeachers());
    }
}