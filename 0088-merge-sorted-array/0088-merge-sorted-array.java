class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m-1, l = n-1;
        // int i = nums1.length-1;
        int i = 0;
        for (i = nums1.length-1; i >=0 ; i--) {
            if (l < 0 || j < 0) {
                break;
            }
            if (nums1[j] > nums2[l]) {
                nums1[i] = nums1[j];
                j--;
            } else {
                nums1[i] = nums2[l];
                l--;
            }
        }
        while(l >= 0) {
            nums1[i] = nums2[l];
            i--;
            l--;
        }
    }
}