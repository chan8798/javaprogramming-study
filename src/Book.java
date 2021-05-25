

import java.util.*;

public class Book {
    
    Scanner sc = new Scanner(System.in);
    private String bNo;
    private String bTitle;
    private String bAuthor;
    private String bPrice;
    public static ArrayList<Book> bookList = new ArrayList<Book>();
 
    public Book() {
 
    }
 
    public String getbNo() {
        return bNo;
    }
 
    public void setbNo(String bNo) {
        this.bNo = bNo;
    }
 
    public String getbTitle() {
        return bTitle;
    }
 
    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }
 
    public String getbAuthor() {
        return bAuthor;
    }
 
    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }
 
    public String getbPrice() {
        return bPrice;
    }
 
    public void setbPrice(String bPrice) {
        this.bPrice = bPrice;
    }
 
    
    public void showMain() throws InterruptedException {
    while (true) {
        System.out.println("[1] ���� ���\n[2] ��� ���� ��ȸ\n[3] ���� ���� ������Ʈ\n[4] ���� ����\n[5] ���α׷� ����\n");
        String userInput = sc.nextLine();
 
        switch (userInput) {
        case ("1"):
            insertBook();
            break;
 
        case ("2"):
            selectAll();
            break;
                
        case ("3"):
            updateBook();
            break;
 
        case ("4"):
            deletebook();
            break;
                
        case ("5"):
            System.out.println("���α׷� ����");
            Main.writer();
            sc.close();
            System.exit(0);
                
        default:
            System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
            break;
        }
    } // end while
    }

    public void insertBook() throws InterruptedException {
        while (true) {
            Book book = new Book();
            // ���� ��ȣ�� �ߺ��Ǹ� �� ��
            while (true) {
                int cnt=0;
                System.out.println("���� ��ȣ �Է�");
                String temp = sc.nextLine();
                for (int i = 0; i < bookList.size(); i++) {
                    if (temp.equals(bookList.get(i).getbNo())) {
                        cnt++;
                        System.out.println("���� ��ȣ �ߺ��Դϴ�. �ٽ� �Է��ϼ���.");
                        break;
                    } // end if
                } // end for
                if(cnt==0) {
                    book.setbNo(temp);
                    break;
                }
            } // end while
            System.out.println("å ���� �Է�");
            book.setbTitle(sc.nextLine());
            
            System.out.println("�۰� �Է�");
            book.setbAuthor(sc.nextLine());
            
            System.out.println("���� �Է�");
            book.setbPrice(sc.nextLine());
            
            Thread.sleep(1000);
 
            // ���� �Ŀ� ����Ʈ�� ��ü ����
            System.out.println("������ȣ : " + book.getbNo());
            System.out.println("�������� : " + book.getbTitle());
            System.out.println("�� �� ��  : " + book.getbAuthor());
            System.out.println("����  : " + book.getbPrice());
 
            System.out.println("�Է��Ͻ� ������ ��� �½��ϱ�? ��(Y) �ƴϿ�(N)");
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                bookList.add(book);
                System.out.println("======�Է� �Ϸ�=====");
                break;
            } else if (confirm.equalsIgnoreCase("n")) {
                System.out.println("���� ������ ���� �Է��ϼ���.");
            } else {
                System.out.println("�߸� �����̽��ϴ�. �ʱ� �޴��� �̵��մϴ�");
                break; // �ʱ�޴��� �̵�
            } // if-else end
        } // end while
        
        Main.writer();
        
        Thread.sleep(1000);
    }// end main
    
    public void selectAll() throws InterruptedException {
        while (true) {
            System.out.println("��� ������:  " + bookList.size());
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("===============================");
                System.out.println("å ��ȣ : " + bookList.get(i).getbNo());
                System.out.println("å ���� : " + bookList.get(i).getbTitle());
                System.out.println("������  : " + bookList.get(i).getbAuthor());
                System.out.println("����  : " + bookList.get(i).getbPrice());
                System.out.println("===============================\n");
 
            } // end for
            System.out.println("�ʱ� �޴� �̵� : [1] \n���α׷� ���� : [0]");
            String temp = sc.nextLine();
            if (temp.equalsIgnoreCase("1")) {
                break;
            } else if (temp.equals("0")) {
                System.out.println("���α׷��� �����մϴ�.");
                Thread.sleep(1000);
                System.exit(0);
            } else {
                System.out.println("�߸� �����̽��ϴ�. �ʱ�ȭ������ �̵��մϴ�.");
                Thread.sleep(1000);
                break; // �������� ���ư�
            } // if-else end
        } // while end
    }// end selectAll
 
    public void updateBook() throws InterruptedException {
        
        while (true) {
            
            System.out.println("���� �� å�� ��ȣ�� �Է����ּ���");
            String temp = sc.nextLine();
            int cnt = 0;
            
            for (int i = 0; i < bookList.size(); i++) {
                
                if (temp.equals(bookList.get(i).getbNo())) {
                    
                    System.out.println("���ο� ���� �Է�: ");
                    bookList.get(i).setbTitle(sc.nextLine());
                    
                    System.out.println("���ο� ������ �Է�: ");
                    bookList.get(i).setbAuthor(sc.nextLine());
                    
                    System.out.println("���ο� ���� �Է�: ");
                    bookList.get(i).setbPrice(sc.nextLine());
                    cnt++;
                    System.out.println("���� ���� �Ϸ�");
                    break;
                }
                
            } // end for
            
            if (cnt == 0) {
                
                System.out.println("�ش� ������ �������� �ʽ��ϴ�. ���� ��ȣ�� �ٽ� �Է��ϼ���.");
                
            } else {
                
                break;// ��������
                
            }
        } // end while
        Main.writer();
    }
    
    public void deletebook() {
        while (true) {
            
            System.out.println("���� �� å�� ��ȣ�� �Է����ּ���");
            
            String temp = sc.nextLine();
            
            int cnt = 0;
            
            for (int i = 0; i < bookList.size(); i++) {
                
                if (temp.equals(bookList.get(i).getbNo())) {
                    
                    bookList.remove(i);
                    cnt++;
                    System.out.println("���� ���� �Ϸ�");
                    
                    break;
                    
                }
            } // end for
            
            if (cnt == 0) {
                System.out.println("�ش� ������ �������� �ʽ��ϴ�. ���� ��ȣ�� �ٽ� �Է��ϼ���.");
            } else {
                break;// ��������
            }
        } // end while
    } 
    
}