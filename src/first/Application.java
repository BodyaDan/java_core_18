package first;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(44); //Все ок бо 44 - це int
        //list.add("54"); - Error бо String це не Integer)

        addString(list);

        for (Object o : list)
            System.out.println(o);
    }

    //Обходимо Generic
    public static void addString(List list) {
        list.add("54 - String");
    }
}
