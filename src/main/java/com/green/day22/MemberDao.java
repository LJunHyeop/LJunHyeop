package com.green.day22;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//Member 테이블용 Data Access Object

class SubStringTest {
    public static void main(String[] args) {
        String str = "1234567890";

        System.out.println(str.substring(3)); // substring 값은 원본을 건들이지 않는다 새로운 string 를 만들어서 return 해준다
        System.out.println(str.substring(4, 7)); // 4,7 까지 출력 배열값처럼 0번방부터 계산한다 4번방부터 7번방까지567
        System.out.println(str);

        String str2 = ", 안녕 ,하하 ,좋아요 ";
        System.out.println(str2.startsWith(",")); // 혹시 문장시작이 ,로 시작하냐 ?? 물어봄
        String str3 = str2.substring(1);
        System.out.println("str3 :" + str3);
    }
}

class MEmberDaoUpDateTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemNumber(6);
        member.setAddr("제주");
        int affectedRow = memberDao.updMember(member);
        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}

class MemberDaoDeleteTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        int affectedRow = memberDao.delMember(member);
        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}

class selMemberList {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity member = new MemberEntity();
    }
}

public class MemberDao {
    private final MyConnection myConn;

    public MemberDao() {
        myConn = new MyConnection();
    }

    public int insMember(MemberEntity entity) {
        String sql = String.format("INSERT INTO member " +
                        "(mem_id, mem_name , mem_number, addr , phone1, phone2, height , debut_date)" +
                        "VALUES"
                        +
                        "('%s', '%s', %d, '%s', '%s', '%s', %d, '%s')"
                , entity.getMemId(), entity.getMemName(), entity.getMemNumber(), entity.getAddr()
                , entity.getPhone1(), entity.getPhone2(), entity.getHeight(), entity.getDebutDate()
        );
        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();  //쿼리문 실행 할수 있는 친구
            result = stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn); // 열떄는 conn 으로 열고 stat 로 받아야되는데  닫을대는 반대로 stat 부터 닫고 들어가야댐
        }

        return result;
    }

    // ()파라미터가 없다. 외부로부터 정보를 받지않겠다 라는 말은 부분으로 받지않고 전체를 가져오겠다 라는 ㅏㅁㄹ
    public List<MemberEntity> selMemberList() {
        List<MemberEntity> list = new ArrayList<>();
        String sql = "SELECT mem_id, mem_name, debut_date\n" + "FROM member\n" + "ORDER BY debut_date DESC";
        Connection conn = null;
        Statement stat = null;
        ResultSet re = null;
        System.out.println(sql);
        return list;
    }

    //업데이트
    public int updMember(MemberEntity entity) {
        String mid = "";
        if (entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name ='%s'", entity.getMemName());
        }
        if (entity.getMemNumber() > 0) {
            mid += String.format(", mem_number = %d", entity.getMemNumber());
        }
        if (entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", Addr = '%s'", entity.getAddr());
        }
        if (entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += toString().formatted(",phone 1 = '%s' ", entity.getPhone1());
        }
        if (entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2  = '%s'", entity.getPhone2());
        }
        if (entity.getHeight() > 0) {
            mid += String.format(", height = %d", entity.getHeight());
        }
        mid = mid.substring(1);
        String sql = String.format("UPDATE member SET %s WHERE mem_id = '%s'", mid, entity.getMemId());
        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();  //쿼리문 실행 할수 있는 친구
            result = stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn); // 열떄는 conn 으로 열고 stat 로 받아야되는데  닫을대는 반대로 stat 부터 닫고 들어가야댐
        }
        return result;
    }

    public int delMember(MemberEntity entity) {
        String sql = String.format("Delete from member WHERE mem_id = '%s'", entity.getMemId());
        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();  //쿼리문 실행 할수 있는 친구
            result = stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn); // 열떄는 conn 으로 열고 stat 로 받아야되는데  닫을대는 반대로 stat 부터 닫고 들어가야댐
        }

        return result;
    }
}


class MemberDAOTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemName("뉴진스");
        member.setMemNumber(4);
        member.setAddr("대구");
        member.setPhone1("053");
        member.setPhone2("77777777");


        member.setHeight(166);
        member.setDebutDate("2022-10-01");

        int affectedRow = memberDao.insMember(member);
        System.out.printf("afectedRow : %d\n", affectedRow);

        //intMember 메소드 호출
        // 1. 메소드가 어디에 있는지 확인 > MEmberDao 에 있는 것을 확인함
        // 2. static 메소드 인지 아닌지 확인. why ? 호출방법이 달라진다. > static 메소드가 아니기 떄문에 MemberDao 를 객체화해야한다.
        // 3. 선언부를 확인하는 리턴타입은 int , 파라미터는 MemberEntity 객체 주소값을 필요한 것응ㄹ ㅗ학인
        // 4. MemberDao 객체 주소값 도트연산자를 이용하여 메소드 선언 부에 맞추어 호출을 한다.
    }
}

