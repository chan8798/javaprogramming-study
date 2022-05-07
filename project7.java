package ch07;
import java.util.*;
import java.util.InputMismatchException;
public class project7 {
	public HashMap<String,String>tell;
	public String tellnumber;
	
	public void regist() {
		String name = null;
		for(int i=0; i<=2; i++) {
			Scanner sc=new Scanner(System.in);
			if(i==0) {
				System.out.println("��� �� �̸��� �Է� �Ͻÿ�>>");
				String put=sc.nextLine();
				name=put.replaceAll("\\s", "");
				boolean an=tell.containsKey(name);
				if(an==true) {
					System.out.println("��ϵ� �̸� �Դϴ�.");
					break;
				}
				else if(an==false) {
					System.out.println("�̸� ��� �Ϸ�!~");
				}
			}
			else if(i==1) {
				phonenumber();
			}
			else if(i==2) {
				tell.put(name, tellnumber);
			}
		}
	}
	
	public void phonenumber() {
	for(int i=0; i<1; i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� �� ��ȸ��ȣ �Է� �Ͻÿ�>>");
		String tn=sc.nextLine();
		tellnumber=tn.replaceAll("\\s", "");
		String[] array_number;
		array_number=tellnumber.split("");
		if(array_number[0].equals("0")){
			if(array_number.length!=13) {
				System.out.println("���Է� �Ͻʽÿ�");
				i-=1;
				}
				else {
				if(array_number[3].equals("-") & array_number[8].equals("-")) {
					String[] Ars=new String[13];
					for(int k=0; k<13; k++) {
						if(k==3) Ars[k]="0";
						else if(k==8) Ars[k]="0";
						else Ars[k]=array_number[k];	
					}
					final String REGEX = "[0-9]+";
					String number=String.join("", Ars);

					if(number.matches(REGEX)) {
						boolean an=tell.containsValue(tellnumber);
						if(an==true) {
							System.out.println("��ϵ� ��ȭ��ȣ �Դϴ�. �� �Է� �Ͻñ� �ٶ��ϴ�.");
							i-=1;
						}
						else if(an==false) {
							System.out.println("��ȭ��ȣ ��� �Ϸ�!~");
						}
					}
					else {
						System.out.println("�ٽ� �Է��Ͻÿ�");
						i-=1;
					}
				}
				else{
					System.out.println("���Է� �Ͻʽÿ�");
					i-=1;
				}
			}
		}
		else{
			System.out.println("���Է� �Ͻʽÿ�");
			i-=1;
		}
	}
	}
	public void research() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ž���� �̸��� �Է��Ͻÿ�");
		String n=sc.nextLine();
		String name=n.replaceAll("\\s", "");
		boolean s=tell.containsKey(name);
		Iterator<String>keys=tell.keySet().iterator();
		if(s==true) {
			String value=tell.get(name);
			System.out.println(name+"�� ��ȭ��ȣ: "+value);
		}
		else if(s==false) {
			System.out.println("��� �� �̸��� �����ϴ�.");
		}
	}
	
	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �̸��� �Է��Ͻÿ�");
		String n=sc.nextLine();
		String name=n.replaceAll("\\s", "");
		boolean s=tell.containsKey(name);
		if(s==true) {
			tell.remove(name);
			System.out.println("���� �Ǿ����ϴ�");
		}
		else if(s==false) {
			System.out.println("��� �� �̸��� �����ϴ�.");
		}
	}
	
	public void changeinformation() {
		for(int i=0; i<1; i++) {
			Scanner sc=new Scanner(System.in);
			Scanner tt=new Scanner(System.in);
			System.out.println("(����)�̸��� �Է��Ͻÿ�");
			String n=tt.nextLine();
		    String name=n.replaceAll("\\s", "");
			System.out.println("�̸��� �����Ϸ���>>(1), ��ȭ��ȣ�� ����>>(2)�� �Է��Ͻÿ�.");
			try {
				int ch=sc.nextInt();
				if(ch==1) {
					boolean s=tell.containsKey(name);
					if(s==true) {
						Scanner at=new Scanner(System.in);
						System.out.println("�ٲ� �̸��� �Է��Ͻÿ�");
						String t=at.nextLine();
						String changename=t.replaceAll("\\s", "");
						boolean v=tell.containsKey(changename);
						if(v==false) {
							for(int r=0; r<1; r++) {
								Scanner st=new Scanner(System.in);
								System.out.println("��ȭ��ȣ�� �ٲܷ� ��(A), ����� ������ ��(B)�� �Է��Ͻÿ�");
								String c=st.nextLine();
								String al=c.replaceAll("\\s", "");
								if(al.equals("A")) {
									phonenumber();
									tell.remove(name);
									tell.put(changename, tellnumber);
									System.out.println("������ ���� �Ǿ����ϴ�.");	
									
								}
								else if(al.equals("B")) {
									Iterator<String>keys=tell.keySet().iterator();
									String value=tell.get(name);
									tell.remove(name);
									tell.put(changename, value);
									System.out.println(changename+"�� ��ȭ��ȣ: "+value);
									System.out.println("������ ���� �Ǿ����ϴ�.");		
								}
								else {
									System.out.println("�ٽ� �����Ͻñ� �ٶ��ϴ�.");
									r-=1;
								}
							}
						}
						else if(v=true) {
							System.out.println("�����ϴ� �̸� �Դϴ�.");
							i-=1;
						}
					}
					else if(s==false) {
						System.out.println("��ϵ� �̸��� �����ϴ�.");
						break;
					}
				}
				else if(ch==2) {
					phonenumber();
					tell.put(name, tellnumber);
					System.out.println("������ ���� �Ǿ����ϴ�.");	
					
				}
				else {
					System.out.println("�ٽ� ������ �ֽñ� �ٶ��ϴ�.");
					i-=1;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("�ٽ� ������ �ֽñ� �ٶ��ϴ�.");
				i-=1;
			}
		}
	}
	
	public void Allname() {
		Collection<String> keys=tell.keySet();
		System.out.println(keys);
	}
	
	public static void main(String[] args) {
		HashMap<String,String>tell=new HashMap<String,String>();
		project7 p7=new project7();
		p7.tell=tell;
		while(true) {
			System.out.println("��ȭ��ȣ�� ���� ���α׷�");
			System.out.println("���(1)>>");
			System.out.println("Ž��(2)>>");
			System.out.println("����(3)>>");
			System.out.println("��ü(4)>>");
			System.out.println("����̸����(5)>>");
			System.out.println("����(6)>>");
			Scanner sc=new Scanner(System.in);
			try {
				int choice=sc.nextInt();
				if(choice<=0) {
				System.out.println("�ٽ� �Է��Ͻÿ�");
				}	
				else if(choice>=7){
					System.out.println("�ٽ� �Է��Ͻÿ�");		
				}	
				else if(choice==6) {
					break;
				}
				else if(choice==1) {
					p7.regist();
				}
				else if(choice==2) {
					p7.research();
				}	
				else if(choice==3) {
					p7.delete();
				}
				else if(choice==4) {
					p7.changeinformation();
				}
				else if(choice==5) {
					p7.Allname();
				}
			}
			catch(InputMismatchException e) {
				System.out.println("�ٽ� �Է��Ͻÿ�");		
			}
		}		
			System.out.println("���α׷��� ���� �մϴ�.");		
		}
	}