package main.java;

public class Main {

    public static void main(String[] args) {
        final var memCache = new MemoryOperator();
        memCache.add(1, "1");
        memCache.add(2, "1");
        memCache.add(3, "1");
        memCache.add(4, "1");
        memCache.add(5, "1");
        memCache.add(6, "1");
    }

}
