package com.Exercise4Array;

public class Ques17 {
	public static void main(String[]args) {
		int a[]= {1,2,6,8,4};
		int b[]= {1,2,3,4};
		
		for(int i=0;i<a.length;i++) {
			boolean B=true;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]) {
					B=false;
				
			}
			}
			if(B) {
			System.out.println(a[i]);
		}
		
		
		}	
	}

}
