//import java.util.Arrays;

public class mergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
                if (nums1[i] < nums2[j])
                    res[k++] = nums1[i++];
                else
                    res[k++] = nums2[j++];
        }
        while (j < m)
            res[k++] = nums2[j++];
        return (res);
    }

//    public static void merge(int[] n1, int m, int[] n2, int n){
//        int i = m, k = 0;
//        while (i < m + n){
//            n1[i++] = n2[k++];
//        }
//        Arrays.sort(n1);
//    }

    public static void main(String[] args){
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        int[] res = merge(n1, 3, n2, 3);
        for(int i = 0; i < 6 ;i++){
            System.out.println(res[i]);
        }
    }

}
