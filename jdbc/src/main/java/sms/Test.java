package sms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String sql = "select count(*) from student  ";
        String sql1 = "select * from student  ";
        Class<Student> stu = Student.class;
        ResultSet res = DbUtil.querySql( sql);
        List<Student> res1 = DbUtil.queryList(stu, sql1);
        try {
            if(res.next()) {
                int count=res.getInt(1);
                System.out.println("count:"+count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Student student: res1) {
            System.out.println(student);
        }


    }
}
