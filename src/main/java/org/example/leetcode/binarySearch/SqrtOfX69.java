package org.example.leetcode.binarySearch;

public class SqrtOfX69 {

    public static void main(String[] args) {

        System.out.println(SqrtOfX69.mySqrt(8));
    }


    public static int mySqrt(int x) {
        if(x==0 || x==1) return x;

        long l=0;
        long r=x-1;

        while(l<=r){
            long mid = l+(r-l)/2;

            long target = mid * mid;

            if(target==x)
                return (int)mid;

            else if(target>x)
                r=mid-1;
            else
                l=mid+1;
        }

        return (int)r;
    }
}
