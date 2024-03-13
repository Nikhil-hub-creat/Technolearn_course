class Person //parent--Super--base class
{
	int pid;
    public Person(int pid)
	{
		this.pid=pid;
	}
	public void show()
	{
		System.out.println("Person Id:"+pid);
	}
}
class Human1 extends Person //child --Sub--derived class
{
	String name;
	 public Human1(int pid,String name)
	 {
		super(pid); 
		this.name=name;
	}
	 public void show()
	 {
		 super.show();
		 System.out.println("Human Name Is:"+name);
	 }
}
public class overRiding 
{
	public static void main(String[] args) 
	{
     Human1 h=new Human1(7898,"Sarthak");
     h.show();
	}
}