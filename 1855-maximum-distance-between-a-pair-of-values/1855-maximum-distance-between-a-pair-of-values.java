class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int res = 0;
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(nums1[i] <=nums2[j]){
                res = Math.max(res,j-i);
                j++;
            }else{
                i++;
            }

        }
        return res;
//         for(int i = 0 ; i<n;i++){
//             for(int j = i; j<m;j++){
//                 if(nums1[i] <=nums2[j]){
//                     res = Math.max(res,j - i);
//                 }
//             }
//         }
//         return res;
     }
 }