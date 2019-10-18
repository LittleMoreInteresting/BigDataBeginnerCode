package Lesson_1016;

public class TypeConversion {
    public static void main(String[] args){
        int variableInt = 9;
        double variableDouble;
        variableDouble = variableInt;
        System.out.println(variableInt);
        System.out.println(variableDouble);
        /**
         * @ 强制类型转换
         */
        System.out.println("--------------");
        float variableFloat = 3.14159f;
        int float2Int;
        float2Int = (int)variableFloat;
        System.out.println(variableFloat);
        System.out.println(float2Int);

    }
}
