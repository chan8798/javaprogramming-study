package javastudy;
import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Collections;
import java.util.Random;

public class Lotto {
	public static void main(String args[]) {
		while(true) {
		try {
			List<Integer> random = new ArrayList<>();
			int lotto[] = new int [6];  	// ��ȣ ����
			for(int i=0; i<6; i++) {
				lotto[i] = (int)(Math.random() * 45) + 1;
				random.add(lotto[i]);
	       }
			
		/*System.out.println("�ζ� ��ȣ: "+random);*/
		
	  	 // ��ȣ ���
		for(int i=0; i<6; i++) {
			/*System.out.println(lotto[i] + " ");*/
		}	
			
			Scanner in1=new Scanner(System.in);
			Scanner in2=new Scanner(System.in);
			Scanner in3=new Scanner(System.in);
			Scanner in4=new Scanner(System.in);
			Scanner in5=new Scanner(System.in);
			Scanner in6=new Scanner(System.in);
			Scanner bon=new Scanner(System.in);
			 
			int intarr[] = new int[6];//�� �Է��� 6�� �� �� �ִ�.
			System.out.println("1���� 45������ 6���� �ڿ����� �Է��Ͻÿ� ");
			int k1=in1.nextInt();
			if(k1>45) {
				System.out.println("1���� 45������ �ڿ����� �ٽ� �Է��Ͻÿ� ");
				continue;
			}
			else {
				intarr[0]=k1;
			}
			int k2=in2.nextInt();
			if(k2>45) {
				System.out.println("1���� 45������ �ڿ����� �ٽ� �Է��Ͻÿ� ");
				continue;
			}
			else {
				intarr[1]=k2;
			}
			int k3=in3.nextInt();
			if(k3>45) {
				System.out.println("1���� 45������ �ڿ����� �ٽ� �Է��Ͻÿ� ");
				continue;
			}
			else {
				intarr[2]=k3;
			}
			int k4=in4.nextInt();
			if(k4>45) {
				System.out.println("1���� 45������ �ڿ����� �ٽ� �Է��Ͻÿ� ");
				continue;
			}
			else {
				intarr[3]=k4;
			}
			int k5=in5.nextInt();
			if(k5>45) {
				System.out.println("1���� 45������ �ڿ����� �ٽ� �Է��Ͻÿ� ");
				continue;
			}
			else {
				intarr[4]=k5;
			}
			int k6=in6.nextInt();
			if(k6>45) {
				System.out.print("1���� 45������ �ڿ����� �ٽ� �Է��Ͻÿ� ");
				continue;
			}
			else {
				intarr[5]=k6;
			}
			 List<Integer> listcheck = new ArrayList<>();
			 
			 for(int i=0; i<6; i++) {
					listcheck.add(intarr[i]);
				}
			 System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
			 int lottobo[] = new int [1]; //1���� ���� �����Ѵ�.
			 System.out.println("���ʽ� ��ȣ(1���� 45������ �ڿ����� �Է��Ͻÿ�)");
			 int b=bon.nextInt();
			 if(b>45) {
				 System.out.println("���� �ٽ��Է��ϼ���:");
				 continue;
			 }
			 else {
				 lottobo[0]=b;
			 }
			 List<Integer> listt = new ArrayList<>();
			 listt.add(lottobo[0]);
			 System.out.println("�ڽ��� �Է��� ���ʽ� �ζ� ��ȣ: "+listt);//���ʽ� �ζǹ�ȣ Ȯ��
			 
					
				
			 
			 
		List<Integer> list = new ArrayList<>();
		 Arrays.sort(intarr);
		 Arrays.sort(lotto);
        int p1 =0, p2=0;
        while(p1<6 && p2<6){
        	// �� �迭�� ���� ���Ͽ� ������ �ű��
            if(intarr[p1] == lotto[p2]){
                list.add(intarr[p1++]);
                p2++;
            }else if( intarr[p1] <lotto[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        /*System.out.print(list);*/
        int r = list.size();
       /* System.out.println(r);*/
        if(r==0 ) {
        	
        	System.out.println("���Դϴ�.");
        	System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
        	System.out.println("���� ��ȣ: "+random);
        	System.out.println("0�� ���߾����Ƿ� ���ʽ� ���ǹ� ");
        }
        else if(r==1) {
        	System.out.println("���Դϴ�.");
        	System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
        	System.out.println("���� ��ȣ: "+random);
        	System.out.println("1�� ���߾����Ƿ� ���ʽ� ���ǹ� ");
        }
        else if(r==2) {
        	System.out.println("���Դϴ�.");
        	System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
        	System.out.println("���� ��ȣ: "+random);
        	System.out.println("2�� ���߾����Ƿ� ���ʽ� ���ǹ� ");
        }
        else if(r==3) {
        	System.out.println("5���Դϴ�. �Ǹż� �ƹ��������� ���� 5000���� ���� �� �ֽ��ϴ�.");
        	System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
        	System.out.println("���� ��ȣ: "+random);
        	System.out.println("3�� ���߾����Ƿ� ���ʽ� ���ǹ� ");
        }
        else if(r==4) {
        	System.out.println("4���Դϴ�. �Ǹż� �ƹ��������� ���� 50000���� ���� �� �ֽ��ϴ�.");
        	System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
        	System.out.println("���� ��ȣ: "+random);
        	System.out.println("4�� ���߾����Ƿ� ���ʽ� ���ǹ� ");
        }
        else if(r==5) {
        	System.out.println("3���Դϴ�. �Ǹż� �ƹ��������� ���� 1500000���� ���� �� �ֽ��ϴ�.");
        	System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
        	System.out.println("���� ��ȣ: "+random);
        	System.out.println("5�� ���߾����Ƿ� ���ʽ� ���ǹ� ");
        }
        else if(r==6) {
        	bonuss(listt,listcheck,random,r);
        }

        /*for (Integer integer : list) {
        	System.out.print(integer + " ");
         } */  
         }
		catch(InputMismatchException ime){
			System.out.println("ó�� ���� ���� �ٽ� �Է��Ͻÿ�:");
			
		}	
	}
		
		
	}
	public static void bonuss(List<Integer> listt,List<Integer>listcheck,List<Integer>random, int r) {
		int lottoo[] = new int [1];  	// 1�� ������ ����
		List<Integer> listter = new ArrayList<>();
		for(int i=0; i<1; i++) {
			lottoo[i] = (int)(Math.random() * 45) + 1;
			listter.add(lottoo[i]);
       }
	/*System.out.println(listter);*/

  	 // ��ȣ ���
	for(int i=0; i<1; i++) {
		System.out.println(lottoo[i] + " ");
	}
	if(listt==listter) {
		System.out.println("���ϵ帳�ϴ�. 1�� 15���÷ �Ǽ̽��ϴ�.");
		System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
    	System.out.println("���� ��ȣ: "+random);
    	System.out.println("���� ���ʽ� ��ȣ:"+listter);
    	System.out.println("�ڽ��� �Է��� ���ʽ� �ζ� ��ȣ: "+listt);//���ʽ� �ζǹ�ȣ Ȯ��
	}
	else if(listt!=listter) {
		System.out.println("2���Դϴ�. ���ϵ帳�ϴ�. 3õ������÷ �Ǽ̽��ϴ�.");
		System.out.println("�ڽ��� �Է��� �ζ� ��ȣ: "+listcheck);
    	System.out.println("���� ��ȣ: "+random);
    	System.out.println("���� ���ʽ� ��ȣ:"+listter);
    	System.out.println("�ڽ��� �Է��� ���ʽ� �ζ� ��ȣ: "+listt);//���ʽ� �ζǹ�ȣ Ȯ��
	}
	
	
	
		}
	
 }        			