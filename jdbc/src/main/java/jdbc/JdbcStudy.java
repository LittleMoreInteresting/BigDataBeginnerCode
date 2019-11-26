package jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcStudy {
    public static void main(String[] args) {
       createTable();
       insert();

        //3. 创建Statement对象,用于执行sql语句
    }

    public static void createTable(){
        Connection con=null;
        Statement sta=null;
        try {
            con = open();
            sta = con.createStatement();
            String sql = "CREATE TABLE `student`  (\n" +
                    "  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
                    "  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '姓名',\n" +
                    "  `age` int(11) NOT NULL DEFAULT 0 COMMENT '年龄',\n" +
                    "  `phone` varchar(255) NULL DEFAULT '',\n" +
                    "  PRIMARY KEY (`id`)\n" +
                    ");";
            int i = sta.executeUpdate(sql);
            System.out.println(i);
            System.out.println("createTable");
            sta.close();
            close(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insert(){
        Connection con=null;
        PreparedStatement  staIn =null;
        try {
            con = open();
            staIn = con.prepareStatement("insert into student(name,age,phone) values(?,?,?)");
            staIn.setString(1,"张三");
            staIn.setInt(2,18);
            staIn.setString(3,"15110174637");
            staIn.executeUpdate();
            staIn.setString(1,"李斯");
            staIn.setInt(2,19);
            staIn.setString(3,"15110183744");
            staIn.executeUpdate();
            staIn.close();
            close(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection open(){
        Properties properties = new Properties();
        InputStream is =null;
        is = JdbcStudy.class.getResourceAsStream("/jdbc.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("URL");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        Connection con = null;
        try {
            con=  DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void close(Connection con){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
