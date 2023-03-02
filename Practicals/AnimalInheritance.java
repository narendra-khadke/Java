package CoreJava;
//Parent Class
class AnimalInheritance {
	//Methods
	public void display() {
		System.out.println(">>>Inside Parent Class....");
	}
}
// Child Class
class Dog extends AnimalInheritance
{
	//method
	public void sound() 
	{
		System.out.println(">>>Barksss......");
	}
}
class Puppy extends Dog{
	public void Run()
	{
		System.out.println(">>>Its runs slowly.....");
	}
}
class MainClass{
	public static void main(String[]args) 
	{
		Puppy d=new Puppy(); //Creating obj of child class
		d.display();
		d.sound();
		d.Run();
	}
}