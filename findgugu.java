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
		System.out.println("ã������ ���� �Է��Ͻÿ�");
		int findnum=sc.nextInt();
		for(int c=1; c<=9; c++) {
			int h=findnum%c;
			int j=findnum/c;
			if(h==0) {
				
				set2.add(c+"X"+j+"="+findnum);
				/*set3.add(c+"�� ����Դϴ�."+c+"X"+j+"="+findnum);*/
				
			}
			else {
				// �ڿ���x�ڿ���=�ڿ��� �÷� ��Ÿ���� ���ϹǷ� ���տ� ���Խ�Ű�� �ʴ´�.
				
			}
			
		}
		Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2); //�� ������ �������� ��Ÿ���� ��� set1, set2�� �� �����ġ�� �־ ��� ����.
       
        int count=intersection.size();
        if(count==0) {
        	System.out.println("�ش� �������� �����ϴ�.");
        	/*List<String> listt = new ArrayList<>(set3);
        	Collections.sort(listt);
        	for(String a : listt) System.out.print(a + "\n");*/
        	
        }
        else {
        	
        	List<String> list = new ArrayList<>(intersection);
        	Collections.sort(list);
        	
        	for(String a : list) System.out.print(a + "\n");
        	/*System.out.println(intersection);*/
        	/*System.out.println("��� ������ ����"+count+"�� �Դϴ�.");*/
        	List<String> listt = new ArrayList<>(set3);
        	Collections.sort(listt);
        	for(String a : listt) System.out.print(a + "\n");
        	/*System.out.println(set3);*/
        }
        
	}
		
	catch(InputMismatchException ime) {
			System.out.println("�ڿ����� �Է��Ͻÿ�:");
              continue; //����ó���� �ڿ��� �̿��� �Է¹����� ���Է� �϶�� �õ�!
	

}
	
		}
	}
	
}

