class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<12&&x!=10) return true;
        if(x%10==0) return false;

        String s = String.valueOf(x);
        int len = s.length();
        if(len%2==0 && x%11!=0) return false;

        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)) return false;
        }
        return true;
    }
}