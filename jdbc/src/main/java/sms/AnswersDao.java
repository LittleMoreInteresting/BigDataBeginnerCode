package sms;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersDao {

    public static Integer update(int id,String answer){
        String sql = "update sms_answers set answer=? where id=? ";
        return DbUtil.update(sql,answer,id);
    }

    public static int getScore(){
        String sql = "select SUM(score) from sms_items as i JOIN sms_answers as a ON a.i_id=i.id WHERE a.answer=i.answer";
        ResultSet resultSet = DbUtil.querySql(sql);
        int score = 0;
        try {
            if (resultSet.next()){
                score = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return score;
    }
}
