package main.java;

import java.util.HashMap;
import java.util.Map;

public class MemCache {

    private final Map<Integer, Object> memory = new HashMap<>();

    public void add(Integer key, Object value) {
        System.out.println(key + " has been added to memory cache with value " + value.toString());
        memory.put(key, value);
    }

    public Integer currentSizeOfMemory() {
        return memory.size();
    }

    public Map<Integer, Object> getMemory() {
        return memory;
    }

    public void flush() {
        System.out.println("flushing memcache");
        memory.clear();
    }

    public Object get(Integer key) {
        return memory.get(key);
    }
}
