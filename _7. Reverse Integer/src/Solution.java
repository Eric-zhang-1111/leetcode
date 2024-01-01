class Solution {
    public int reverse(int x) {
        int result=0;
        while(x!=0){
            if((result*10+x%10-x%10)/10==result){
                result=result*10+x%10;
            }else return 0;
            x=x/10;
        }
        return result;
    }
}