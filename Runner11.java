
import java.util.Vector;



public class Runner11{

	public static void main(String args[]){
		System.out.println("main");
		Runner11 r = new Runner11();
		r.stringVector();
	}

	public void printVector(Vector v){
		for(int i = 0; i < v.size();i++){
			System.out.println(v.get(i));
		}

	}


	// public void intVectorTest(){
	// 	Vector vi = new Vector();
	// 	vi.add(4);
	// 	vi.add(5);
	// 	vi.add("somthing");
	// 	printVector(vi);

	// 	System.out.println(vi);//output directly
	// }

	public void stringVector(){
		Vector<String> vs = new Vector<String>();
		vs.add("first");
		vs.add("second");
		vs.add("third");

		System.out.println(vs);
		printVector(vs);
	}
}
