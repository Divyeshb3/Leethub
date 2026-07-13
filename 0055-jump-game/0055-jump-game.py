class Solution(object):
    def canJump(self, nums):
        fp = len(nums) - 1

        for p in range(len(nums) - 2, -1, -1):
            if p + nums[p] >= fp:
                fp = p

        if fp == 0:
            return True
        else:
            return False
        