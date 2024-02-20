/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cuentas;

/**
 *
 * @author dponz
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2300, 695);
    }

    private static void operativa_cuenta(float cantidadRetirar, float cantidadIngresar) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(cantidadRetirar);
            saldoActual = cuenta1.estado();
            System.out.println("Después de retirar " + cantidadRetirar + ", el saldo actual es "+ saldoActual );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidadIngresar);
            saldoActual = cuenta1.estado();
            System.out.println("Después de ingresar " + cantidadIngresar + ", el saldo actual es "+ saldoActual );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
