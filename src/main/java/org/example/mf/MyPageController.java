package org.example.mf;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;

@WebServlet(value = "/mypage")
@Log4j2
public class MyPageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if(session.getAttribute("cart") == null){
            resp.sendRedirect("/movies");
            return;
        }

        req.getRequestDispatcher("/WEB-INF/mypage.jsp").forward(req, resp);



    }
}
