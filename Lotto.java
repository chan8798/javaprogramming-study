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
			int lotto[] = new int [6];  	// 번호 생성
			for(int i=0; i<6; i++) {
				lotto[i] = (int)(Math.random() * 45) + 1;
				random.add(lotto[i]);
	       }
			
		/*System.out.println("로또 번호: "+random);*/
		
	  	 // 번호 출력
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
			 
			int intarr[] = new int[6];//수 입력을 6번 할 수 있다.
			System.out.println("1부터 45이하의 6개의 자연수를 입력하시오 ");
			int k1=in1.nextInt();
			if(k1>45) {
				System.out.println("1부터 45이하의 자연수를 다시 입력하시오 ");
				continue;
			}
			else {
				intarr[0]=k1;
			}
			int k2=in2.nextInt();
			if(k2>45) {
				System.out.println("1부터 45이하의 자연수를 다시 입력하시오 ");
				continue;
			}
			else {
				intarr[1]=k2;
			}
			int k3=in3.nextInt();
			if(k3>45) {
				System.out.println("1부터 45이하의 자연수를 다시 입력하시오 ");
				continue;
			}
			else {
				intarr[2]=k3;
			}
			int k4=in4.nextInt();
			if(k4>45) {
				System.out.println("1부터 45이하의 자연수를 다시 입력하시오 ");
				continue;
			}
			else {
				intarr[3]=k4;
			}
			int k5=in5.nextInt();
			if(k5>45) {
				System.out.println("1부터 45이하의 자연수를 다시 입력하시오 ");
				continue;
			}
			else {
				intarr[4]=k5;
			}
			int k6=in6.nextInt();
			if(k6>45) {
				System.out.print("1부터 45이하의 자연수를 다시 입력하시오 ");
				continue;
			}
			else {
				intarr[5]=k6;
			}
			 List<Integer> listcheck = new ArrayList<>();
			 
			 for(int i=0; i<6; i++) {
					listcheck.add(intarr[i]);
				}
			 System.out.println("자신이 입력한 로또 번호: "+listcheck);
			 int lottobo[] = new int [1]; //1개의 값만 저장한다.
			 System.out.println("보너스 번호(1부터 45이하의 자연수를 입력하시오)");
			 int b=bon.nextInt();
			 if(b>45) {
				 System.out.println("수를 다시입력하세요:");
				 continue;
			 }
			 else {
				 lottobo[0]=b;
			 }
			 List<Integer> listt = new ArrayList<>();
			 listt.add(lottobo[0]);
			 System.out.println("자신이 입력한 보너스 로또 번호: "+listt);//보너스 로또번호 확인
			 
					
				
			 
			 
		List<Integer> list = new ArrayList<>();
		 Arrays.sort(intarr);
		 Arrays.sort(lotto);
        int p1 =0, p2=0;
        while(p1<6 && p2<6){
        	// 두 배열의 원소 비교하여 포인터 옮기기
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
        	
        	System.out.println("꽝입니다.");
        	System.out.println("자신이 입력한 로또 번호: "+listcheck);
        	System.out.println("정답 번호: "+random);
        	System.out.println("0개 맞추었으므로 보너스 무의미 ");
        }
        else if(r==1) {
        	System.out.println("꽝입니다.");
        	System.out.println("자신이 입력한 로또 번호: "+listcheck);
        	System.out.println("정답 번호: "+random);
        	System.out.println("1개 맞추었으므로 보너스 무의미 ");
        }
        else if(r==2) {
        	System.out.println("꽝입니다.");
        	System.out.println("자신이 입력한 로또 번호: "+listcheck);
        	System.out.println("정답 번호: "+random);
        	System.out.println("2개 맞추었으므로 보너스 무의미 ");
        }
        else if(r==3) {
        	System.out.println("5등입니다. 판매소 아무데나가서 현금 5000원을 받을 수 있습니다.");
        	System.out.println("자신이 입력한 로또 번호: "+listcheck);
        	System.out.println("정답 번호: "+random);
        	System.out.println("3개 맞추었으므로 보너스 무의미 ");
        }
        else if(r==4) {
        	System.out.println("4등입니다. 판매소 아무데나가서 현금 50000원을 받을 수 있습니다.");
        	System.out.println("자신이 입력한 로또 번호: "+listcheck);
        	System.out.println("정답 번호: "+random);
        	System.out.println("4개 맞추었으므로 보너스 무의미 ");
        }
        else if(r==5) {
        	System.out.println("3등입니다. 판매소 아무데나가서 현금 1500000원을 받을 수 있습니다.");
        	System.out.println("자신이 입력한 로또 번호: "+listcheck);
        	System.out.println("정답 번호: "+random);
        	System.out.println("5개 맞추었으므로 보너스 무의미 ");
        }
        else if(r==6) {
        	bonuss(listt,listcheck,random,r);
        }

        /*for (Integer integer : list) {
        	System.out.print(integer + " ");
         } */  
         }
		catch(InputMismatchException ime){
			System.out.println("처음 부터 수를 다시 입력하시오:");
			
		}	
	}
		
		
	}
	public static void bonuss(List<Integer> listt,List<Integer>listcheck,List<Integer>random, int r) {
		int lottoo[] = new int [1];  	// 1의 난수만 추출
		List<Integer> listter = new ArrayList<>();
		for(int i=0; i<1; i++) {
			lottoo[i] = (int)(Math.random() * 45) + 1;
			listter.add(lottoo[i]);
       }
	/*System.out.println(listter);*/

  	 // 번호 출력
	for(int i=0; i<1; i++) {
		System.out.println(lottoo[i] + " ");
	}
	if(listt==listter) {
		System.out.println("측하드립니다. 1등 15억당첨 되셨습니다.");
		System.out.println("자신이 입력한 로또 번호: "+listcheck);
    	System.out.println("정답 번호: "+random);
    	System.out.println("정답 보너스 번호:"+listter);
    	System.out.println("자신이 입력한 보너스 로또 번호: "+listt);//보너스 로또번호 확인
	}
	else if(listt!=listter) {
		System.out.println("2등입니다. 측하드립니다. 3천만원당첨 되셨습니다.");
		System.out.println("자신이 입력한 로또 번호: "+listcheck);
    	System.out.println("정답 번호: "+random);
    	System.out.println("정답 보너스 번호:"+listter);
    	System.out.println("자신이 입력한 보너스 로또 번호: "+listt);//보너스 로또번호 확인
	}
	
	
	
		}
	
 }        			