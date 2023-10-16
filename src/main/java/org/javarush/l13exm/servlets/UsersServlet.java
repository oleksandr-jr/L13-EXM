package org.javarush.l13exm.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.javarush.l13exm.repository.User;
import org.javarush.l13exm.repository.UserRepository;

import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "UsersServlet", value = "/users")
public class UsersServlet extends HttpServlet {
    UserRepository userRepository = UserRepository.getInstance();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/users.jsp");

        Collection<User> users = userRepository.getAll();

        request.setAttribute("usersCollection", users);

        dispatcher.forward(request, response);
    }

}
