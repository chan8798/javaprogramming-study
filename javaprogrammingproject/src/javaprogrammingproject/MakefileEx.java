package javaprogrammingproject;
import java.util.*;
import java.io.*;

public class MakefileEx {
	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 char [] alphabet= new char[26];
	 
	 System.out.print("�����̸��� �Է��Ͻÿ�>>>");
	 String name=scanner.next();
	 System.out.print("����ũ�⸦ �Է��Ͻÿ�.>>>");
	 long size=scanner.nextLong();
	 
	 try {
		 FileOutputStream fin=new FileOutputStream("c:\\Temp\\"+name+ ". txt");
		 for(long s=0; s<=size*20; s++) {
			 for(int i=0; i<alphabet.length;i++) {
				 alphabet[i]=(char)('a'+i);
				 fin.write(alphabet[i]);
			 }
			 fin.write('\r');
			 for(int j=0; j<alphabet.length;j++) {
				 alphabet[j]=(char)('A'+j);
				 fin.write(alphabet[j]);
			 }
			 fin.write('\r');
		 }
		 fin.close();
		 		
	 }catch(IOException e) {
		 System.out.println("����� ����...");
	 }
	 scanner.close();
	 System.out.println("���� ���� �Ϸ�");

}
}