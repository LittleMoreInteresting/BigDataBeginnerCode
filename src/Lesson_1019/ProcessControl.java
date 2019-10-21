package Lesson_1019;

public class ProcessControl {

    public static void main(String[] args) {
        ProcessControl processCon = new ProcessControl();
        System.out.println("a："+processCon.char2Upper('a'));
        System.out.println("b："+processCon.char2Upper('b'));
        System.out.println("c："+processCon.char2Upper('c'));
        System.out.println("c："+processCon.char2Upper('d'));
        System.out.println("e："+processCon.char2Upper('e'));
        System.out.println("q："+processCon.char2Upper('q'));
    }

    /**
     * 使用switch把小写类型的char转换为大写输出，只转换a,b,c,d,e，其他的输出other。
     */
    public String char2Upper(char letter){
        String result = "";
        switch (letter){
            case 'a':
                result = "A";
                break;
            case 'b':
                result = "B";
                break;
            case 'c':
                result = "C";
                break;
            case 'd':
                result = "D";
                break;
            case 'e':
                result = "E";
                break;
            default:
                result = "other";
        }
        return result;
    }


    /**
     * 现有三个数,分别存入变量a,b,c,要求:从小到大输出他们
     */
    public String sortOut(int a,int b,int c){
        int temp;
        if(a>b){
            temp = b;
            b = a;
            a = temp;
        }
        if(b>c){
            temp = c;
            c = b;
            b = temp;
            if(a>b){
                temp = b;
                b = a;
                a = temp;
            }
        }
        return  "从小到大:"+a+','+b+','+c;
    }


    /**
     * 声明一个成绩变量,并赋值.完成逻辑:当成绩为100分时，奖励一台MacBook，当成绩为80-99时，奖励一部iphone7，当
     * 成绩为60-80时，奖励一个苹果，其他分数，什么奖励也没有。
     */
    public String getReward(int score){
        String reward ;
        if(score>=60 && score<80){
            reward = "an Apple";
        }else if(score>=80 && score<99){
            reward = "iphone7";
        }else if (score==100){
            reward = "MacBook";
        }else{
            reward = " Let's press on. ";
        }
        return reward;
    }


    /**
     * 使用switch把小写类型的char转换为大写输出，只转换a,b,c,d,e，其他的输出other。
     */
}
