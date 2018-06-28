public class Math{

	//////////Fuction overloading//////////
	////////java has no default argument//////

	public double sqrt(int x,double gues){

		System.out.println("Calculating sqrt of "+x+" starting with gues"+gues);
		return 1.0;
		
	}
	public double sqrt(int x){
		double gues = 1.0;
		
		return sqrt(x,gues);
	}

	public double sqrt(double x){
		double gues = 1.0;
		System.out.println("Calculating sqrt of "+x+"starting with gues"+gues);
		return 1.0;
	}

	public static void main(String arg[]){
		Math m = new Math();
		m.sqrt(36);
		m.sqrt(36,4.0);
		m.sqrt(36.6);

	}
}