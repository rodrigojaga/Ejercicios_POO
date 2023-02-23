package erjerciciometodos;

import java.util.Scanner;

public class metodos {
    double saldo;
    
    public metodos(double saldo) {
        this.saldo = saldo;
    }
    public void abonar(double acreditado){
        this.saldo += acreditado; 
    }
    public void debitar(double debitado){
        this.saldo -= debitado; 
    }
    public double mostrar(){
        return this.saldo;
    }
    
    public static void main(String[] args) {
        boolean xd = true;
        Scanner hd = new Scanner(System.in);
        Scanner a1 = new Scanner(System.in);
        metodos cuenta1 = new metodos(0);
        metodos cuenta2 = new metodos(0);
        do{
            System.out.println("=====MENU PRINCIPAL=====");
            System.out.println("1. Acreditar ");
            System.out.println("2. Debitar");
            System.out.println("3. Mostrar ");
            System.out.println("4. Salir");
            int opcion = a1.nextInt();
            
            //metodos cuenta1 = new metodos();
            //metodos cuenta2 = new metodos();
            switch(opcion){
                
                case 1:
                    System.out.println("A que cuenta desea abonar?: ");
                    System.out.println("1. Cuenta No.1");
                    System.out.println("2. Cuneta No.2");
                    opcion = a1.nextInt();
                    if(opcion==1){
                        System.out.println("Cantidad a abonar a cuenta No.1: ");
                        double debitado = hd.nextDouble();
                        //metodos cuenta1 = new metodos(0);
                        cuenta1.abonar(debitado);
                    }else{
                        System.out.println("Cantidad a abonar a cuenta No.2: ");
                        double debitado = hd.nextDouble();
                        //metodos cuenta2 = new metodos(0);
                        cuenta2.abonar(debitado);
                    }       
                    break;
                case 2:
                    System.out.println("A que cuenta desea debitar?: ");
                    System.out.println("1. Cuenta No.1");
                    System.out.println("2. Cuneta No.2");
                    opcion = a1.nextInt();
                    if(opcion==1){
                        System.out.println("Cantidad a debitar a cuenta No.1: ");
                        double debitado = hd.nextDouble();
                        //metodos cuenta1 = new metodos(0);
                        cuenta1.abonar(debitado);
                    }else{
                        System.out.println("Cantidad a abonar a cuenta No.2: ");
                        double debitado = hd.nextDouble();
                        //metodos cuenta2 = new metodos(0);
                        cuenta2.abonar(debitado);
                    }       
                    break;
                case 3:
                    System.out.println("Saldo cuenta No.1: "+cuenta1.mostrar());
                    System.out.println("Saldo cuenta No.2: "+cuenta2.mostrar());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while(xd);
        
    }
}
