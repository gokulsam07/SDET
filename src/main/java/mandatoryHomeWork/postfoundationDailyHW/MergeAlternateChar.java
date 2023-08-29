class Solution {
    public String mergeAlternately(String word1, String word2) {
        String fin="";
        int len1 = word1.length();
        int len2 = word2.length();
       
            if(len1==len2){
         for(int i=0;i<len1;i++){
             fin=fin+word1.charAt(i)+word2.charAt(i);
         }
         return fin;
            }

            else if(len1>len2){
                int i=0;
                for(i=0;i<len2;i++){
                    fin=fin+word1.charAt(i)+word2.charAt(i);
                }
                while(i!=len1){
                    fin=fin+word1.charAt(i);
                    i++;
                }

return fin;
            }

            else{
                 int i=0;
                for(i=0;i<len1;i++){
                    fin=fin+word1.charAt(i)+word2.charAt(i);
                }
                while(i!=len2){
                    fin=fin+word2.charAt(i);
                    i++;
                }

return fin;
            }
   
        
    }
}

//Input: String
//ouput: String
// Test data : mno - avx, abc - mn, abc - vfxc
//Logic
// 1. If length of both words are equal, run a for loop for one of the string from o to length of string -1 and append the value of char of word1 and word2 to fin and return fin
//2. If length of word1> word2, run the loop till the smallest word and append it to fin, inside the for loop run a while loop till the value of index and value of the largest length becomes equal and append those left over char to fin and return fin
//3. Repeat the same for word1<word2 by swapping the conditions and return fin