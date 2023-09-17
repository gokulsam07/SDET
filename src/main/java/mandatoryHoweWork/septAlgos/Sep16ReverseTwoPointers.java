package mandatoryHoweWork.septAlgos;

public class Sep16ReverseTwoPointers {

	public static void main(String[] args) {
		String s ="sentence";
		char[] arr =s.toCharArray();
		//int i =0;
		//int j=s.length()-1;
		for(int i=0;i<s.length()/2;i++) {
			char temp=arr[i];
			arr[i]=arr[s.length()-1-i]; 
			arr[s.length()-1-i]=temp;
		}
		System.out.println(new String(arr));
	}

}
