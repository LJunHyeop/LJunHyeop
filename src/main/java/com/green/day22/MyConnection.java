package com.green.day22;

import java.sql.*;

public class MyConnection {
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "market_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public Connection getConn() throws SQLException, ClassNotFoundException {
        //jdbc : mariadb : // localhost : 3306 / marker_db
        String url = String.format("jdbc:mariadb://%s:%s/%s", HOST, PORT, DB_NAME);
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        System.out.println("DB 접속 완료 ");
        return conn;
    }

    public void close(Connection conn) {
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try {
//            conn.close();
//        }catch (SQLException e){
//            System.out.println("SQLException error! ");
//        }finally {
//            System.out.println("close");
//        }
    }

    public void close(Statement stat, Connection conn) {
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn);
    }

    public void close(ResultSet rs, Statement stat, Connection conn) {
        if (rs != null || stat != null) {
            try {
                rs.close();
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn);
    }
}
