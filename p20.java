
public class p20 {
  public static int sum(int i, int j) {
	  return i+j; //i와 j의 합을 리턴
  }
  public static void main(String[] args) {
	  int i;
	  int j;
	  char a;
	  String b;
	  final int TEN=10;
	  i=1;
	  j=sum(i,TEN);
	  a='?';
	  b="Hello";
	  java.lang.System.out.println(a);// '?'출력
	  System.out.println(b); //"Hello" 출력
	  System.out.println(TEN); //10 출력
	  System.out.println(j); //11출력
			  
  }
}

