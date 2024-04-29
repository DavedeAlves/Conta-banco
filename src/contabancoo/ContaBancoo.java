/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancoo;

import java.util.Scanner;

/**
 *
 * @author Davede faiska
 */
public class ContaBancoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o numero da agencia: ");
        int numeroagencia = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o numero do usuario: ");
        String numerousuario = sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomecliente = sc.nextLine();
        System.out.print("Digite o saldo do cliente: ");
        String saldocliente = sc.nextLine();
        
        System.out.println("Ola "+nomecliente+", obrigado por criar uma conta em nosso banco, sua agencia e "+numeroagencia+", conta "+numerousuario+" e seu saldo "+saldocliente+" ja esta disponivel para saque.");
    }
    
}
