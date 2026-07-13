class Solution(object):
    def topKFrequent(self, nums, k):
        f = {}

        for p in nums:
            if p not in f:
                f[p] = 1
            else:
                f[p] = f[p] + 1

        nums = sorted(f.items(), key=lambda x: x[1], reverse=True)

        r = []

        for p in range(k):
            r.append(nums[p][0])

        return r

        