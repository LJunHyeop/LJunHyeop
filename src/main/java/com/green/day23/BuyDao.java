package com.green.day23;

import com.green.day22.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuyDao {
    private final MyConnection myConn;

    public BuyDao() {
        myConn = new MyConnection();
    }

    //    SELECT addr AS 지역 ,COUNT(addr) AS 카운트
//    FROM member
//    GROUP BY addr;
    public List<BuySelVo> selBuyGroupByMemId() {
        List<BuySelVo> list = new ArrayList<>();
        String sql = "SELECT mem_id , COUNT(mem_id) AS buy_count " +
                "FROM buy " +
                "GROUP BY mem_id";
        System.out.println(sql);
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String memId = rs.getString("mem_id");
                int buy_count = rs.getInt("buy_count");
                BuySelVo buySelVo = new BuySelVo(memId, buy_count);
                list.add(buySelVo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    // INSERT
    public int insBuy(BuyEntity entity) {
        String sql = "INSERT INTO buy( mem_id , prod_name, group_name, price , amount )" +
                "VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMem_id());
            ps.setString(2, entity.getProd_name());
            ps.setString(3, entity.getGroup_name());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // num 컬럼 제외 모든 컬럼 수정
    public int updBuy(BuyEntity entity) {
        String sql = "UPDATE buy SET mem_id = ? , prod_name = ? , group_name = ? , price = ? , amount = ? " +
                "WHERE num = ?  ";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMem_id());
            ps.setString(2, entity.getProd_name());
            ps.setString(3, entity.getGroup_name());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            ps.setInt(6, entity.getNum());
            System.out.println(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //"Delete from member WHERE mem_id = '%s'"
    public int delBuy(int num) {
        String sql = "DELETE FROM buy " +
                "WHERE num = ? ";
        System.out.println(sql);
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setInt(1, num);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class selBuyGroupByMEMId {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        List<BuySelVo> list = buyDao.selBuyGroupByMemId();
        for (BuySelVo Dao : list) {
            System.out.println(Dao);
        }

    }
}

class delBuy {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        BuyEntity entity = new BuyEntity();
        entity.setNum(23);
        int aff = buyDao.delBuy(entity.getNum());
        System.out.printf("aff : %d\n", aff);
    }
}

class BuyDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao(); // MyConnection 객체 주소값 갖게된다
        BuyEntity entity = new BuyEntity();
        entity.setMem_id("RED");
        entity.setProd_name("구두");
        entity.setGroup_name("패션");
        entity.setPrice(300);
        entity.setAmount(3);
        int aff = buyDao.insBuy(entity);
        System.out.printf("aff: %d\n", aff);
    }
}

class UpdDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        BuyEntity entity = new BuyEntity();
        entity.setNum(23);
        entity.setMem_id("RED");
        entity.setProd_name("없음");
        entity.setGroup_name("없음");
        entity.setPrice(200);
        entity.setAmount(1);
        int aff = buyDao.updBuy(entity);
        System.out.printf("aff : %d\n", aff);
    }
}
