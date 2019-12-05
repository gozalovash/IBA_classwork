package JavaWeb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

public class CalcServlet extends HttpServlet {
    private String calc(String p1, String p2, String op){
        String res = null;
        switch(op) {
            case "plus":
                res= Integer.toString(parseInt(p1) + parseInt(p2));
            break;
            case "minus":
                res= Integer.toString(parseInt(p1) - parseInt(p2));
            break;
            case "mult":
                res= Integer.toString(parseInt(p1) * parseInt(p2));
            break;
            case "divide":
                if (p2.equals("0")) {
                    return "dividing by zero";
                }
                res =Integer.toString(parseInt(p1) / parseInt(p2));
            break;
        }
        return res;
    }
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        writer.printf("Calculator:%s", calc(
                req.getParameter("x"),
                req.getParameter("y"),
                req.getParameter("op")
        ));
        writer.close();

    }
}

