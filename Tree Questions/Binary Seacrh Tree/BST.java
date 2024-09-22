class BST
{
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int d)
		{
			this.data=d;
			left=right=null;
		}
	}
	BST()
	{
		root=null;
	}
	BST(int d)
	{
		root=new Node(d);
	}
	void printInorder(Node root)
	{
		if(root==null)
			return;
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	void Inorder()
	{
		printInorder(root);
	}
  void printPreorder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	void Preorder()
	{
		printPreorder(root);
	}
	 void printPostorder(Node root)
	{
		if(root==null)
			return;
		
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+" ");
	}
	void Postorder()
	{
		printPostorder(root);
	}
	
	Node insertData(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		if(key <= root.data)
		root.left=insertData(root.left,key);
	   else
		root.right=insertData(root.right,key);
	   
	   return root;
	}
	void insert(int key)
	{
		root=insertData(root,key);
		System.out.println("root is added"+key);
	}
	
	public Node deleteData(Node root,int key)
	{
		if(root==null)
			return root;
		if(key<root.data)
			root.left=deleteData(root.left,key);
		else if(key>root.data)
		root.right=deleteData(root.right,key);
	else{
		if(root.left==null)
			return root.right;
		else
			return root.left;
		
		root.data= minValue(root.right);
		root.right=deleteData(root.right,root.data);
	}
	  return root;
	
	}
	int minValue(Node root)
	{
		int x=root.data;
		while(root.left!=null)
		{
			x=root.left.data;
			root=root.left;
		}
		return x;
		
	}
	void delete(int key)
	{
		root=deleteData(root,key);
	}
	public static void main(String []args)
	{
		BST t1=new BST();
		t1.root=new Node(52);
		t1.root.left=new Node(36);
		t1.root.left.left=new Node(30);
		t1.root.left.right=new Node(40);
		t1.root.right=new Node(60);
		t1.root.right.left=new Node(55);
		t1.root.right.right=new Node(75);
		t1.Inorder();
		System.out.println();

		t1.insert(25);
		t1.insert(55);
		System.out.println();
		t1.Inorder();
	System.out.println();
	t1.delete(55);
		
		
		
		
		
		
		
	}
}