class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        long rev = 0;
        x = sign == -1 ? (x * sign) : x;

        while(x > 0){
            if(rev * sign > Integer.MAX_VALUE || rev * sign < Integer.MIN_VALUE)
                return 0;
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        if(rev * sign > Integer.MAX_VALUE || rev * sign < Integer.MIN_VALUE)
            return 0;
        return (int)(rev * sign);
    }
}