package iradu;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class cookie extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userValue = request.getParameter("userValue");

        
        Cookie cookie = new Cookie("userValue", userValue);
        cookie.setMaxAge(2* 60* 4); 
        response.addCookie(cookie);

        
        response.sendRedirect("cookies.jsp"); 
    }
}