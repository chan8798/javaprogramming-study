import java.util.ArrayList;
import java.util.List;

public class score {
	public String name;// blackjackŬ���� ����� �̸�
	public String[] card; //Ŭ���� card ���� ���� �迭
	public List<Object> b; //����� ī�� ��
	public List<Object> Aa;//���� ī�� ��
	public int ch;// blackjackŬ���� ����� �� A 1�� 11�� ������ ���� ������
	
	public int n() {//����� ī�� ��
	    List<Object> Ars=new ArrayList<Object>();//����� ī�带 �ϳ��� Ars ����Ʈ�� �־���
		for(int i=0; i<b.size(); i++) {
			if(b.get(i)=="A") {//A�� ���� �ҋ� ������ ����(1,11)�� namescore �޼ҵ� �̵�
				Object a=b.get(i);
	    		namescore(a,Ars,ch);
	    	}
	    	else {// A���� ������ ��� namescore �޼ҵ� �̵�
	    		
	    		Object a=b.get(i);
				namescore(a,Ars,ch);
	    	}
		}
	   int sum=0;
       for(int k=0; k<Ars.size(); k++) {//����� ī�� ���� ��
    	   int i = (int)Ars.get(k) ;
		   sum+=i;
		}  
		return sum;// ���� ��ȯ��
	}
	
    public void namescore(Object a,List<Object> Ars,int ch) {
		if(a=="��2") {
			Ars.add(2);
        }
        if(a=="��2") {
    		Ars.add(2);
         }
        if(a=="��2") {
        	Ars.add(2);
        }
        if(a=="��2") {
            Ars.add(2);
        }
        if(a=="��3") {
    		Ars.add(3);
        }
        if(a=="��3") {
        	Ars.add(3);
        }
        if(a=="��3") {
            Ars.add(3);
         }
        if(a=="��3") {
            Ars.add(3);
        }
        if(a=="��4") {
            Ars.add(4);
        }
        if(a=="��4") {
        	Ars.add(4);
        }
        if(a=="��4") {
            Ars.add(4);
        }
        if(a=="��4") {
            Ars.add(4);
        }
        if(a=="��5") {
            Ars.add(5);
        }
        if(a=="��5") {
        	Ars.add(5);
        }
        if(a=="��5") {
            Ars.add(5);
        }
        if(a=="��5") {
            Ars.add(5);
        }
        if(a=="��6") {
            Ars.add(6);
        }
        if(a=="��6") {
        	Ars.add(6);
        }
        if(a=="��6") {
            Ars.add(6);
        }
        if(a=="��6") {
            Ars.add(6);
        }
        if(a=="��7") {
            Ars.add(7);
        }
        if(a=="��7") {
        	Ars.add(7);
        }
        if(a=="��7") {
            Ars.add(7);
        }
        if(a=="��7") {
            Ars.add(7);
        }
        if(a=="��8") {
            Ars.add(8);
        }
        if(a=="��8") {
        	Ars.add(8);
        }
        if(a=="��8") {
            Ars.add(8);
        }
        if(a=="��8") {
            Ars.add(8);
        }
        if(a=="��9") {
            Ars.add(9);
        }
        if(a=="��9") {
        	Ars.add(9);
        }
        if(a=="��9") {
            Ars.add(9);
        }
        if(a=="��9") {
            Ars.add(9);
        }
        if(a=="10") {
            Ars.add(10);
        }
        if(a=="J") {
            Ars.add(10);
        }
        if(a=="Q") {
            Ars.add(10);
        }
        if(a=="K") {
            Ars.add(10);
        }
        if(a=="A") {
        	if(ch==1) {
        		Ars.add(1);
        	}
        	else if(ch==11) {
        		Ars.add(11);
        	}
        }
    }
	public int B() {//���� ī�� ���� ��
		List<Object> br=new ArrayList<Object>();//���� ī�带 �ϳ��� br����Ʈ�� �־���
		for(int i=0; i<Aa.size(); i++) {
			Object a=Aa.get(i);
			if(a=="A") {// ���� �п� A�� �����ϸ� 1,11 �� �ϳ��� ���ڸ� ������
				int score[];//score������ �迭
				score=new int[] {1,11};// score�� �迭 ���� 1,11 
				int ch=(int)(Math.random()*1);// score�迭 �ε����� 0,1�̹Ƿ� 0,1�� ���������� �ϳ��� ����
				br.add(score[ch]);//���õ� ������ score�� �ε����̾ br����Ʈ�� �־���
			}
			else {
				AiScore(a,br);//A�ܿ� Aiscore �޼ҵ�� �̵�
			}
		}
	   int sum=0;
       for(int k=0; k<br.size(); k++) {//���� ī�� ���� ���� ���ϴ� ����
    	   int i = (int)br.get(k) ;
		   sum+=i;
		}
	    return sum;// ���� ī�� ���� �� ��ȯ
	 }
	public void AiScore(Object a,List<Object> br) {
		if(a=="��2") {
			br.add(2);
        }
        if(a=="��2") {
    		br.add(2);
        }
        if(a=="��2") {
        	br.add(2);
        }
        if(a=="��2") {
            br.add(2);
        }
        if(a=="��3") {
    		br.add(3);
        }
        if(a=="��3") {
        	br.add(3);
        }
        if(a=="��3") {
            br.add(3);
        }
        if(a=="��3") {
            br.add(3);
        }
        if(a=="��4") {
            br.add(4);
        }
        if(a=="��4") {
        	br.add(4);
        }
        if(a=="��4") {
            br.add(4);
        }
        if(a=="��4") {
            br.add(4);
        }
        if(a=="��5") {
            br.add(5);
        }
        if(a=="��5") {
        	br.add(5);
        }
        if(a=="��5") {
            br.add(5);
        }
        if(a=="��5") {
            br.add(5);
        }
        if(a=="��6") {
            br.add(6);
        }
        if(a=="��6") {
        	br.add(6);
        }
        if(a=="��6") {
            br.add(6);
        }
        if(a=="��6") {
            br.add(6);
        }
        if(a=="��7") {
            br.add(7);
        }
        if(a=="��7") {
        	br.add(7);
        }
        if(a=="��7") {
            br.add(7);
        }
        if(a=="��7") {
            br.add(7);
        }
        if(a=="��8") {
            br.add(8);
        }
        if(a=="��8") {
        	br.add(8);
        }
        if(a=="��8") {
            br.add(8);
        }
        if(a=="��8") {
            br.add(8);
        }
        if(a=="��9") {
            br.add(9);
        }
        if(a=="��9") {
        	br.add(9);
        }
        if(a=="��9") {
            br.add(9);
        }
        if(a=="��9") {
            br.add(9);
        }
        if(a=="10") {
            br.add(10);
        }
        if(a=="J") {
            br.add(10);
        }
        if(a=="Q") {
            br.add(10);
        }
        if(a=="K") {
            br.add(10);
        }
	}
}

