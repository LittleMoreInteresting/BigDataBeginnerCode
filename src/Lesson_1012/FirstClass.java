package Lesson_1012;

/**
 * @author Henry
 */
public class FirstClass {
    public static void main(String[] args){
        int level = 7;
        String backslash = "\\";
        String forwardSlash = "/";
        String verticalLine = "|";
        String underLine = "_";
        String wavyLine = "~";
        String blankSpace = " ";
       for(int i = 0; i<level+level; i++){
            if(i<level){
                for (int j=0; j<level-i; j++){
                    System.out.print(blankSpace);
                }
                System.out.print(forwardSlash);
                for (int j=0; j<i+i; j++){
                    System.out.print(wavyLine);
                }
                System.out.print(backslash);
                for (int j=0; j<level-i; j++){
                    System.out.print(blankSpace);
                }
            }else if (i==level){
                System.out.print(forwardSlash);
                for (int j=0; j<level+level; j++){
                    System.out.print(underLine);
                }
                System.out.print(backslash);
            }else{
                System.out.print(verticalLine);
                for (int j=0; j<level+level; j++){
                    System.out.print(blankSpace);
                }
                System.out.print(verticalLine);
            }
            System.out.print("\n");
        }
        System.out.print(verticalLine);
        for (int j=0; j<level+level; j++){
            System.out.print(underLine);
        }
        System.out.print(verticalLine);
    }
}
