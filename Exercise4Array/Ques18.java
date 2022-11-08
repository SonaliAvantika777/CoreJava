package com.Exercise4Array;

public class Ques18 {
	public static void main(String[]args) {
		
		int x=30;
		int y[]= {22,31,15,73,89,20};
		add(x,y);
		}
	
		public static void add(int x ,int y[]){
			int p=0;
			int s=0;
			for(int i=0;i<y.length;i++ ) {
				
				if(x==y[i]) {
					s=i;
					p++;
			}
			}if(p>0) {
				System.out.println(x);
			}else {
				System.out.println(-1);
			}
		
 }
}
