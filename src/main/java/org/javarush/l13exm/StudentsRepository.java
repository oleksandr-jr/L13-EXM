package org.javarush.l13exm;


import java.util.*;

public class StudentsRepository {
    private static StudentsRepository instance;

    public static StudentsRepository getInstance() {
        if (instance == null) {
            instance = new StudentsRepository();
        }
        return instance;
    }

    private HashMap<Long, Student> students = new HashMap<>() {{
                put(1L, Student.builder().id(1L).firstName("John").lastName("Smith").email("test@gmail.com").build());
                put(2L, Student.builder().id(2L).firstName("Mary").lastName("Brown").email("test2@gmai.com").build());
            }};

    public Optional<Student> getById(long id) {
        return Optional.ofNullable(students.get(id));
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    public void save(Student student) {
        students.put(student.getId(), student);
    }

    public void remove(long id) {
        students.remove(id);
    }

    public boolean isPresent(long id) {
        return students.containsKey(id);
    }

    public boolean isPresent(Student student) {
        return students.containsKey(student.getId());
    }

}
