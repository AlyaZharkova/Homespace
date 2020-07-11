package example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        try {
            if (username.isEmpty()) {
                RequestDispatcher req = request.getRequestDispatcher("invalidLogin.jsp");
                req.include(request, response);
            } else {
                RequestDispatcher req = request.getRequestDispatcher("productsPage.jsp");
                req.forward(request, response);
            }
        } catch (ServletException e) {
            System.out.println("Error Servlet");
        } catch (IOException e) {
            System.out.println("Error IOE");
            ;
        }
    }
}