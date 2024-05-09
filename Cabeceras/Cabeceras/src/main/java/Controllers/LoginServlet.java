package Controllers;


import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import service.LoginService;
import service.ToyService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";
    @Inject
    LoginService auth ;
    @Inject
    ToyService service ;
}