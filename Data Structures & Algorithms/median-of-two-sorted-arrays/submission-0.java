class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int[] A = nums1;
        int[] B = nums2;
        int total = A.length + B.length;
        int half = total/2;

        int low = 0;
        int high = A.length;

        while(low <= high){
            int i = low + (high - low)/2;
            int j = half - i;

            int A_left = (i > 0) ? A[i-1] : Integer.MIN_VALUE;
            int A_right = (i < A.length) ? A[i] : Integer.MAX_VALUE;

            int B_left = (j > 0) ? B[j-1] : Integer.MIN_VALUE;
            int B_right = (j < B.length) ? B[j] : Integer.MAX_VALUE;

            if(A_left <= B_right && B_left <= A_right){
                if(total % 2 != 0){
                    return Math.min(A_right, B_right);
                }
                return (Math.max(A_left,B_left) + Math.min(A_right,B_right))/2.0;
            }
            else if(A_left > B_right){
                high = i-1;
            }
            else{
                low = i + 1;
            }
        }
        return 0.0;
    }
}
