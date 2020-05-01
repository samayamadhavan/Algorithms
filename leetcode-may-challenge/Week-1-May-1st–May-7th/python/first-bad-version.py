### Are all the versions good?

class Solution:
    def firstBadVersion(self, n):
        start,end=1,n
        while(start<=end):
            mid=((end-start)//2)+start            
            if isBadVersion(mid)==False:
                start=mid+1
            else:
                end=mid-1
        return start
