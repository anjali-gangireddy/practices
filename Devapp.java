package AbstractClassAndAbstractMethod.Example1;

public class Devapp extends ProjectApp{
//constructor

 public Devapp()
 {
	 System.out.println("Devapp.Devapp()");
 }
 
 
 //implementation for concrete method
 
 
 @Override
   public void task1() {
 	System.out.println("Devapp.task1()");
 	System.out.println("task 1 is completed");
 }
 
 
//implementation for abstract method
 
 
@Override
public void task2() {
	// TODO Auto-generated method stub
	System.out.println("Devapp.task2()");
	System.out.println("task 2 is completed");
	
}
}
