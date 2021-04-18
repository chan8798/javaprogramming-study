package javaprogrammingch4;

public class Circlec {
	int radius;
	String name;
	
	public Circlec() {
		radius=1; name="";
	}
	public Circlec (int r,String n) {
		radius=r; name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] ars) {
		Circlec pizza=new Circlec(10,"자바피자");
		
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		Circlec donut=new Circlec();
		donut.name="도넛피자";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
	}

}
