class Solution(object):
    def minimumDeletions(self, nums):
        
        n = len(nums)

        min_index = 0
        max_index = 0

        for i in range(1, n):
            if nums[i] < nums[min_index]:
                min_index = i

            if nums[i] > nums[max_index]:
                max_index = i

        left = min(min_index, max_index)
        right = max(min_index, max_index)

        front = right + 1
        back = n - left
        both = (left + 1) + (n - right)

        return min(front, back, both)
        