package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int qunum = 0;
		int count =0;
		int qucount=0;//question에 값을 넣기 위해 세는 카운트
		
		Scanner sc = new Scanner(System.in);
		
		String[] question = new String[18];
		
		//System.out.println(question[0]=1+" * "+2);
		
		for(int i = 1;i<10;i++) {
			for(int j=0;j<2;j++) {
				num1=(int)(Math.random()*9)+1;
				if(num1==num2) {
					num1=(int)(Math.random()*9)+1;
				}else {
					num2 = num1;
					question[qucount] = i+" * "+num1;
					//System.out.println(question[qucount]);
					qucount++;
				}
				
			}
			
		}
		System.out.println("구구단 게임을 시작합니다 ! ");
		while(true) {
			long start = System.currentTimeMillis();
			qunum=(int)(Math.random()*question.length);
			
			System.out.println();
			long end = System.currentTimeMillis();
			System.out.println("실행시간 : "+ (end-start)/1000.0+"초");
		}
		
	}
}