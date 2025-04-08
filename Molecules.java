package Assignment_4;

import java.util.Scanner;
import java.util.Stack;

public class Molecules {
	public static boolean checkInt(char ch) {
		if(ch>47 && ch<58) {
			return true;
		}
		return false;
	}
	public static int Sum(Stack<Integer> massofcomp) {
		int ans=0;
		while(!massofcomp.isEmpty()) {
			ans+=massofcomp.pop();
		}
		return ans;
	}
	
	
	public static int CalculateMass(String s,Stack<Integer> massofcomp) {
		int idx=0;
		while(idx<s.length()) {
			char ch=s.charAt(idx);
			char nextCh = (idx + 1 < s.length()) ? s.charAt(idx + 1) : '\0'; 
			if(ch=='C' && !checkInt(nextCh)) {
				massofcomp.push(12);
				System.out.println(massofcomp);
				System.out.println(ch+" "+nextCh);
			}
			else if(ch=='C' && checkInt(nextCh)) {
				nextCh-='0';
				massofcomp.push(12*nextCh);
				//idx++;
			}
			 if(checkInt(ch) && checkInt(nextCh)) {
				ch-='0';
				nextCh-='0';
				int mul=ch*10+nextCh;
				System.out.println(mul);
				massofcomp.push(massofcomp.pop()*mul);
				idx++;
			}
			if(ch=='H' && !checkInt(nextCh)) {
				massofcomp.push(1);
				System.out.println(massofcomp);
				System.out.println(ch+" "+nextCh);
			}
			else if(ch=='H' && checkInt(nextCh)) {
				nextCh-='0';
				massofcomp.push(1*nextCh);
				//idx++;
			}
			if(ch=='O' && !checkInt(nextCh)) {
				massofcomp.push(16);
				System.out.println(massofcomp);
				System.out.println(ch+" "+nextCh);
			}
			else if(ch=='O' && checkInt(nextCh)) {
				nextCh-='0';
				massofcomp.push(16*nextCh);
				//idx++;
			}
			else if(ch=='(') {
				massofcomp.push(-1);
				
			}
			else if(ch==')'&&checkInt(nextCh)) {
				nextCh-='0';
				int ans=0;
				while(massofcomp.peek()!=-1) {
					ans+=massofcomp.pop()*nextCh;
				}
				massofcomp.pop();
				massofcomp.push(ans);
			}
			
			idx++;
		}
		System.out.println(massofcomp);
		return Sum(massofcomp);
	}
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 System.out.println(CalculateMass("C12H12O6", st));
		
		
	}

}
