
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnection;
import model.Student;

public class StudentDAO {

    public void registerStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into registration values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEvent());

            ps.executeUpdate();
            System.out.println("Registration Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewRegistrations() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from registration";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRegistration(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from registration where id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Registration Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
