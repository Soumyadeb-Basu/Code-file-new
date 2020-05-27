package my_Program;


interface I1
{
	void a();

}
abstract class Check
{
	abstract void print();
	void display()
	{
		System.out.println("Display");
	}
}
class properties extends Check implements I1
{
	public void a()
    {
   	 System.out.println("Interface");
    }
	void print()
	{
		System.out.println("abstract class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     properties o=new properties();
     o.a();
     o.print();
     o.display();
	}

}
