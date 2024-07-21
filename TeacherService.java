package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean editTeacher(int id, String newName, String newSubject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                if (newName != null) {
                    teacher.setName(newName);
                }
                if (newSubject != null) {
                    teacher.setSubject(newSubject);
                }
                return true;
            }
        }
        return false;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}