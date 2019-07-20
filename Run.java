//Written by Rashmika gamage 

public class Run {
	public static void main(String[] args) {
		
		
		LinkedList l = new LinkedList();
		
		l.insertAtEnd(10);  //inser at the end
		l.insertAtEnd(20);
		l.insertAtEnd(40);
		l.insertAtEnd(50);
		
		l.insertAt(2,30);	// insert at a specified index
		
		System.out.println("Before Deleted :  ");
		
		l.show();		//display all the data in the  indexes 
		
		l.deleteAt(2);	//delete at a specified index
		
		System.out.println("After deleted : ");
		
		l.show(); 		//display all the data in the  indexes 
		
		l.deleteFirst();
		
		System.out.println("After deleting first : ");  //deleting first node;
		
		
		l.show();
		
		System.out.println("After deleting all : ");  //deleting all the nodes;
		
		l.deleteAll();
		
		l.show();
		

		
		}
}
	
	
			


