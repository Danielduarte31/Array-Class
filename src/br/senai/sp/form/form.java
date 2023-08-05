package br.senai.sp.form;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class form {

/** Declaraçâo dos Variaveis*/
    public static void main(String[] args){
//

            /**Import cass scanner*/
            Scanner teclado = new Scanner(System.in);
//
//            /** coleta dados do user*/
//
//        System.out.print("Good morning ! What's your name Teacher 1? ");
//        String nome = teclado.nextLine();
//        System.out.print("Good morning ! What's your name Teacher 2? ");
//        String Nome = teclado.nextLine();
//
//        System.out.print( "Hi, "+ nome + ", How old are you Teacher 1? ");
//        int idade = teclado.nextInt();
//        System.out.print( "Hi, "+ Nome + ", How old are you Teacher 2? ");
//        int Idade = teclado.nextInt();
//
//
//
//        System.out.print("How tall are you Teacher 1?");
//       float altura = teclado.nextFloat();
//       System.out.print("How tall are you Teacher 2?");
//        float Altura = teclado.nextFloat();
//
//        System.out.print("what is your id Teacher 1?");
//        int rg = teclado.nextInt();
//        System.out.print("what is your id Teacher 2?");
//        int Rg = teclado.nextInt();
//
//        System.out.print("what is your cpf Teacher 1");
//        int cpf = teclado.nextInt();
//        System.out.print("what is your cpf Teacher 2");
//        int Cpf = teclado.nextInt();
//
//        System.out.print("what's your Job Teacher 1?");
//        String profissao = teclado.next();
//        System.out.print("what's your Job Teacher 2?");
//        String Profissao = teclado.next();
//
//        System.out.print("what's your course Teacher 1?");
//        String curso = teclado.next();
//        System.out.print("what's your course Teacher 2?");
//        String Curso = teclado.next();
//
//        /**Info*/
//        System.out.println("-------------------------------------------------");
//        System.out.println("---------------------Forms-----------------------\n");
//        System.out.println("Hi, "+ nome +" Welcome");
//        System.out.println("you have: " + idade + "Years");
//        System.out.println("you weigh is "+ altura);
//        System.out.println("Your CPS is " + cpf);
//        System.out.println("Your id is " + rg);
//        System.out.println("your Job is " + profissao);
//        System.out.println("your course is " + curso);
//
//        System.out.println("____________________________________________________");
//        System.out.println("Hi, "+ Nome +" Welcome");
//        System.out.println("you have: " + Idade + "Years");
//        System.out.println("you weigh is "+ Altura);
//        System.out.println("Your CPS is " + Cpf);
//        System.out.println("Your id is " + Rg);
//        System.out.println("your Job is " + Profissao);
//        System.out.println("your course is " + Curso);
//        System.out.println("____________________________________________________");
//        System.out.println("Thanks for your collaboration, have a great day !! ");
        /**array*/

    String [] nomes = new String[2];
        System.out.print("what is your name Teacher 1?");
        nomes[0] = teclado.nextLine();
        System.out.print("what is your name Teacher 2?");
        nomes[1] = teclado.nextLine();

    int [] idade = new int[2];
        System.out.print( "Hi, "+ nomes[0] + ", How old are you Teacher 1? ");
        idade[0] = teclado.nextInt();
        System.out.print( "Hi, "+ nomes[1] + ", How old are you Teacher 2? ");
        idade[1] = teclado.nextInt();
    int[] peso = new int[2];
        System.out.print("How much do you weigh Teacher 1? ");
        peso[0] = teclado.nextInt();
        System.out.print("How much do you weigh Teacher 2? ");
        peso[1] = teclado.nextInt();

    float[] altura = new float[2];
        System.out.print("How tall are you Teacher 1? ");
         altura[0] = teclado.nextFloat();
        System.out.print("How tall are you Teacher 2? ");
         altura[1] = teclado.nextFloat();

    long[] rg = new long[2];
        System.out.print("what is your id Teacher 1? ");
         rg[0] = teclado.nextInt();
        System.out.print("what is your id Teacher 2? ");
         rg[1] = teclado.nextInt();

    long[] cpf = new long[2];
        System.out.print("what is your cpf Teacher 1? ");
        cpf[0] = teclado.nextInt();
        System.out.print("what is your cpf Teacher 2? ");
        cpf[1] = teclado.nextInt();

    String [] profissao = new String[2];
         System.out.print("what's your Job Teacher 1? ");
         profissao[0] = teclado.next();
         System.out.print("what's your Job Teacher 2? ");
         profissao[1] = teclado.next();
    String [] curso = new String[2];

        System.out.print("what's your course Teacher 1? ");
        curso[0] = teclado.next();
        System.out.print("what's your course Teacher 2? ");
        curso[1] = teclado.next();



/**Info*/
        System.out.println("-------------------------------------------------");
        System.out.println("---------------------Forms-----------------------\n");
        System.out.println("Hi, "+ nomes[0] +" Welcome");

        System.out.println("you have: " + idade[0] + "Years");
        System.out.println("you weigh is "+ altura[0]);
        System.out.println("Your CPS is " + cpf[0]);
        System.out.println("Your id is " + rg[0]);
        System.out.println("your Job is " + profissao[0]);
        System.out.println("your course is " + curso[0]);

        System.out.println("____________________________________________________");
        System.out.println("Hi, "+ nomes[1] +" Welcome");
        System.out.println("you have: " + idade[1] + "Years");
        System.out.println("you weigh is "+ altura[1]);
        System.out.println("Your CPS is " + cpf[1]);
        System.out.println("Your id is " + rg[1]);
        System.out.println("your Job is " + profissao[1]);
        System.out.println("your course is " + curso[1]);
        System.out.println("____________________________________________________");
        System.out.println("Thanks for your collaboration, have a great day !! ");




















    }

}

