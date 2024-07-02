package p12_database.dao;

import java.sql.*;

public class DAOSet {
  protected Connection conn;
  // sql 에서 질의하기위한 객체 Pre,Stat
  protected PreparedStatement pstmt;
  protected Statement stmt;
  // sql 질의된 결과를 담는 객체
  protected ResultSet rs;

  public Connection connectDB() throws SQLException {
    String driver = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "db7", pass = "1234";
    conn = DriverManager.getConnection(driver, user, pass);
    return conn;

  }

  public void closeDB() {
    try {
      if (rs != null) rs.close();
      if (stmt != null) stmt.close();
      if (pstmt != null) pstmt.close();
      if (conn != null) conn.close();
      System.out.println(conn.isClosed() ? "접속종료" : "접속중");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  /*
  create table members(mno number,
  id varchar2(20),
pass varchar2(20),
name varchar2(20),
mobile varchar2(20))

create SEQUENCE sq_members;


   */
}
