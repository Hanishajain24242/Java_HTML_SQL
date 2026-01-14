import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/RegisterStudent")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName  = request.getParameter("lastName");
        String email     = request.getParameter("email");
        String phone     = request.getParameter("phone");
        String gender    = request.getParameter("gender");
        String course    = request.getParameter("course");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school_db",
                "root",
                "YOUR_PASSWORD"
            );

            String sql = "INSERT INTO student (name, email, phone, gender, course) VALUES (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, firstName + " " + lastName);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, gender);
            ps.setString(5, course);

            ps.executeUpdate();

            con.close();

            // ✅ Redirect after successful insert
            response.sendRedirect("view_students.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
