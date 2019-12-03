package Lesson_1128;

public class Test {
    public static void main(String[] args) {
        AbstractParam<Double> height = new AbstractParam<Double>(){};
        height.setValue(198.6);
        System.out.println(height.getValue());
    }
}

abstract class AbstractParam<T> {
    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}