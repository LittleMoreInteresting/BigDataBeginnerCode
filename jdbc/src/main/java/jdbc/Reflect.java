package jdbc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) {
        Class c = String.class;
        String str="Reflect";
        Method indexOfMethod = null;
        try {
            indexOfMethod = c.getDeclaredMethod("indexOf", int.class);
            int i =  (Integer) indexOfMethod.invoke(str, (int) 'e');
            System.out.println(i);

            Method endsWithMethod = c.getDeclaredMethod("endsWith", String.class);
            boolean b = (Boolean) endsWithMethod.invoke(str, "t");
            System.out.println(b);
            Method replaceMethod = c.getDeclaredMethod("replace", char.class, char.class);
            String newStr = (String) replaceMethod.invoke(str, 'e', 'E');
            System.out.println(newStr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
