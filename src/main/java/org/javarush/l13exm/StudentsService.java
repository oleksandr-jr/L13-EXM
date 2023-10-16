package org.javarush.l13exm;

import java.util.Collection;

public class StudentsService {
    private static StudentsService instance;
    private final StudentsRepository studentsRepository = StudentsRepository.getInstance();

    public static StudentsService getInstance() {
        if (instance == null) {
            instance = new StudentsService();
        }
        return instance;
    }

    public Collection<Student> findAll(){
        return studentsRepository.findAll();
    }

    public void save(Student student){
        studentsRepository.save(student);
    }

    public Student findById(long id){
        return studentsRepository.getById(id).orElse(new Student());
    }

}
