/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 814215
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ArithmeticCalculatorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArithmeticCalculatorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("first_digit");
        String secondNumber = request.getParameter("second_digit");
        
       if(request.getParameter("add") != null){
        
        if( firstNumber == null || firstNumber.equals("") || !(firstNumber.matches("[0-9]+")) || secondNumber == null || secondNumber.equals("") || !(secondNumber.matches("[0-9]+"))){
            // set up a helpful error message for the user.
            request.setAttribute("message", "Invalid");
            // display the form again.
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request, response);
            // after we load a JSP, use a return statement.
            // stop the code from executing (VERY IMPORTANT!)
            return;
        }
        
        int sum = addition(firstNumber, secondNumber);
        
        request.setAttribute("message", sum);
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request,response);
        
    }
       
     if(request.getParameter("subtract") != null){
        
        if( firstNumber == null || firstNumber.equals("") || !(firstNumber.matches("[0-9]+")) || secondNumber == null || secondNumber.equals("") || !(secondNumber.matches("[0-9]+"))){
            // set up a helpful error message for the user.
            request.setAttribute("message", "Invalid");
            // display the form again.
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request, response);
            // after we load a JSP, use a return statement.
            // stop the code from executing (VERY IMPORTANT!)
            return;
        }
        
        int difference = subtract(firstNumber, secondNumber);
        
        request.setAttribute("message", difference);
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request,response);  
    }
    
    if(request.getParameter("multiply") != null){
        
        if(firstNumber == null || firstNumber.equals("") || !(firstNumber.matches("[0-9]+")) || secondNumber == null || secondNumber.equals("") || !(secondNumber.matches("[0-9]+"))){
            // set up a helpful error message for the user.
            request.setAttribute("message", "Invalid");
            // display the form again.
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request, response);
            // after we load a JSP, use a return statement.
            // stop the code from executing (VERY IMPORTANT!)
            return;
        }
        
        int total = multiply(firstNumber,secondNumber);
        
        request.setAttribute("message", total);
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request,response);
    
    }
    
    if(request.getParameter("divide") != null){
        
        if(firstNumber == null || firstNumber.equals("") || !(firstNumber.matches("[0-9]+")) || secondNumber == null || secondNumber.equals("") || !(secondNumber.matches("[0-9]+"))){
            // set up a helpful error message for the user.
            request.setAttribute("message", "Invalid");
            // display the form again.
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request, response);
            // after we load a JSP, use a return statement.
            // stop the code from executing (VERY IMPORTANT!)
            return;
        }
        
        int total = divide(firstNumber,secondNumber);
        
        request.setAttribute("message", total);
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorForm.jsp").forward(request,response);
    
    }
    
    }
    private int addition (String firstNumber, String secondNumber){
        int firstDigit = parseInt(firstNumber);
        int secondDigit = parseInt(secondNumber);
        
        int sum = firstDigit+secondDigit;
        return sum;
    }
    
    private int subtract (String firstNumber, String secondNumber){
        int firstDigit = parseInt(firstNumber);
        int secondDigit = parseInt(secondNumber);
        
        int difference = firstDigit-secondDigit;
        return difference;
    }
    
    private int multiply (String firstNumber, String secondNumber){
        int firstDigit = parseInt(firstNumber);
        int secondDigit = parseInt(secondNumber);
        
        int total = firstDigit*secondDigit;
        return total;
    }
    
    private int divide (String firstNumber, String secondNumber){
        int firstDigit = parseInt(firstNumber);
        int secondDigit = parseInt(secondNumber);
        
        int total = firstDigit/secondDigit;
        return total;
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
