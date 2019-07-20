public class LinkedList{
	
	Node head; 
	
		//method to insert a node to the end 
	public void insertAtEnd(int Data) {
		
		Node node = new Node();
		node.Data=Data;
		node.NextNode=null;
		
		
		if(head==null) {
			
			head=node;
			
		}else {
			
			Node n = head;
			while(n.NextNode!= null) {
				n = n.NextNode;
				
			}
			n.NextNode=node;
		}
		
	}
	
//*************************************************************************************************************************************
//*************************************************************************************************************************************
	
	
	public void insertAtStart(int Data) {
		
		Node node = new Node();
		node.Data = Data;
		node.NextNode = null;
		node.NextNode = head;
		head = node;
		
	}
	
//*************************************************************************************************************************************
//*************************************************************************************************************************************
	
	//Method to Display all Nodes 
		public void show(){
			
			if(head == null) {
				System.out.println("No data Available");
			}
			else {
			Node nod = head;
			
			while(nod.NextNode != null) {
				System.out.println("Data : " + nod.Data);
				nod = nod.NextNode;	
				
			}
			System.out.println("Data : " + nod.Data);
			
			}
		}
	
//*************************************************************************************************************************************
//*************************************************************************************************************************************
		
		// to insert data at  a specified  index
	
		public void insertAt(int index , int Data) {
			
			Node node = new Node();
			node.Data = Data;
			node.NextNode = null;
			
			
			if( index == 0 ) {
				 
				insertAtStart(Data);
				
			}
			else {
				
				Node n = head;
				
				for(int i=0 ; i < index-1 ; i++) {
					
					n = n.NextNode;	
				}
				node.NextNode = n.NextNode;
				n.NextNode = node;
				
			}
		}
		
//*************************************************************************************************************************************
//*************************************************************************************************************************************
		
		
		public void deleteAt(int index) {
			
			if( index == 0 ) {
				
				head = head.NextNode;
				
			}
			else {
			
				Node n1 = head;
				Node n2 = null;
				
				for(int i=0 ; i<index-1 ; i++) {
					
					
					n1 = n1.NextNode;
					
				}
				n2 = n1.NextNode;
				n1.NextNode = n2.NextNode;
				n2 = null;
				
				
			}
			
		}


//*************************************************************************************************************************************
//*************************************************************************************************************************************
		
		
		void deleteFirst() {

			Node node = head;
			head = node.NextNode;
		
			
		}
		
//*************************************************************************************************************************************
//*************************************************************************************************************************************
		
		void deleteAll() {
		
			Node node = head;
			int count = 0 ;
			
			while(node.NextNode != null) {
				
				node = node.NextNode;
				count = count + 1;	
			}
			for(int i = 0 ; i <= count ; i++) {
				
				deleteFirst();
			}
			 
			
		}
		
		
		
//*************************************************************************************************************************************
//*************************************************************************************************************************************		
		
		//check if the list is empty
		
		boolean isEmpty() {
			
			return head == null;
			
			
		}


}



