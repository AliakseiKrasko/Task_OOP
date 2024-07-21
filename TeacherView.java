package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

import java.util.List;

public class TeacherView {
    public void showTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void showTeacher(Teacher teacher) {
        System.out.println(teacher);
    }
}