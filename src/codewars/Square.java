package codewars;

public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(9));
        System.out.println(isSquare2(25));
    }
    public static boolean isSquare(int n) {
        if(n<0){
            return  false;
        }
        int middleOfn = (int)Math.sqrt(n);
        if(middleOfn*middleOfn==n){
            return  true;
        }
        return false;
    }
    public static boolean isSquare2(int n){
        return Math.sqrt(n)%1==0;
    }
}
