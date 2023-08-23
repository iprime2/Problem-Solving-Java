import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {

    public static void main(String[] args) {
        int unique = 0;
        List<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(1);
        a.add(2);

        System.out.println(a);
        Set<Integer> set = new HashSet<>();

        for (int num : a) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        System.out.println(set.iterator().next());
    }
}
