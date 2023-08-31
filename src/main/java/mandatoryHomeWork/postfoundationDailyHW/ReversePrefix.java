package mandatoryHomeWork.postfoundationDailyHW;
public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
int j = word.indexOf(ch);

char[] chArr = word.toCharArray();
int i=0;

if(j==-1){
  return word;
}

while(i<j){
  char temp = chArr[i];
  chArr[i]=chArr[j];
  chArr[j]=temp;
  i++;
  j--;

}

return new String(chArr);

    }
}


//Input: String
//Output: String
//Test data : abczey - z, tednmn -n , xoriant - v
//Logic: intialize int i =0 and j=word.indexOf(ch)
//1. Convert the string to char[]
//2.  In a while loop, swap the char till i<j condition is true, after swapping decrease j by 1 and increase i by 1
//3. return the final char[] as String