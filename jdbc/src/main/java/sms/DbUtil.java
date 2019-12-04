package sms;

import jdbc.JdbcStudy;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbUtil {

    private static Connection conn = null;

    static{
        try {
            Properties properties = new Properties();
            InputStream is =null;
            is = DbUtil.class.getResourceAsStream("/jdbc.properties");
            try {
                properties.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("URL");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            if(is!=null){
                is.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }

    public static ResultSet querySql(String sql, Object... params){
        //ArrayList<T> result = new ArrayList<T>();
        PreparedStatement psm = null;
        ResultSet rs = null;
        try {
            psm = conn.prepareStatement(sql);
            for (int i = 0; i<params.length; i++){
                psm.setObject(i+1,params[i]);
            }
            rs = psm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  rs;
    }

    public static <T> List<T> queryList(Class<T> c,String sql,Object... params){
        ArrayList<T> result = new ArrayList<T>();
        PreparedStatement psm = null;
        try {
            psm = conn.prepareStatement(sql);
            for (int i = 0; i<params.length; i++){
                psm.setObject(i+1,params[i]);
            }
            ResultSet rs = psm.executeQuery();
            while (rs.next()){
                ResultSetMetaData meta = rs.getMetaData();
                int columnCount = meta.getColumnCount();
                T obj = c.newInstance();
                for (int i = 0; i < columnCount; i++){
                    String columnName = meta.getColumnName(i+1);
                    Object columnValue = rs.getObject(columnName);
                    Field field = c.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(obj,columnValue);
                }
                result.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }finally {
            if (psm!=null){
                try {
                    psm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return  result;
    }

    public static Integer update(String sql,Object... params){
        PreparedStatement psm = null;
        int rs = 0;
        try {
            psm = conn.prepareStatement(sql);
            for (int i = 0; i<params.length; i++){
                psm.setObject(i+1,params[i]);
            }
            rs = psm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (psm!=null){
                try {
                    psm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return  rs;
    }

    public static void close(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
