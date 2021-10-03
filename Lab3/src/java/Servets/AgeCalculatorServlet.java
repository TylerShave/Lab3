
package Servets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgeCalculatorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgeCalculatorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculatorForm.jsp").forward(request, response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String enteredAge = request.getParameter("ageValue");
        
        request.setAttribute("age",enteredAge);
        
                // validation: if the parameters don't exist or are empty, show the first page again.
        if( enteredAge == null || enteredAge.equals("")|| !(enteredAge.matches("[0-9]+"))){
            // set up a helpful error message for the user.
            request.setAttribute("message", "Invalid entry. Please enter a valid age.");
            // display the form again.
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculatorForm.jsp").forward(request, response);
            // after we load a JSP, use a return statement.
            // stop the code from executing (VERY IMPORTANT!)
            return;
        }

        int birthdayAge = parseInt(enteredAge) + 1;
        // The request object will be passed through to the JSP by the forward() method.
        request.setAttribute("message", "Your age on your next birthday will be: " + (birthdayAge));
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculatorForm.jsp").forward(request,response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
