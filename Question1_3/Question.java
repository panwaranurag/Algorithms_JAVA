package Question1_3;

public class Question {
	public static void removeDuplicate(char[] str){
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		
		int tail = 1;
		for(int i =1; i < len; ++i){
			int j;
			for(j = 0; j < tail; ++j){
				if (str[i] == str[j])break;
			}
			if (j == tail){
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
	}
	
	public static void main(String[] args){
		char[] test = {'A', 'N', 'U', 'R', 'A', 'G'};
		removeDuplicate(test);
		System.out.println(test);
		
	}
	
}
