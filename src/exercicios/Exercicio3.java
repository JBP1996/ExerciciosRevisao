package exercicios;

import java.util.Random;

public class Exercicio3 {
	public Exercicio3(){
		
		int[] posicoes = new int[20];

		Random rand = new Random();
		
		/*
		posicoes[0]=5;
		posicoes[1]=5;
		posicoes[2]=5;
		posicoes[3]=5;
		posicoes[4]=5;
		posicoes[5]=5;
		posicoes[6]=5;
		posicoes[7]=5;
		posicoes[8]=5;
		posicoes[9]=5;
		posicoes[10]=5;
		posicoes[11]=5;
		posicoes[12]=5;
		posicoes[13]=5;
		posicoes[14]=5;
		posicoes[15]=5;
		posicoes[16]=5;
		posicoes[17]=5;
		posicoes[18]=5;
		posicoes[19]=5;
		
		int i=0;
		while(i<20){
			posicoes[i]= rand.nextInt(8)+1;
			i=i+1;
		}
		*/
		
		for(int j=0;j<20;j++){
			posicoes[j]= rand.nextInt(8)+1;
		}
		
		int[] cont= new int[9];
		for(int k=0;k<20;k++){
			cont[posicoes[k]-1]++;
		}
		
	}
}
