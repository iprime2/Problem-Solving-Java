import java.util.ArrayList;
import java.util.List;

public class ListSortMedian {
    public static void main(String[] args) {
//        int [] arr = new int[]{0,5,1,2,1,3,5};
        List<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(0);

        for(int i=0; i < arr.size(); i++){
            for(int j=i + 1; j< arr.size(); j++){
                int temp = 0;
                if(arr.get(i) > arr.get(j)){
                    temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j, temp);
                }
            }
        }

        System.out.println(arr);
        int n = arr.size();
        int m = n / 2;

        System.out.println("Median " + m);

        System.out.println(arr.get(m));
    }
}