package main.java;

import java.util.Map;

public class SortedStringTable {

    private final Map<Integer, Object> values;

    public SortedStringTable(Map<Integer, Object> values) {
        System.out.println("generating new SS table");
        this.values = values;
    }

    public Object get(Integer key) {
        return values.get(key);
    }
}
