class Solution {
    public String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        if(len<=numRows||numRows==1){
            return s;
        }
        for(int i=0;i<numRows;i++){//n rows, i is row num
            int j=0;
            while(true){//for every row
                if (2*(numRows-1)*j+i<len)sb.append(charArray[2*(numRows-1)*j+i]);//else break. but it will lower efficient. I don't know why
                if (2*(numRows-1)*(j+1)-i<len && i!=0 && i!=numRows-1)sb.append(charArray[2*(numRows-1)*(j+1)-i]);//if it is not the first row or last row
                if (2*(numRows-1)*(j+1)>=len)break;
                j++;
            }
        }
        return sb.toString();
    }
}