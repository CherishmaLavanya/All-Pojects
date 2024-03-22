package demo;

public class ClassNotFoundDemo {

    public static void main(String[] args) {
        try {
            Class.forName("demo.Myclass");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

}
