package ferramentas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class layout {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int qtd1 = 0;
        int cont = 1;
        
        
        System.out.println("-----------Definição do layout-----------");

        System.out.println("###########  Paleta de cores  ###########");
        System.out.println("Quantas cores serão utilizadas no site?");
        qtd1 = sc.nextInt();

        String[] cor;
        cor = new String[qtd1];

        for(int i = 0; i<qtd1;i++){

            System.out.println("Cor " + cont);
            cor[i] = sc.next();

            cont++;
        }

        cont = 1;
        //--------------------------------------------------------------------------------------

        
        int qtd2 = 0;
        int cont2 = 1;
        System.out.println("###########  Fontes  ###########");
        System.out.println("Quantas fontes serão utilizadas no site?");
        qtd2 = sc.nextInt();

        String[] font;
        font = new String[qtd2];

        for(int i = 0; i<qtd2;i++){

            System.out.println("Fonte " + cont2);
            font[i] = sc.next();

            cont2++;
        }

        cont2 = 1;
        //--------------------------------------------------------------------------------------
        
        System.out.println("As cores escolhidas foram:");

        for(int i = 0;i<qtd1;i++){
        System.out.println("Cor " + cont + ": " + cor[i]);
        
        cont++;
        
        }

        System.out.println("As fontes escolhidas foram:");

        for(int i = 0;i<qtd2;i++){
        System.out.println("Fonte " + cont2 + ": " + font[i]);
        
        cont2++;
        
        }


        
    }
}
