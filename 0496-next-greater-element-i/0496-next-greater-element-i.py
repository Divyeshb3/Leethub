class Solution(object):

    def nextGreaterElement(self, nums1, nums2):

        st = []
        d = {}

        for num in nums2:
            while st and num > st[-1]:
                d[st.pop()] = num
            st.append(num)

        while st:
            d[st.pop()] = -1

        r = []

        for num in nums1:
            r.append(d[num])

        return r

    