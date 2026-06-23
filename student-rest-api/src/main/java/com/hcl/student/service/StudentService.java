package com.hcl.student.service;

import com.hcl.student.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {

    private final Map<Long, Student> students = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student getStudentById(Long id) {
        return students.get(id);
    }

    public Student addStudent(Student student) {
        Long id = idGenerator.getAndIncrement();
        student.setId(id);
        students.put(id, student);
        return student;
    }

    public Student updateStudent(Long id, Student student) {
        if (!students.containsKey(id)) {
            return null;
        }

        student.setId(id);
        students.put(id, student);
        return student;
    }

    public boolean deleteStudent(Long id) {
        return students.remove(id) != null;
    }
}
