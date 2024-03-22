package collectionsExp;


class Container<T> {
    T value;

    public void show() {
        System.out.println(value.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Container<Double> oj = new Container<>();
        oj.value = 9.9;
        oj.show();
    }
}
