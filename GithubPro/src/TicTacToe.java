import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RepaintManager;

public class TicTacToe {
	static int a;
	boolean ture=true;
	boolean win = false;
	int count = 100;
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton[] b = new JButton[100];
	//---------------------------
    Box box=Box.createHorizontalBox();    
    JButton btnA=new JButton("Play game");    
    JButton btnB=new JButton("NO"); 
    JButton btnC=new JButton(); 
    //------------------------
	ImageIcon img1,img2;
	
	public static void main(String[] args) {
		 int k = 0;
	        do {
	            System.out.println("��ȭ��Ϸ���ڿ�ʼ"+"\n"+"���� 0 :ʯͷ   1 :����    2 :��");
	            Scanner in = new Scanner(System.in);
	            int n = in.nextInt();
	            //�ж��������ʯͷ���ǲ�
	            if (n==0) {
	                System.out.print("���ʯͷ");
	            }else if(n==1){
	                System.out.print("�������");
	            }else {
	                System.out.print("�����");
	            }
	            //���������
	            int x=0+(int)(Math.random()*2);
	            //�жϵ��Գ����Ǽ���ʯͷ���ǲ�
	            if (x==0) {
	                System.out.println("VS���Գ�ʯͷ");
	            }else if(x==1){
	                System.out.println("VS���Գ�����");
	            }else {
	                System.out.println("VS���Գ���");
	            }
	            //�ж�˭Ӯ
	            if ((n==0&&x==1) || (n==1&&x==2) || (n==2&&x==0)) {
	                System.out.println("��Ӯ��,�������һ����Ϸ");
	                k=1;
	        		new TicTacToe().init();
	            }else if(n == x){
	                System.out.println("��ƽ");
	            }else {
	                System.out.println("����Ӯ��");
	                
	            }
	            System.out.println("\n");
	        } while (k==0);

	}
	public void init(){	
		img1 = new ImageIcon("1.jpg");
		img2 = new ImageIcon("2.jpg");
		p.setLayout(new GridLayout (10,10));
		for(int i =0; i<b.length;i++){
			b[i] = new JButton();
			addListener(b[i],btnA,btnB,i);
			p.add(b[i]);
			System.out.println(i);
		f.add(p);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	}
	
	public void addListener(JButton b,JButton btnA,JButton btnB,int i){
	//������------------------------------------------------
			btnA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(b.getIcon()==img1||b.getIcon()==img2){											
						b.setIcon(ture?null:null);
						ture=!ture;		
						count = 100;
					}

			}
			
			});
		btnB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
			});
		//----------------------------
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
		
				if(b.getIcon()==null){
				
				b.setIcon(ture?img1:img2);
				ture=!ture;
				
				}
				win = checWin(i);
				count--;
				//----------------------------------
				if(count==0){    
			        JFrame f=new JFrame("BoxLayout");    
			        //����ˮƽBox���     
			        Box box=Box.createHorizontalBox();   
			        box.add(btnA);
			        box.add(btnB); 
			        f.add(box);
			        f.pack();    
			        f.setVisible(true);    
			        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else{
					if(win == true){
						if(ture!=true){
					        JFrame f=new JFrame("BoxLayout");    
					        //����ˮƽBox���     
					        Box box=Box.createHorizontalBox();     
					        btnC=new JButton("�� win");    
					        box.add(btnA);
					        box.add(btnB); 
					        box.add(btnC); 
					        f.add(box);
					        f.pack();    
					        f.setVisible(true);    
					        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						}
						else{
					        JFrame f=new JFrame("BoxLayout");    
					        //����ˮƽBox���     
					        Box box=Box.createHorizontalBox();   
					        btnC=new JButton("�� win");   
					        box.add(btnA);
					        box.add(btnB); 
					        box.add(btnC); 
					        f.add(box);
					        f.pack();    
					        f.setVisible(true);    
					        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						}
					}
					//-------------------------------------------------
					

				}

			
			}
			
			});		
		}


		public boolean checWin(int k){
			boolean w = false;
			int i = k+1;
			int r = k/10;//��
			int c = k%10;//��
			if(b[i].getIcon()==b[i+1].getIcon()&&b[i+1].getIcon()==b[i+2].getIcon()&&b[i+2].getIcon()==b[i+3].getIcon()&&b[i+3].getIcon()==b[i+4].getIcon()){
					w=true;
			}
			else if(b[i].getIcon()==b[1*10+i].getIcon()&&b[1*10+i].getIcon()==b[2*10+i].getIcon()&&b[2*10+i].getIcon()==b[3*10+i].getIcon()&&b[3*10+i].getIcon()==b[4*10+i].getIcon()){
					w = true;
			}
//			else if(i%2==0){
//				if(b[0].getIcon()==b[4].getIcon()&&b[4].getIcon()==b[8].getIcon()&&b[0].getIcon()!=null){
//					w = true;				
//				}
//				else{
//					if(b[2].getIcon()==b[4].getIcon()&&b[4].getIcon()==b[6].getIcon()&&b[2].getIcon()!=null)
//					w = true;	
//				}
//			}
			return w;	
		}
		
}