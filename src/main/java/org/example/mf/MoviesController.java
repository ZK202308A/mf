package org.example.mf;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/movies")
@Log4j2
public class MoviesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("m1.jpg");
        movies.add("m2.jpg");
        movies.add("m3.jpg");
        movies.add("m4.jpg");
        movies.add("m5.jpg");

        req.setAttribute("movies", movies);
        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
    }
}
