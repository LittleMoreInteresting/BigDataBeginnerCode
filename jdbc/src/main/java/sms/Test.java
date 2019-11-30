package sms;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String sql = "select * from student  ";
        Class<Student> stu = Student.class;
        List<Student> res = DbUtil.queryList(stu ,sql);
        for (Student item : res) {
            System.out.println(item);
        }
    }
}
