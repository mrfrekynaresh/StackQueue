package queue.org;

public class queuedomo {
	int q1[]= new int[5];
	int top;
	
	queuedomo(){
		top=5;
	}
	 void enqueue(int item) {
		 if(top==-1)
			 System.out.println("  ds   ");
		 else
		 q1[--top]=item;
		 
	 }
	int  dequeue(){
		if(top==5)
			System.out.println("   ews   ");
		else
		return q1[top++];
		
		return 0;
	}

}
