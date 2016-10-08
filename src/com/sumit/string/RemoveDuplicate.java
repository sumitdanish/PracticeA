package com.sumit.string;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCCBCBA";
		new RemoveDuplicate().removeAdjacen(s.toCharArray());
	}
	
	public void removeAdjacen(char[] str){
		int j = 0;
		String s = "";
		char[] ch = new char[str.length];
		for(int i = 1; i < str.length ; i++){
			while(i < str.length && (str[i] == str[j] )&& j >= 0){
				i++;
				j--;
			}
			
			str[++j] = str[i];
		}
		for(int k = 0; k <= j ; k++){
			System.out.print(str[k]);
		}
	}

}
