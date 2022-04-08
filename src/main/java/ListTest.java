import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(1);
        System.out.println(intList);
        boolean is = intList.remove(Integer.valueOf(1));
        System.out.println("" + intList + is);
        is = intList.remove(Integer.valueOf(1));
        System.out.println("" + intList + is);
        is = intList.remove(Integer.valueOf(1));
        System.out.println("" + intList + is);
    }
}
