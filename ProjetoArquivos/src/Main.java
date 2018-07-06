
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Carvalho
 */
public class Main {
    static int loop = 0;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("Opção 1 : Bolsa de Maior Valor.");
        System.out.println("Opção 2 : Bolsa de Menor Valor.");
        System.out.println("Opção 3 : Média de Valores de Todas as Bolsas.");
        System.out.println("Opção 4 : Bolsas por estado.");
        int op = scan.nextInt();
        switch(op){
            case 1:
                Bolsas a = BMaior();
                if(a!=null){
                System.out.println("A Bolsa de Maior Valor é : "+a.getValor());
                System.out.println("Dados da Bolsa: ");
                System.out.println("Estado: "+a.getUf());
                System.out.println("NIS: "+a.getNisFav());
                System.out.println("Nome: "+a.getNomeFav());
                System.out.println("Valor: "+a.getValor());
                }else{
                    System.out.println("Erro ao ler o arquivo.");
                }
                break;
                
            case 2:
                Bolsas b = BMenor();
                if(b!=null){
                System.out.println("A Bolsa de Menor Valor é : "+b.getValor());
                System.out.println("Dados da Bolsa: ");
                System.out.println("Estado: "+b.getUf());
                System.out.println("NIS: "+b.getNisFav());
                System.out.println("Nome: "+b.getNomeFav());
                System.out.println("Valor: "+b.getValor());
                }else{
                    System.out.println("Erro ao ler o arquivo.");
                }
                break;
            case 3:
                System.out.println("O Valor Médio do Valor das Bolsas é: "+Media());
                break;
            case 4:    
                break;
            
           }
        
    }
    
    public static Bolsas BMaior(){
        String Filename;
        int Maior = 0;
        Bolsas A = null;
        Filename = "bolsa.csv";
        //String Busc = JOptionPane.showInputDialog(null, "CEP", "Insira o CEP",0);
        try{
            RandomAccessFile C = new RandomAccessFile("bolsa.csv","r");
            C.readLine();
    
            
            Bolsas lin = new Bolsas();
            int i=0;
                while(C.getFilePointer()< C.length()){
                
                    //System.out.println(i);
                    i++;
                    lin.recuperaBolsa(C.readLine());
                    String compa = lin.getValor();
                    
                    compa = compa.replace(".00","");
                    
                    if(compa.indexOf(",")!= -1){
                        compa = compa.replaceAll(",", "");
                        
                    }
                    int comp = Integer.parseInt(compa);
                    //System.out.println("Maior: "+comp);
                    
                        if(comp > Maior){
                            
                            Maior = comp;
                           //System.out.println("OOOO");
                            A = lin;
                        }
                            
                   // C.seek(loop);
                }
        }
        catch(Exception e){
            System.out.println("Erro");
            
        }
        return A;
    }
    
    public static Bolsas BMenor(){
        String Filename;
        int Menor = 0;
        Bolsas B = null;
        Filename = "bolsa.csv";
        //String Busc = JOptionPane.showInputDialog(null, "CEP", "Insira o CEP",0);
        try{
            RandomAccessFile C = new RandomAccessFile("bolsa.csv","r");
            Bolsas lin = new Bolsas();
            C.readLine();
            lin.recuperaBolsa(C.readLine());
            String compa = lin.getValor();
                    compa = compa.replace(".00","");
                    if(compa.indexOf(",")!= -1){
                        compa = compa.replace(",", "");
                        
                    }
                    int comp = Integer.parseInt(compa);
                    System.out.println(comp);
            B = lin;
            
       
                while(C.getFilePointer()< C.length()){        
                        lin.recuperaBolsa(C.readLine());
                        String compa2 = lin.getValor();
                    compa2 = compa2.replace(".00","");
                    if(compa2.indexOf(",")!= -1){
                        compa2 = compa2.replace(",", "");
                        
                    }
                    int comp2 = Integer.parseInt(compa2);
                    System.out.println(comp2);
                        
                        if(comp2< Menor){
                            
                            Menor = comp2;
                            System.out.println(Menor);
                            B = lin;
                        }
               }
        }
        catch(Exception e){
            System.out.println("Erro");
            
        }
        return B;
    }
    
    public static double Media(){
        String Filename;
        double Media = 0;
        double Quant = 0;
        double TD = 0;
        
        Filename = "bolsa.csv";
        //String Busc = JOptionPane.showInputDialog(null, "CEP", "Insira o CEP",0);
        try{
            RandomAccessFile C = new RandomAccessFile("bolsa.csv","r");
            Bolsas lin = new Bolsas();
            C.readLine();
            
                //while(C.getFilePointer()< C.length()){
                for(int h = 0; h<10;h++){
                  lin.recuperaBolsa(C.readLine());
                  String compa = lin.getValor();
                    compa = compa.replace(".00","");
                    if(compa.indexOf(",")!= -1){
                        compa = compa.replace(",", "");
                        
                    }
                    double comp = Double.parseDouble(compa);
                    System.out.println(comp);
                  
                  TD +=comp;
                    System.out.println("td; "+TD);
                  Quant++;
                    
                }
                Media = TD/Quant;
        }
        catch(Exception e){
            System.out.println("Erro");
            
        }
        return Media;
    }
    
    
    
}