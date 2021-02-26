package com.br.zup;

import java.util.Random;
import java.util.Scanner;

public class Sorteador {
    public static void main(String[] args) {

        Scanner seunumero = new Scanner(System.in);
        int numero;

        System.out.println("Informe seu numero");
        numero = seunumero.nextInt();

        Random random = new Random();
        int numeroaleatorio = random.nextInt(4);
        System.out.println(numeroaleatorio);


        if( numero == numeroaleatorio ){
            System.out.println("Parabéns, você ganhou 10 pontos!");
        }else if((numero == numeroaleatorio+1)||(numero == numeroaleatorio-1)){
            System.out.println("Parabéns, você ganhou 5 pontos!");
        }else{
            System.out.println("Você perdeu!");
        }

    }
}
