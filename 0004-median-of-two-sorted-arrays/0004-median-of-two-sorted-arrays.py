class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        
        merged = sorted(nums1 + nums2)
        length = len(merged)
        mid = length // 2
        
        if length % 2 == 0:
            return (merged[mid - 1] + merged[mid]) / 2.0
        
        else:
            return float(merged[mid])

       