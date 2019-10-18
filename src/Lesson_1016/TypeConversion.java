package Lesson_1016;

public class TypeConversion {
    public static void main(String[] args){
        int variableInt = 9;
        double variableDouble;
        variableDouble = variableInt;
        System.out.println(variableInt);
        System.out.println(variableDouble);

        byte byteVal = 99;
        float floatVal;
        floatVal = byteVal;
        System.out.println(byteVal);
        System.out.println(floatVal);

        /**
         * @ 强制类型转换
         */
        System.out.println("--------------");
        float variableFloat = 3.14159f;
        int float2Int;
        /**
         * @ float --> int
         */
        float2Int = (int)variableFloat;
        System.out.println(variableFloat);
        System.out.println(float2Int);

        /**
         * @ float --> long
         */
        float varFloat = 999.14159f;
        long float2Long = (long)varFloat;
        System.out.println(float2Long);
        /**
         * @ long --> byte
         */
        byte long2Byte = (byte)float2Long;
        System.out.println(long2Byte);

    }
}
