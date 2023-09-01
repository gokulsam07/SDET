package mandatoryHomeWork.postfoundationDailyHW;

public class Sep1CW_AlternateCharPrint {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i='a';i<='z';i=i+2) {
			sb.append((char)i);
		}
		System.out.println(new String(sb));
	}

}
