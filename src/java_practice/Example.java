package java_practice;

public class Example {
    public long add(long a, int b) {
        return a + b;
    }

    public long add(int a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.add(10L, 5)); // 호출 add(long, int)
        System.out.println(example.add(5, 10L)); // 호출 add(int, long)
    }
}