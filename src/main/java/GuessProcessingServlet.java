import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;


@WebServlet(name = "GuessProcessingServlet", urlPatterns = "/guess")
public class GuessProcessingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guessing.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int guessNum = Integer.parseInt(req.getParameter("guess"));
        System.out.println(req.getParameter("guess"));
        int answer = (int) Math.floor(Math.random() * 3) + 1;
        if(guessNum ==answer){
            resp.sendRedirect("/correct");
        } else {
            resp.sendRedirect("/incorrect");
        }
        //System.out.println(req.getParameter("guess"));
    }
}






//import com.ibm.jvm.dtfjview.Session;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//@WebServlet(name ="GuessProcessingServlet", urlPatterns = "/guess")
//public class GuessProcessingServlet extends HttpServlet {
//    public void doPost(HttpServletRequest request,HttpServletResponse response)
//            throws ServletException,IOException{
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out=response.getWriter();
//        //Get the number of customer guesses submitted
//        int guessNumber=Integer.parseInt(request.getParameter("guessnumber"));
//        //Get the client's session object
//        HttpSession session=request.getSession();
//        Integer integer=(Integer)session.getAttribute("saveNumber");
//        int realNumber=integer.intValue();
//        System.out.println(realNumber);
//        System.out.println(guessNumber);
//        if(guessNumber>realNumber){
//            //Session.SetAttribute ("message", "guess big");
//            System.out.println ("you guessed big -- no");
//            response.sendRedirect("inputNumber.jsp");
//        }
//        else if(guessNumber<realNumber){
//            //Session. SetAttribute ("message", "guess small");
//            System.out.println("you guessed it small -- - no");
//
//            response.sendRedirect("inputNumber.jsp");
//        }
//        else{
//           // Session. SetAttribute ("message", "you guessed it right");
//            System. out. println ("you guessed it right");
//            response.sendRedirect("inputNumber.jsp");
//        }
//    }
//    public void doGet(HttpServletRequest request,HttpServletResponse response)
//            throws ServletException,IOException{
//        doPost(request,response);
//    }
//
//}
