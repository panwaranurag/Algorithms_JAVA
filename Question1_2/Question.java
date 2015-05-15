package Question1_2;

public class Question {
	static void reverse(char[] str){
		int head = 0;
		int tail = str.length-2;
		while(head < tail){
			char temp = str[head];
			str[head] = str[tail];
			str[tail] = temp;
			head++;
			tail--;
		}
	}
	
	public static void main(String[] args){
		char[] test = {'A', 'N', 'U', 'R', 'A', 'G', '\0'};
		reverse(test);
		System.out.println(test);
		check();
	}
	public static void check(){
		System.out.println("Nitish is cool guy!!!");
	}

}
