class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reminder;
        int reverse=0;
        while(x!=0){
            reminder = x % 10;
            reverse = reverse * 10 + reminder;
            x /= 10;
        }
        if(original<0){
            return false;
        }
        if(original==reverse){
            return true;
        }else{
            return false;
        }
    }
}
