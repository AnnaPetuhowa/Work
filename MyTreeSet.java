import java.util.TreeMap;

public class MyTreeSet {

    TreeMap<Integer,Void> map = new TreeMap<>();

    public void add(int value) {
        map.put(value, null);
    }

    public boolean contains(int value) {
        return map.containsKey(value);
    }

    public void remove(int value) {
        map.remove(value);
    }
}