package mandatoryHomeWork.postfoundationDailyHW;
public class SplitBalancedString {
    public int balancedStringSplit(String s) {
        int count=0;
int countR=0;
int countL=0;
        for(int i=0;i<s.length();i++){

                if(s.charAt(i)=='R'){
                    countR++;
                }
                else{
                    countL++;
                }

               if(countR==countL){
                   count++;
               }
        }
        return count;
    }
}


//Input: String
//Ouput: int
//Logic
//1. Initialize three var countR, countL, count to 0
//2. Run a for loop till the last index of s and if the charAt a particular index equals R, do countR++, else countL++
//3. if the countR == countL, increment count by 1
//4. return count