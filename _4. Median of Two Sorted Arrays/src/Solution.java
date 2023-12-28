import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length, nums2Length=nums2.length;
        int total=nums1Length+nums2Length;
        int[] mergedNums = new int[total];
        int k=0;
        for(int i=0;i<nums1Length;i++){
            mergedNums[k++]=nums1[i];
        }
        for(int i=0;i<nums2Length;i++){
            mergedNums[k++]=nums2[i];
        }
        Arrays.sort(mergedNums);
        double result = total%2==0?((double)mergedNums[total/2]+(double)mergedNums[total/2-1])/2:mergedNums[total/2];
        return result;
    }
}