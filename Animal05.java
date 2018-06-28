public class Animal05{
	int legs;


	public int getlegs(){
		return this.legs;
	}

	public void printlegCount(String msg){

		System.out.println(msg + " : "+ getlegs());
	}

	public static void main (String args[]){

		System.out.println("Main function call..");
		Animal05 a = new Animal05();

		a.legs +=1;
		a.printlegCount("legs are : ");

	}
}