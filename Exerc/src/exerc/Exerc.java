/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author utgard
 */
public class Exerc {
    static Scanner scan = new Scanner(System.in); 
    static DecimalFormat df = new DecimalFormat("#0.00");  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ex6();
        // TODO code application logic here
    }
    public static void ex1(){
        System.out.println("Digite a quantidade de horas disponivel que voce tem");
        float temp=scan.nextFloat();
        System.out.println("Quantas disciplinas voce tem?");
        int dis=scan.nextInt();
        float tempid=temp/dis;
        System.out.println("Tempo ideal para cada matéria:"+tempid+"H"+" ou "+tempid*60+"minutos");
        
    }
    public static void ex2(){
        System.out.println("Digite a madeira que o seu zé vai comprar \n"
                + " 3 metros \n"
                + " 4 metros \n"
                + " 5 metros ");
        int mad=scan.nextInt();
        if((mad!=3)||(mad!=5)||(mad!=3)){
            System.out.println("Zé voce é burro, digite o código direito");
            
        }else{
        double ped=mad/0.45;
       
        System.out.println("Vai dar "+df.format(ped)+" pedaços"+"e vai sobrar "+df.format(mad %0.45)+"cm");
        }
    }
    public static void ex3(){
        int cont=0; 
        int nota=0;
        int soma=0;
        while(cont!=5){
            System.out.println("Digite a nota");
             nota=scan.nextInt();
            soma=soma+nota;
            cont=cont+1;
            if(cont==4){
                System.out.println("Media = "+soma/cont);
                break;
            }
        
        
           
             
            
        }
    
    }
    public static void ex4(){
        System.out.println("Digte seu nome filho de uma meretriz");
        String nome=scan.next();
        System.out.println("Digte o seu CEP ");
        String cep=scan.next();
        System.out.println("Digte seu enderoço ");
        String end=scan.next();
        System.out.println("Digte seu telefone");
        String tel=scan.next();
        System.out.println("Nome"+nome+"\n"+
                "CEP:"+cep+"\n"+
                "Endereço:"+end+"\n"+
                "Telefone:"+tel+"\n");
        
        
        
    }
    public static void ex5(){
        System.out.println("Digite um valor");
        int valor1=scan.nextInt();
        System.out.println("Digite outro valor");
        int valor2=scan.nextInt();
        System.out.println("Digite outro valor");
        int valor3=scan.nextInt();
        double media=(valor1+valor2+valor3)/3;
        
        
        
    }
    public static void ex6(){
        int cont=0;
        int n1, n2,n3;
        System.out.println("Digite a nota 1");
        n1=scan.nextInt();
        System.out.println("Digite a nota 2");
        n2=scan.nextInt();
        System.out.println("Digite a nota 3");
        n3=scan.nextInt();
        int prod=(n1*1)+(n2*2)+(n3*3);
        System.out.println("A media é "+prod/6);
    }
    public static void ex7(){
        System.out.println("d");
        
    }
    public static void ex8(){
        System.out.println("Digite seu numero ");
        int num=scan.nextInt();
        System.out.println("O seu quadrado é   "+num*num);
    }
    public static void ex9(){
        System.out.println("");
    }
}
