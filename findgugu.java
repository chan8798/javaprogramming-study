package javastudy;



import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Collections;
public class findgugu {
	public static void main(String args[]) {
  while(true) {
		try {
		Scanner sc=new Scanner(System.in);	
		HashSet<String>set1 = new HashSet<String>();
		HashSet<String>set2 = new HashSet<String>();
		HashSet<String>set3 = new HashSet<String>();
		for(int i=1; i<=9; i++) {
			for(int k=1; k<=9; k++) {
				set1.add(i+"X"+k+"="+i*k);
			}	
		}
		System.out.println("찾을려는 수를 입력하시오");
		int findnum=sc.nextInt();
		for(int c=1; c<=9; c++) {
			int h=findnum%c;
			int j=findnum/c;
			if(h==0) {
				
				set2.add(c+"X"+j+"="+findnum);
				/*set3.add(c+"의 배수입니다."+c+"X"+j+"="+findnum);*/
				
			}
			else {
				// 자연수x자연수=자연수 꼴로 나타내지 못하므로 집합에 포함시키지 않는다.
				
			}
			
		}
		Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2); //두 집합의 교집합을 나타낼때 사용 set1, set2둘 중 어느위치에 있어도 상관 없다.
       
        int count=intersection.size();
        if(count==0) {
        	System.out.println("해당 구구단이 없습니다.");
        	/*List<String> listt = new ArrayList<>(set3);
        	Collections.sort(listt);
        	for(String a : listt) System.out.print(a + "\n");*/
        	
        }
        else {
        	
        	List<String> list = new ArrayList<>(intersection);
        	Collections.sort(list);
        	
        	for(String a : list) System.out.print(a + "\n");
        	/*System.out.println(intersection);*/
        	/*System.out.println("헤당 구구단 수는"+count+"개 입니다.");*/
        	List<String> listt = new ArrayList<>(set3);
        	Collections.sort(listt);
        	for(String a : listt) System.out.print(a + "\n");
        	/*System.out.println(set3);*/
        }
        
	}
		
	catch(InputMismatchException ime) {
			System.out.println("자연수로 입력하시오:");
              continue; //예외처리문 자연수 이외의 입력받으면 재입력 하라고 시도!
	

}
	
		}
	}
	
}

