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
				System.out.println("등록 할 이름을 입력 하시오>>");
				String put=sc.nextLine();
				name=put.replaceAll("\\s", "");
				boolean an=tell.containsKey(name);
				if(an==true) {
					System.out.println("등록된 이름 입니다.");
					break;
				}
				else if(an==false) {
					System.out.println("이름 등록 완료!~");
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
		System.out.println("등록 할 전회번호 입력 하시오>>");
		String tn=sc.nextLine();
		tellnumber=tn.replaceAll("\\s", "");
		String[] array_number;
		array_number=tellnumber.split("");
		if(array_number[0].equals("0")){
			if(array_number.length!=13) {
				System.out.println("재입력 하십시오");
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
							System.out.println("등록된 전화번호 입니다. 재 입력 하시기 바랍니다.");
							i-=1;
						}
						else if(an==false) {
							System.out.println("전화번호 등록 완료!~");
						}
					}
					else {
						System.out.println("다시 입력하시오");
						i-=1;
					}
				}
				else{
					System.out.println("재입력 하십시오");
					i-=1;
				}
			}
		}
		else{
			System.out.println("재입력 하십시오");
			i-=1;
		}
	}
	}
	public void research() {
		Scanner sc=new Scanner(System.in);
		System.out.println("탐색할 이름을 입력하시오");
		String n=sc.nextLine();
		String name=n.replaceAll("\\s", "");
		boolean s=tell.containsKey(name);
		Iterator<String>keys=tell.keySet().iterator();
		if(s==true) {
			String value=tell.get(name);
			System.out.println(name+"의 전화번호: "+value);
		}
		else if(s==false) {
			System.out.println("등록 된 이름이 없습니다.");
		}
	}
	
	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하시오");
		String n=sc.nextLine();
		String name=n.replaceAll("\\s", "");
		boolean s=tell.containsKey(name);
		if(s==true) {
			tell.remove(name);
			System.out.println("삭제 되었습니다");
		}
		else if(s==false) {
			System.out.println("등록 된 이름이 없습니다.");
		}
	}
	
	public void changeinformation() {
		for(int i=0; i<1; i++) {
			Scanner sc=new Scanner(System.in);
			Scanner tt=new Scanner(System.in);
			System.out.println("(본래)이름을 입력하시오");
			String n=tt.nextLine();
		    String name=n.replaceAll("\\s", "");
			System.out.println("이름을 변경하려면>>(1), 전화번호만 변경>>(2)를 입력하시오.");
			try {
				int ch=sc.nextInt();
				if(ch==1) {
					boolean s=tell.containsKey(name);
					if(s==true) {
						Scanner at=new Scanner(System.in);
						System.out.println("바꿀 이름을 입력하시오");
						String t=at.nextLine();
						String changename=t.replaceAll("\\s", "");
						boolean v=tell.containsKey(changename);
						if(v==false) {
							for(int r=0; r<1; r++) {
								Scanner st=new Scanner(System.in);
								System.out.println("전화번호를 바꿀려 면(A), 비꾸지 않으려 면(B)를 입력하시오");
								String c=st.nextLine();
								String al=c.replaceAll("\\s", "");
								if(al.equals("A")) {
									phonenumber();
									tell.remove(name);
									tell.put(changename, tellnumber);
									System.out.println("정보가 수정 되었습니다.");	
									
								}
								else if(al.equals("B")) {
									Iterator<String>keys=tell.keySet().iterator();
									String value=tell.get(name);
									tell.remove(name);
									tell.put(changename, value);
									System.out.println(changename+"의 전화번호: "+value);
									System.out.println("정보가 수정 되었습니다.");		
								}
								else {
									System.out.println("다시 선택하시길 바랍니다.");
									r-=1;
								}
							}
						}
						else if(v=true) {
							System.out.println("존재하는 이름 입니다.");
							i-=1;
						}
					}
					else if(s==false) {
						System.out.println("등록된 이름이 없습니다.");
						break;
					}
				}
				else if(ch==2) {
					phonenumber();
					tell.put(name, tellnumber);
					System.out.println("정보가 수정 되었습니다.");	
					
				}
				else {
					System.out.println("다시 선택해 주시길 바랍니다.");
					i-=1;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("다시 선택해 주시길 바랍니다.");
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
			System.out.println("전화번호부 관리 프로그램");
			System.out.println("등록(1)>>");
			System.out.println("탐색(2)>>");
			System.out.println("삭제(3)>>");
			System.out.println("대체(4)>>");
			System.out.println("모든이름출력(5)>>");
			System.out.println("종류(6)>>");
			Scanner sc=new Scanner(System.in);
			try {
				int choice=sc.nextInt();
				if(choice<=0) {
				System.out.println("다시 입력하시오");
				}	
				else if(choice>=7){
					System.out.println("다시 입력하시오");		
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
				System.out.println("다시 입력하시오");		
			}
		}		
			System.out.println("프로그램을 종류 합니다.");		
		}
	}