
public class Animal02 {

	int legs = 4;//class members
	public  int getlegs(){
		return this.legs ;
	}
	private void constructorTest(){
		int x = 5;
		if (x == 5)
			System.out.println("X is 5");
		for(int i  = 0; i < x; i++)
			System.out.println("looping " + i);
	}
	public static void main(String args[]) {
		System.out.println("main function call..");
		Animal02 a = new Animal02();
		Animal02 b = new Animal02();
		a.legs = b.legs + a.legs;
		System.out.println("legs = "+ a.legs);
		float c = b.getlegs(); 
		System.out.println("legs = "+ c);
		b.constructorTest();
	}
	
	

		

	
	
};