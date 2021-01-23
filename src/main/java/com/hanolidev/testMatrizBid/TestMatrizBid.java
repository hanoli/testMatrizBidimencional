package com.hanolidev.testMatrizBid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMatrizBid {
	
	
	public void matriz() {
		
		File archivo=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
		archivo = new File ("C://uploadedFiles//archivo.txt");
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);
		String matriz[][]= new String[10000][10000];
		int x = 0;
		int h=0;
		List<String> a = new ArrayList<>();
		List<String> b = new ArrayList<>();
		String[] stringArray;
		String[] arreglo = null;
		
		try (Stream<String> lines = br.lines()) {
			stringArray = lines.skip(4).toArray(size -> new String[size]);
			Arrays.stream(stringArray);
			}
		
		for(int j=0;j<stringArray.length;j++){

			arreglo = stringArray[j].split("\\ ");
			for (String dat : arreglo) {
				a.add(dat);	
			}
			
			//System.out.println("Tamaño de matriz: " + matriz.length);
			
			for (int y= 0; y <a.size(); y++) {
				for(int i= 0; i <a.size(); i++) {
					if(!("").equals(a.get(i)) ) {
					if(!("|").equals(a.get(i)) ) {
						matriz[x][y]=a.get(i);
						b.add(a.get(i));
						//System.out.println("Matriz: " +x+y+"|"+ matriz[x][y]);
						y++;
						
						}
					}
					
				}
				
				a.clear();
			}
			x++;
		}
		
		Integer colum=2;
			
		for (int f = 0; f < b.size(); f++) {
	      System.out.print(matriz[f][colum]+" ");
		}
		
		
		
		}catch(IOException e){

		System.out.println(e);
		}

		}

		
		

	    
	
	
	
		
    public static void main(String[] args) {
		TestMatrizBid testMatrizBid = new TestMatrizBid();
		testMatrizBid.matriz();
	}
	

}
