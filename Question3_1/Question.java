package Question3_1;

import java.util.EmptyStackException;

public class Question {
	static int stacksize = 30;
	static int [] buffer =  new int [stacksize*3];
	
	// 3 stack pointer to keep track pf the top element
	static int [] stackPointer = {-1, -1, -1};
	
	static boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == -1;
	}
	
	static int absTopOfStack(int stackNum){
		return stackNum*stacksize + stackPointer[stackNum];
	}
	
	static void push(int stackNum, int value) throws Exception{
		if (stackPointer[stackNum]+1 > stacksize){
			throw new FullStackException();
		}
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	
	static int pop(int stackNum) throws Exception{
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
		int value = buffer[absTopOfStack(stackNum)];
		buffer[absTopOfStack(stackNum)] = 0;
		stackPointer[stackNum]--;
		return value;
	}
	
	static int peek(int stackNum){
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
		return buffer[absTopOfStack(stackNum)];
	}
	
	public static void main(String [] args) throws Exception  {
		push(2, 4);
		System.out.println("Peek 2: " + peek(2));
		push(0, 3);
		push(0, 7);
		push(0, 5);
		System.out.println("Peek 0: " + peek(0));
		pop(0);
		System.out.println("Peek 0: " + peek(0));
		pop(0);
		System.out.println("Peek 0: " + peek(0));
	}
}
