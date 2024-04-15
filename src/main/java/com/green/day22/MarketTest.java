package com.green.day22;

import java.sql.Connection;
import java.sql.SQLException;

public class MarketTest {
    public static void main(String[] args) {
        MyConnection myConnection = new MyConnection();
        Connection conn = null;
        try {
            conn = myConnection.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConnection.close(conn);
            // =이 없으므로 리턴타입이 아니라 void 이며 instance 메소드이고 메소드명은 : close 파라미터 1개 1개의 타입은 ? Connection 객체 주소값

        }
    }
}
