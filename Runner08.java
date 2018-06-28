
/////abstract class /////////
//////cannot make object of class Polygon///



abstract class Polygon{

	int numSides;

	public Polygon(){

		this.numSides = 0;
	}
	//////constructor with parameter/constustor overloading/////
	public Polygon(int numSides){

		this.numSides = numSides;
	}



	public abstract double getArea();
} 



class Rectangle extends Polygon{

	////////constructor/////////
	public Rectangle(int x){

		/////////super call parent constructor////////
		super(x);
	}

	double length;
	double width;

	public void setSides(double length,double width){
		this.length = length;
		this.width = width;
	}
	///////getArea() function overriding./////////
	@Override
	/////////@Override anotation for same signature mistakes////////
	public double getArea(){
		return this.length * this.width;
	}
}
















public class Runner08{


	public static void main(String args[]){

///////////////abstract class cannot make object///////
		//Polygon p = new Polygon();
		//System.out.println("Area of Polygon : "+p.numSides);

		Rectangle r = new Rectangle(100);
		System.out.println("Rectangle sides : "+ r.numSides);

		////////parent class variable = child class abject///
		Polygon p = new Rectangle(7);

		r.setSides(5,5);
		System.out.println("Rectangle Area : "+ p.getArea());
		System.out.println("Rectangle sides : "+ p.numSides);


	}

}