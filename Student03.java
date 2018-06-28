public class Student03 {
	static int num = 0;
	int rollNo;
	public Student03(){
		rollNo =9;
		num +=1;
	}

	public static void main(String args[]){

		Student03 s1 = new Student03();
		Student03 s2 = new Student03();
		s1.num +=1;
		System.out.println("s1 = " + (s1.num+1));
		System.out.println("s2 = " + s2.rollNo);
		System.out.println("class  =  " + Student03.num);



	}
};