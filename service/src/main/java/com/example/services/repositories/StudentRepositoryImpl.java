package com.example.services.repositories;

import com.example.services.domain.Student;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by hashan on 8/4/17.
 */
public class StudentRepositoryImpl implements StudentRepository  {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public <S extends Student> S save(S s) {
        String sql = "INSERT INTO student_dbo.student" +
                "(id, name, gender, birthday, address) VALUES(?, ?, ?, ?, ?)";

        Connection con = null;

        try{
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getGendar()[0]);
            ps.setDate(4, new Date(s.getBirthday().getTime()));
            ps.setString(5, s.getAddress());

            ps.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }

    public <S extends Student> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    public void delete(Student student) {

    }

    public void delete(Iterable<? extends Student> iterable) {

    }

    public void deleteAll() {

    }

    public Iterable<Student> findAll(Iterable<String> iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(String s) {

    }

    public Student findOne(String s) {
        return null;
    }

    public boolean exists(String s) {
        return false;
    }

    public Iterable<Student> findAll() {
        String sql = "SELECT * FROM student_dbo.student";
        Connection con = null;

        ArrayList<Student> studentList = new ArrayList<Student>();
        try {
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            Student student = null;
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                student = new Student();

                student.setId(resultSet.getString("id"));
                student.setName(resultSet.getString("name"));
                student.setGendar(new String[]{resultSet.getString("gender")});
                student.setBirthday(resultSet.getDate("birthday"));
                student.setAddress(resultSet.getString("address"));

                studentList.add(student);

            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return studentList;
    }
}
