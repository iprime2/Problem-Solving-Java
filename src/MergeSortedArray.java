import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int m=3;

        int[] nums2 = {2,5,6};
        int n=3;

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        for (int i = p; i >= 0; i--) {
            if (p2 < 0) {
                break;
            }

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
        }

        System.out.println(Arrays.toString(nums1));


    }
}
