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
			/* +->���ϱ� ����, - ->����, x,X-> ��������, %-> �� ���� ������ ��� �������� ��� */
			int a=rd.nextInt(3);
			int b=rd.nextInt(3);
			System.out.println(first[a]+","+second[b]+"�� �� ������ ���ʴ�� �Է��Ͻÿ�");
			for(int i=0; i<3; i++) {
					try {
						Scanner sc=new Scanner(System.in);
						if(i==0) {
							System.out.println("���� a�� �Է��Ͻÿ�->");
							firstnumber=sc.nextInt();
							if(a==0) {
								if(firstnumber<0) {
									System.out.println("���� a�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
							else if(a==1) {
								if(firstnumber<=0) {
									System.out.println("���� a�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
							else if(a==2) {
								if(firstnumber>0) {
									System.out.println("���� a�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
							else if(a==3) {
								if(firstnumber>=0) {
									System.out.println("���� a�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
						}
						else if(i==1) {
							System.out.println("���� b�� �Է��Ͻÿ�->");
							secondnumber=sc.nextInt();
							if(b==0) {
								if(secondnumber<0) {
									System.out.println("���� b�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
							else if(b==1) {
								if(secondnumber<=0) {
									System.out.println("���� b�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
							else if(b==2) {
								if(secondnumber>0) {
									System.out.println("���� b�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
							else if(b==3) {
								if(secondnumber>=0) {
									System.out.println("���� b�� �ٽ� �Է��Ͻÿ�");
									i--;
								}
							}
						}
						else if(i==2) {
							System.out.println("�����ڸ� �Է��Ͻÿ�->");
							calculation=sc.next();
							boolean contains=Arrays.stream(cal).anyMatch(calculation::equals);
							/*�迭 ���� ���� ����*/
							if(contains==false) {
								System.out.println("�����ڸ� �ٽ� �Է��Ͻÿ�");
								i--;
							}
							else if(contains=true) {
								number4 n4=new number4();
								n4.firstnumber=firstnumber;
								n4.secondnumber=secondnumber;
								n4.act(firstnumber, secondnumber);
								if(calculation.equals("+")) {
									System.out.println("������->");
									System.out.println(n4.hap());
								}
								else if(calculation.equals("-")) {
									System.out.println("������->");
									System.out.println(n4.diff());
								}
								else if(calculation.equals("x")) {
									System.out.println("������->");
									System.out.println(n4.gob());
								}
								else if(calculation.equals("X")) {
									System.out.println("������->");
									System.out.println(n4.gob());
								}
								else if(calculation.equals("%")) {
									if(secondnumber==0) {
										System.out.println("������->");
										System.out.println("�������");
									}
									else {
										System.out.println("������->");
										System.out.println("��"+n4.mok()+","+"��������"+n4.namuji());
									}
								}
							}
							
						} 
					}
					catch(InputMismatchException E) {
						if(i==0) {
							System.out.println("���� a�� �ٽ� �Է��Ͻÿ�");
							i--;
						}
						else if(i==1) {
							System.out.println("���� b�� �ٽ� �Է��Ͻÿ�");
							i--;
						}
					}
			}
			System.out.println("-------\r\n"
					+ "��ӽ����Ͻ÷��� enterŰ��\r\n"
					+ "�ߴ��Ϸ��� end�� �Է��Ͻÿ�\r\n"
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
					System.out.println("�ٽ� �Է��Ͻÿ�");
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
		System.out.println("���α׷��� �����մϴ�.");
	}
}
