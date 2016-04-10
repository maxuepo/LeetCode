package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/10/16.
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int medIndex;
        if((m+n)%2==0){
            medIndex = (m+n)/2-1;
        }else{
            medIndex = (m+n-1)/2;
        }
        int i = 0, j = 0;
        int res = 0;
        while(i<m && j<n){
            if(medIndex<0)break;
            if(nums1[i]<nums2[j]){
                res = nums1[i];
                i++;
                medIndex--;
            }else{
                res = nums2[j];
                j++;
                medIndex--;
            }
        }
        while(i>=m && j<n){
            if(medIndex<0)break;
            res = nums2[j];
            j++;
            medIndex--;
        }
        while(i<m && j>=n){
            if(medIndex<0)break;
            res = nums1[i];
            i++;
            medIndex--;
        }
        if((m+n)%2!=0){
            return (double)res;
        }else{
            int res2;
            if(i<m&&j<n){
                res2 = nums1[i]<nums2[j]?nums1[i]:nums2[j];
            }else if(i>=m&&j<n){
                res2 = nums2[j];
            }else{
                res2 = nums1[i];
            }
            return (res + res2)/2.0;
        }
    }
}
