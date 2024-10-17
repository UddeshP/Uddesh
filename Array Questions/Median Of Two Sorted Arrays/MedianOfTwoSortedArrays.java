public class MedianOfTwoSortedArrays {
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;
        
        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;
            
            // Edge cases
            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];
            
            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];
            
            // Check if we have partitioned correctly
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If the combined array is odd
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
                    // If the combined array is even
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            }
            // Adjust the binary search range
            else if (maxLeft1 > minRight2) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));  // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + findMedianSortedArrays(nums3, nums4));  // Output: 2.5
    }
}
