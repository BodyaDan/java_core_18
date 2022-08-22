package second;

import java.util.HashMap;

public class UniqueMap<K, V>{
    private HashMap<K, V> map = new HashMap<>();

    public void addEntry(MyEntry<K, V> myEntry) {
        map.put(myEntry.getK(), myEntry.getV());
        System.out.println("Успішно додано!");
    }

    public void removeByKey(K k) {
        map.remove(k);
        System.out.println("Успішно видалено за ключем!");
    }

    public void removeByValue(V v) {
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            if (iterator.next().getValue().equals(v))
                iterator.remove();
        System.out.println("Процес видалення виконано!");
    }

    public void showKeys() {
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().getKey().toString());
    }

    public void showValues() {
        System.out.println(map.values());
    }

    public void outMap() {
        System.out.println(map.toString());
    }
}
