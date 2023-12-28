//class Solution {//has bug
//
//    public String longestPalindrome(String s) {
//        int maxL=0,maxR=0,l,r;//left pointer and right pointer
//        int sLength=s.length(),max=0;
//        //3
//        for(l=0;l<sLength-2;l++){
//            r=l+2;
//            System.out.println(l);
//            int currentLength= checkPalindrome(l,r,s);
//            if (currentLength>max){
//                maxL=l-currentLength+1;
//                maxR=r+currentLength;
//            }
//        }
//        //2
//        for(l=0;l<sLength-1;l++){
//            r=l+1;
//            System.out.println(l);
//
//            int currentLength= checkPalindrome(l,r,s);
//            if (currentLength>max){
//                maxL=l-currentLength+1;
//                maxR=r+currentLength;
//            }
//
//        }
//        return maxL==0&&maxR==0?s.substring(0,1):s.substring(maxL,maxR);
//    }
//    public int checkPalindrome(int l,int r,String s){
//        int max=0;
//        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
//            l--;
//            r++;
//            max++;
//        }
//        return max;
//    }
//}

class Solution {
    int maxLen=1, maxLeft=0;
    public String longestPalindrome(String s) {
        int len = s.length();
        for(int i=0;i<len-1;i++){
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(maxLeft, maxLeft + maxLen);
    }
    private void extendPalindrome(String s,int left,int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if(right-left-1>maxLen){
            maxLeft=left+1;
            maxLen=right-left-1;
        }
    }
}