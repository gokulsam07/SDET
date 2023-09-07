package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;


public class Sep8LCHW_SortWords {
	
	//Input: String
	//Output : String
	//Logic
	//1. Split the given s to for String[]
	//2. Create a new String res of size that equals the size of split String[]
	//3. Run a for loop to get the value of int (num) at the end of each String using charAt(x.length()-1)
	//4. Take the substring of each available value in [] by excluding the last value & store it in (num-1) index of res
	//return String after join operation of the array

	public String sortSentence(String s) {

		String[] split = s.split(" ");
		String[] res= new String[split.length];
		for (int i = 0; i < split.length; i++) {
			int num=split[i].charAt(split[i].length()-1)-'0';
			res[num-1]=split[i].substring(0,split[i].length()-1);
		}


		return String.join(" ", res);
	}

	@Test
	public void test1() {
		Assert.assertEquals("This is a sentence",sortSentence("is2 sentence4 This1 a3"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("Hey how are you",sortSentence("Hey1 are3 you4 how2"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("Hey",sortSentence("Hey1"));
	}
}
