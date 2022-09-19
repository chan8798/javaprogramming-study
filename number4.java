package study;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class number4 {
	private int firstnumber;
	private int secondnumber;

	public void act(int firstnumber, int secondnumber) {
		this.firstnumber=firstnumber;
		this.secondnumber=secondnumber;
	}
	public String hap() {
		int a=firstnumber+secondnumber;
		return ("("+firstnumber+")"+"+"+"("+secondnumber+")"+"="+a);
	}
	public String diff() {
		int a=firstnumber-secondnumber;
		return ("("+firstnumber+")"+"-"+"("+secondnumber+")"+"="+a);
	}
	public String gob() {
		int a=firstnumber*secondnumber;
		return ("("+firstnumber+")"+"x"+"("+secondnumber+")"+"="+a);
	}
	public int mok() {
		return firstnumber/secondnumber;
	}
	public int namuji() {
		return firstnumber%secondnumber;
	}
	public static void main(String[] args) {
		while(true) {
			Random rd=new Random();
			int firstnumber=0;
			int secondnumber=0;
			String calculation;
			String[] first={"a>=0","a>0","a<=0","a<0"};
			String[] second= {"b>=0","b>0","b<=0","b<0"};
			String[] cal= {"+","-","X","x","%"};
			/* +->더하기 연산, - ->뺄셈, x,X-> 곱셉연산, %-> 두 수를 나누면 몫과 나머지를 출력 */
			int a=rd.nextInt(3);
			int b=rd.nextInt(3);
			System.out.println(first[a]+","+second[b]+"인 두 정수를 차례대로 입력하시오");
			for(int i=0; i<3; i++) {
					try {
						Scanner sc=new Scanner(System.in);
						if(i==0) {
							System.out.println("정수 a를 입력하시오->");
							firstnumber=sc.nextInt();
							if(a==0) {
								if(firstnumber<0) {
									System.out.println("정수 a를 다시 입력하시오");
									i--;
								}
							}
							else if(a==1) {
								if(firstnumber<=0) {
									System.out.println("정수 a를 다시 입력하시오");
									i--;
								}
							}
							else if(a==2) {
								if(firstnumber>0) {
									System.out.println("정수 a를 다시 입력하시오");
									i--;
								}
							}
							else if(a==3) {
								if(firstnumber>=0) {
									System.out.println("정수 a를 다시 입력하시오");
									i--;
								}
							}
						}
						else if(i==1) {
							System.out.println("정수 b를 입력하시오->");
							secondnumber=sc.nextInt();
							if(b==0) {
								if(secondnumber<0) {
									System.out.println("정수 b를 다시 입력하시오");
									i--;
								}
							}
							else if(b==1) {
								if(secondnumber<=0) {
									System.out.println("정수 b를 다시 입력하시오");
									i--;
								}
							}
							else if(b==2) {
								if(secondnumber>0) {
									System.out.println("정수 b를 다시 입력하시오");
									i--;
								}
							}
							else if(b==3) {
								if(secondnumber>=0) {
									System.out.println("정수 b를 다시 입력하시오");
									i--;
								}
							}
						}
						else if(i==2) {
							System.out.println("연산자를 입력하시오->");
							calculation=sc.next();
							boolean contains=Arrays.stream(cal).anyMatch(calculation::equals);
							/*배열 원소 포함 여부*/
							if(contains==false) {
								System.out.println("연산자를 다시 입력하시오");
								i--;
							}
							else if(contains=true) {
								number4 n4=new number4();
								n4.firstnumber=firstnumber;
								n4.secondnumber=secondnumber;
								n4.act(firstnumber, secondnumber);
								if(calculation.equals("+")) {
									System.out.println("연산결과->");
									System.out.println(n4.hap());
								}
								else if(calculation.equals("-")) {
									System.out.println("연산결과->");
									System.out.println(n4.diff());
								}
								else if(calculation.equals("x")) {
									System.out.println("연산결과->");
									System.out.println(n4.gob());
								}
								else if(calculation.equals("X")) {
									System.out.println("연산결과->");
									System.out.println(n4.gob());
								}
								else if(calculation.equals("%")) {
									if(secondnumber==0) {
										System.out.println("연산결과->");
										System.out.println("연산오류");
									}
									else {
										System.out.println("연산결과->");
										System.out.println("몫"+n4.mok()+","+"나머지는"+n4.namuji());
									}
								}
							}
							
						} 
					}
					catch(InputMismatchException E) {
						if(i==0) {
							System.out.println("정수 a를 다시 입력하시오");
							i--;
						}
						else if(i==1) {
							System.out.println("정수 b를 다시 입력하시오");
							i--;
						}
					}
			}
			System.out.println("-------\r\n"
					+ "계속시행하시려면 enter키를\r\n"
					+ "중단하려면 end를 입력하시오\r\n"
					+ "-------");
			String key = null;
			for(int k=0; k<1; k++) {
				Scanner scc=new Scanner(System.in);
				key=scc.nextLine();
				if(key.equals("end")) {
					break;
				}
				else if(key.equals("")) {
					break;
				}
				else {
					System.out.println("다시 입력하시오");
					k--;
				}
			}
			if(key.equals("end")) {
				break;
			}
			else if(key.equals("")) {
				continue;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
