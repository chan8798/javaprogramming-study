package find;
import java.util.*;
import java.util.InputMismatchException;
public class GuguQuize {
	public int check;
	public List<Object> Ar;
	public char a;
	
	public void calnumber() {
		stack(Ar);
	}
	
	public void Quiz() {
		for(int i=0; i<1; i++) {
			Scanner sc=new Scanner(System.in);
			try {
				int num=sc.nextInt();
				if(num==check) {
					System.out.println("정답입니다.");
					a='o';
				}
				else if(num!=check) {
					System.out.println("오답입니다.");
					System.out.println("정답은"+check+"입니다.");
					a='x';
				}
			}
			catch(InputMismatchException e) {
				System.out.println("다시 입력하시오");
				i-=1;
			}
		}
	}
	
	public String checkright() {
		if(a=='o') {
			return "o";
		}
		else if(a=='x') {
			return "x";
		}
		else {
			return " ";
		}
	}
	
	public void stack(List<Object> Ar) {
		List<Object> cal=new ArrayList<Object>();
		List<Object> nocal=new ArrayList<Object>();
		for(int i=0; i<Ar.size(); i++) {
			if(i%2==0) {
				int a=(int)Ar.get(i);
				nocal.add(a);
				if(nocal.size()>=2) {
					if(cal.contains("X")) {
					cal.remove("X");
					int num1=(int) nocal.get(nocal.size()-1);
					int num2=(int) nocal.get(nocal.size()-2);
					int newnum=num1*num2;
					nocal.remove(nocal.get(nocal.size()-2));
				    nocal.remove(nocal.get(nocal.size()-1));
					nocal.add(newnum);
					}
				}
			}
			else if(i%2!=0) {
				cal.add(Ar.get(i));
			}
		}
		remiancal(cal,nocal);
	}
	
	public void remiancal(List<Object> cal,List<Object> nocal) {
		for(int i=0; i<=cal.size()-1; i++) {
			int index=cal.size()-(i+1);
			if(cal.get(index)=="+") {
				cal.set(index," ");
				int num1=(int) nocal.get(nocal.size()-1);
				int num2=(int) nocal.get(nocal.size()-2);
				int newnum=num1+num2;
				nocal.remove(nocal.get(nocal.size()-2));
			    nocal.remove(nocal.get(nocal.size()-1));
				nocal.add(newnum);
				
			}
			else if(cal.get(index)=="-") {
				cal.set(index," ");
				int num1=(int) nocal.get(nocal.size()-1);
				int num2=(int) nocal.get(nocal.size()-2);
				int newnum=num2-num1;
				nocal.remove(nocal.get(nocal.size()-2));
			    nocal.remove(nocal.get(nocal.size()-1));
				nocal.add(newnum);
			}
		}
       /*  for(int i=0; i<nocal.size(); i++) {
         
        	System.out.print(nocal.get(i)+" ");
		}
        System.out.println();*/
        this.check=(int)nocal.get(0);
	}
	
	public static void main(String[] args) {
		for(int i=0; i<1; i++) {
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println("시행 횟수를 입력하시오");
				int pl=sc.nextInt();
				if(pl<=1) {
					System.out.println("다시 입력하시오");
					i-=1;
				}
				else {
					numberch(pl);
				}
			}
			catch(InputMismatchException e) {
				System.out.println("다시 입력하시오");
				i-=1;
			}
		}
	}
	public static void numberch(int pl) {
		GuguQuize qz=new GuguQuize();
		int right=0;
		int err=0;
		for(int i=0; i<pl; i++) {
			List<Object> Ar=new ArrayList<Object>();
			String cal[]=new String[] {"+","-","X"};
			int num=(int)(Math.random()*4)+2;
			for(int k=0; k<2*num-1; k++) {
				if(k%2==0) {
					int number=(int)((Math.random()*99)+1);
					Ar.add(number);			
				}
				else if(k%2!=0) {
					int choice=(int)((Math.random()*3));
					Ar.add(cal[choice]);
				}
			}
			for(int k=0; k<Ar.size(); k++) {
				System.out.print(Ar.get(k)+" ");
			}
			System.out.println();
			qz.Ar=Ar;
			qz.calnumber();
			qz.Quiz();
			if(qz.checkright()=="o") {
				right++;
			}
			else if(qz.checkright()=="x") {
				err++;
			}
		}
		score(right,err);
	}
	public static void score(int right, int err) {
		System.out.println("=========================");
		System.out.println("맞춘 갯수: "+right);
		System.out.println("틀린 갯수: "+err);
		System.out.println("=========================");
	}
}
