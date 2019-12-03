package sms;

public class AnswersDao {

    public static Integer update(int id,String answer){
        String sql = "update sms_answers set answer=? where id=? ";
        return DbUtil.update(sql,answer,id);
    }


}
