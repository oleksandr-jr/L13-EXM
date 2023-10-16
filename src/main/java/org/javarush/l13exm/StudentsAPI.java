package org.javarush.l13exm;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.stream.Collectors;

@WebServlet(name = "StudentsAPI", value = "/api/students")
public class StudentsAPI extends HttpServlet {
    private final StudentsService studentsService = StudentsService.getInstance();
    private static final Gson gson = new Gson();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.getWriter().write(studentsService.findAll().toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentJson = request.getReader()
                .lines()
                .collect(Collectors.joining());

        Student student = gson.fromJson(studentJson, Student.class);

        studentsService.save(student);
    }
}