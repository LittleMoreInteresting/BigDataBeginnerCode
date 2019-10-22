package Lesson_1021;

public class JavaLoop2 {

    public static void main(String[] args) {
        JavaLoop2 loops = new JavaLoop2();
        loops.loopMul2();
    }

    public void loopMul2(){
        int sum = 0;
        int num = 0;
        String numbers = "";
        for (int i = 0;i<5;i++){
            num = 2+10*num;
            if(numbers.isEmpty()){
                numbers = "" + num;
            }else{
                numbers += "+"+num;
            }
            sum+=num;
        }
        System.out.println(numbers+" = "+sum);
    }

    /**
     * 用for循环求2+22+222+2222+22222的和。
     */
}
