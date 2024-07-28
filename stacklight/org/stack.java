package stacklight.org;

public class stack {
	int s[]= new int[10];
	int tos;
	
	stack() {
		tos=-1;
	}
	void push(int item) {
		if (tos==9)
			System.out.print("tha stack is full");
		else
		s[++tos]= item;
	}
	int pop() {
		if(tos>=0)
			return s[tos--];
		else
			System.out.println("the stack is empty");
		return -1;
	}


}
