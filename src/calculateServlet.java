import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculateServlet", urlPatterns = "/process")
public class calculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double first = Double.parseDouble(request.getParameter("first"));
        double second = Double.parseDouble(request.getParameter("second"));
        String operator = request.getParameter("operator");
        float result = 0;

        try {
             result = (float) Common.calculator(first, second, operator);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        request.setAttribute("result", result);
        request.setAttribute("first", first);
        request.setAttribute("operator", operator);
        request.setAttribute("second", second);
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
