package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep6HW_TruncateSentence {
	
	//input: String 
	//output: String
	//logic : initialzie string " "
	//1. split ans store the sentence in string []
	//2. run a for loop till <k
	//3. if index == k-1, append the string 
	//4. else append string & " "
	//5. return string
	
    public String truncateSentence(String s, int k) {
    	if(k==0) return s;
        String[] arr = s.split(" ");
        String f = "";
        
        if(arr.length==k) return f;

        for(int i=0; i<k;i++){
            if(i == k-1){
               f=f+arr[i]; 
            }
            else{
                f=f+(arr[i]+" ");
            }
        }

        return f;
    }

@Test
public void test1() {
	Assert.assertEquals("Hello how are you Contestant", truncateSentence("Hello how are you Contestant", 0));
}

@Test
public void test2() {

	Assert.assertEquals("Hello", truncateSentence("Hello how are you Contestant", 1));
}

@Test
public void test3() {
	Assert.assertEquals("", truncateSentence("chopper is not a tanuki", 5));
}


}
