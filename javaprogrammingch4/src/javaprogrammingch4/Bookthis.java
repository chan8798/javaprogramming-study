package javaprogrammingch4;

public class Bookthis {
	String title;
	String author;
	
	void show() { System.out.println(title+" "+author);}
	
	public Bookthis(){
		this("","");
		System.out.println("������ ȣ���");
	}
	public Bookthis(String title) {
		this(title, "���ڹ̻�");
	}
	public Bookthis(String title, String author) {
		this.title=title;
		this.author=author;
	}
	public static void main(String[] args) {
		Bookthis littlePrince=new Bookthis("�����","�������丮");
		Bookthis loveStory=new Bookthis("������");
		Bookthis emptyBook=new Bookthis();
		loveStory.show();
	}

}
