import java.lang.reflect.Array;
import java.util.Arrays;

public class mergesort {
    public static void MergeSort(int nums1[], int nums2[]){
        int  n = nums1.length;
        int  m = nums2.length;
        int merged[] = new int[n+m];
        int k = 0;
        for(int i=0; i<n; i++){
            merged[k++] = nums1[i];
        }
        for(int i=0; i<m; i++){
            merged[k++] = nums2[i];
        }
        Arrays.sort(merged);
        for(int i=0; i<merged.length; i++){
            System.out.print(merged[i]+" ");
        }
        System.out.println();
      
        
    }
public static void main(String[] args) {        
    
    int nums1[] = {4,2,3,5,1,0};
    int nums2[] = {10,11,55,33,58,90,199};
    MergeSort(nums1, nums2);
   }
}
