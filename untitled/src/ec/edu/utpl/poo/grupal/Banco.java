package ec.edu.utpl.poo.grupal;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double sald, depo, ret;
        Cuenta c1 = new Cuenta();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese saldo de su cuenta");
        sald = sc.nextDouble();
        Cuenta c2 = new Cuenta(sald);

        System.out.println("Su saldo es: "+ c2.getSaldo());

        System.out.println("Ingrese la cantidad que desea depositar");
        depo = sc.nextDouble();
        c2.depositar(depo);
        System.out.println("Su saldo es: "+ c2.getSaldo());

        System.out.println("Ingrese la cantidad que desea retirar");
        ret = sc.nextDouble();
        c2.retirar(ret);
        System.out.println("Su saldo es: "+ c2.getSaldo());

        System.out.println("Cantidad de cuentas: " + c2.contCuenta);
    }
}
