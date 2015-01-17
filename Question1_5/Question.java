package Question1_5;
import CtCILibrary.AssortedMethods;

public class Question {
	public static void replaceFun(char[] str, int length){
		int spacecount = 0, newlength, i =0;
		for(i =0; i < length; i++){
			if(str[i] == ' '){
				spacecount++;
			}
		}
		newlength = length + spacecount*2;
		str[newlength] = '\0';
		for(i = length-1; i >= 0; i--){
			if (str[i] == ' '){
				str[newlength-1] = '0';
				str[newlength-2] = '2';
				str[newlength-3] = '%';
				newlength = newlength-3;
			}
			else{
				str[newlength-1] = str[i];
				newlength = newlength-1;
				
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		replaceFun(arr, str.length());	
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}
}
