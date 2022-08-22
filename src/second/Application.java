package second;

public class Application {
    public static void main(String[] args) {
        UniqueMap<String, Integer> uniqueMap = new UniqueMap();

        uniqueMap.addEntry(new MyEntry<>("Hell", 44));
        uniqueMap.addEntry(new MyEntry<>("Bull", 96));
        uniqueMap.addEntry(new MyEntry<>("Cast", 421));

        uniqueMap.showKeys();
        System.out.println("");
        uniqueMap.showValues();
        System.out.println("");
        uniqueMap.outMap();
        uniqueMap.removeByKey("Hell");
        System.out.println("");
        uniqueMap.outMap();
        uniqueMap.removeByValue(96);
        System.out.println("");
        uniqueMap.outMap();
    }
}
