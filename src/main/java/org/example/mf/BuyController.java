package org.example.mf;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/buy")
@Log4j2
public class BuyController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //내가 구매하기로 한 영화 정보들을 수집
        String[] items = req.getParameterValues("item");

        if(items == null || items.length == 0){
            resp.sendRedirect("/movies");
            return;
        }

        HttpSession session = req.getSession(false);



        //로그인된 사용자
        Object cartObj = session.getAttribute("cart");

        if(cartObj == null){
           ArrayList<String> cartItems = new ArrayList<>();
            for (int i = 0; i < items.length; i++) {
                cartItems.add(items[i]);
            }
            session.setAttribute("cart", cartItems);

        }else {
            ArrayList<String> cartItems = (ArrayList<String>) cartObj;
            for (int i = 0; i < items.length; i++) {
                cartItems.add(items[i]);
            }
        }
        //
        resp.sendRedirect("/mypage");

    }
}
