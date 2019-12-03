package sms;

public class sms_Answers {
    private int id;
    private String answer;
    private int i_id;

    public sms_Answers() {
    }

    public sms_Answers(int id, String answer, int i_id) {
        this.id = id;
        this.answer = answer;
        this.i_id = i_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    @Override
    public String toString() {
        return "sms_Answers{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", i_id=" + i_id +
                '}';
    }
}
