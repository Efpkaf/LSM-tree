package main.java;

import java.util.ArrayList;
import java.util.List;

public class MemoryOperator {

    private final MemCache memCache = new MemCache();
    private final List<SortedStringTable> ssTables = new ArrayList<>();
    private final Integer maxMemoryCacheSize = 5;

    public void add(Integer key, Object value) {
        memCache.add(key, value);

        if (memCache.currentSizeOfMemory() >= maxMemoryCacheSize) {
            ssTables.add(new SortedStringTable(memCache.getMemory()));
            memCache.flush();
        }
    }

    public Object get(Integer key) {
        final var result = memCache.get(key);

        if (result == null) {
            for (int i = ssTables.size() - 1; i >= 0; i--) {
                final var resultFromSsTables = ssTables.get(i).get(key);
                if (resultFromSsTables != null) {
                    System.out.println("value found in " + i + " ss table index");
                    return resultFromSsTables;
                }
            }
            System.out.println("value not found");
            return null;
        } else {
            System.out.println("value found in memcache");
            return result;
        }
    }

}
