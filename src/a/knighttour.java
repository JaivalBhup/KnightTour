package a;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/knighttour")
public class knighttour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public knighttour() {
        super();
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
	    
	    if(method.equals("nonIntelligentMethod")) {
	    	request.getRequestDispatcher("NI").forward(request, response);
	    }
	    else if(method.equals("intelligentMethod")) {
	    	request.getRequestDispatcher("I").forward(request, response);
	   }
	    
	}
	   
	
}
