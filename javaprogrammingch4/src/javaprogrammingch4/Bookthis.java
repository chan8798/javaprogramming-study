package javaprogrammingch4;

public class Bookthis {
	String title;
	String author;
	
	void show() { System.out.println(title+" "+author);}
	
	public Bookthis(){
		this("","");
		System.out.println("생성자 호출됨");
	}
	public Bookthis(String title) {
		this(title, "작자미상");
	}
	public Bookthis(String title, String author) {
		this.title=title;
		this.author=author;
	}
	public static void main(String[] args) {
		Bookthis littlePrince=new Bookthis("어린왕자","생텍쥐페리");
		Bookthis loveStory=new Bookthis("춘향전");
		Bookthis emptyBook=new Bookthis();
		loveStory.show();
	}

}
