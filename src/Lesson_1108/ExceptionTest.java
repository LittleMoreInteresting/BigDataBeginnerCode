package Lesson_1108;

public class ExceptionTest {
    public static void main(String[] args) {
        test("aaa9","0");
    }

    public static void test(String a,String b){
        try{
            int left = Integer.valueOf(a);
            int right = Integer.valueOf(b);
            if(right==0){
                throw new TestException("params b can't be zero");
            }

            System.out.println(left+"/"+right+" = "+left/right);
        }catch (TestException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
