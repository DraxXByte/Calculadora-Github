package servletHTML;
import java.lang.Math;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;
public class ServletCalcu extends HttpServlet{
    int num1,num2,resul;
    String operacions;
     public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        operacions = peticion.getParameter("operacion");
        num1 = Integer.parseInt(peticion.getParameter("n1"));
        num2 = Integer.parseInt(peticion.getParameter("n2"));
        if(operacions == "+"){
        resul = num1 + num2;
        }
        if(operacions == "-"){
        resul = num1 - num2;
        }
        if(operacions == "/"){
        resul = num1 / num2;
        }
        if(operacions == "*"){
        resul = num1 * num2;
        
        }
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        
        out.println("<html>");
        out.println("<head><title>Respuesta al Formulario del Servlet</title></head>");
        out.println("<body>");
        out.println("<p><b><center>El resultado es "+resul+" </center></b></p>");
        out.println("hoy es " + new Date());
        out.println("</body></html>");
        out.close();
    }
     public int suma(int num1,int num2){
     int resul =num1 + num2;
     return resul;
     };
}
