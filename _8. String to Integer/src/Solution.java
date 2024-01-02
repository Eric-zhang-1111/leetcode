class Solution {
    public int myAtoi(String s) {
        int len = s.length(),idx=0;

        while (idx<len && s.charAt(idx)==' '){//ignore white space
            idx++;
        }
        if(idx==len){
            return 0;
        }

        boolean positive;
        if(s.charAt(idx)=='-'){//check the sign
            positive = false;
            idx++;
        }else{
            positive = true;
            if(s.charAt(idx)=='+')idx++;
        }

        int result=0;
        while (idx < len && Character.isDigit(s.charAt(idx))) {
            int digit = s.charAt(idx) - '0';
            if(positive){
                if((Integer.MAX_VALUE-digit)/10<result) return Integer.MAX_VALUE; else result=result*10+digit;
            }else{
                if((Integer.MIN_VALUE+digit)/10>result) return Integer.MIN_VALUE; else result=result*10-digit;
            }
            idx++;
        }
        return result;
    }
}