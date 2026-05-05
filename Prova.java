import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;
public class Prova {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
      
         

   //entrada de dados 
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu cargo:");
        String cargo =sc.nextLine();

        System.out.println("Digite seu nivel de acesso:");
        int nivel = sc.nextInt();

        System.out.println("Digite o nivel de sigilo da aréa:");
        int sigilo = sc.nextInt();

        //verificação de dados 
        if (nivel >= sigilo) {
            System.out.println("Acesso permitido!");
            System.out.println("Seu nome é: " + nome );
            System.out.println("Seu cargo é: " + cargo);
                
            
        }
        
        else  {
        System.out.println("Acesso negado!");
        System.out.println("Alerta: Tentativa de acesso indevida detectada!");
        }
        

    }
}