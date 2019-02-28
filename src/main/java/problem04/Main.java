package problem04;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, ScriptException {
		
		int num1 = 0;
		int num2 = 0;
		int qunum = 0;
		int count =0;
		int qucount=0;//question에 값을 넣기 위해 세는 카운트
		
		int user = 0;
		
		int[] success = new int[18];
		int[] fail = new int[18];
		double[] time = new double[18];
		
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		
		Scanner sc = new Scanner(System.in);
		
		String[] question = new String[18];
		
		
		for(int i = 1;i<10;i++) {
			for(int j=0;j<2;j++) {
				num1=(int)(Math.random()*9)+1;
				if(num1==num2) {
					num1=(int)(Math.random()*9)+1;
				}else {
					num2 = num1;
					question[qucount] = i+"*"+num1;
					//System.out.println(question[qucount]);
					qucount++;
				}
				
			}
			
		}
		System.out.println("구구단 게임을 시작합니다 ! ");
		while(true) {
			long start = System.currentTimeMillis();
			qunum=(int)(Math.random()*question.length);
			
			System.out.println((count+1)+".\t"+question[qunum]+" ?");
			
			user = sc.nextInt();
			
			if(Integer.parseInt(engine.eval(question[qunum]).toString())==user) {			
				success[count]++;
			}else {
				fail[count]++;
			}
			long end = System.currentTimeMillis();
			time[count] = ( end - start )/1000.0 ;	
			
			System.out.println((count+1) +" 번째 실행시간 : "+ time[count] +"초 // 성공횟수 : "+success[count]+"실패횟수 : "+fail[count]);
			count++;
		}
		
	}
}