package com.Exercise4Array;

public class Ques08Array2DTable {
	
	public static void main(String[]args) {
		int[][] Table=new int[10][10];
		
		for(int i=0;i<Table.length;i++) {
			for(int j=0;j<Table.length-1;j++) {
	  			Table[i][j]=(i+1)*(j+2);
				System.out.print(Table[i][j]+"\t");
			}System.out.println();
		}
	}
}
