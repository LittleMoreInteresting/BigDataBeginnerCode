package sms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemsDao {
    public static int getNum(){
        int count = 0;
        String sql = "select count(*) as num from sms_items";
        ResultSet resultSet = DbUtil.querySql(sql);
        try {
            if (resultSet.next()){
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void getItems(int itemId){
        String sql = "select * from sms_items where id = ?";
        List<sms_Items> items = DbUtil.queryList(sms_Items.class,sql,itemId);
        System.out.println(items.get(0));
    }
    public static List<Integer> getIds(){
        String sql = "select id from sms_items";
        List<Integer> ids = new ArrayList<Integer>();
        ResultSet resultSet = DbUtil.querySql(sql);
        try {
            while (resultSet.next()){
                ids.add(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ids;
    }
}
