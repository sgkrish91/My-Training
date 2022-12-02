package accessmodifier2;

import accessmodifier1.Access1;
public class Access2 extends Access1{

	public static void main(String[] args) {
		
		Access1 obj=new Access1();	//Aggregation
		//obj.add();	We cannot invoke add() method from Access1 class since it is private.
		obj.display();	//We can invoke method display using aggregation since it is public
		//obj.sub();
		Access2 obj1=new Access2();
		System.out.println(obj1.sub());
		
		//obj1.print1();	We cannot invoke print1() method since it is default.

	}

}
