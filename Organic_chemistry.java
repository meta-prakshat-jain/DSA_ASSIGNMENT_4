package Assignment_4;

import java.util.HashMap;

public class Organic_chemistry {
	
	public int mass(String compound) {//
		int n=compound.length();
		int CountC=0;
		int CountH=0;
		int CountO=0;
		int idx=0;
		int moleculeWeight=0;
		
		while(idx<n-1) {
			char currCh=compound.charAt(idx);//c
			char nextCh=compound.charAt(idx+1);
			
			if(currCh=='(') {
				while(currCh!=')') {
					currCh=compound.charAt(idx);
					nextCh=compound.charAt(idx+1);
					if(Character.isDigit(nextCh)) {
						if(currCh=='C') {
							CountC+=nextCh-'0';
						}else if(currCh=='H'){
							CountH+=nextCh-'0';
						}else {
							CountO+=nextCh-'0';
						}
						idx++;
					}
					else {
						if(currCh=='C') {
							CountC+=1;
						}else if(currCh=='H'){
							CountH+=1;
						}else {
							CountO+=1;
						}
					}
					idx++;
				}
			}
			
			
			else if(Character.isDigit(nextCh)) {
				if(currCh=='C') {
					CountC+=nextCh-'0';
				}else if(currCh=='H'){
					CountH+=nextCh-'0';
				}else {
					CountO+=nextCh-'0';
				}
				idx++;
			}
			else {
				if(currCh=='C') {
					CountC+=1;
				}else if(currCh=='H'){
					CountH+=1;
				}else {
					CountO+=1;
				}
			}
			idx++;
				
		}
		
		moleculeWeight+=CountC*12;
		moleculeWeight+=CountH*1;
		moleculeWeight+=CountO*16;
		return moleculeWeight;
	}
	
	public static void main(String[] args) {
		Organic_chemistry oc=new Organic_chemistry();
		oc.mass("CHO3");
		System.out.println(oc.mass("C(HO)3"));
		
		
	}

}
