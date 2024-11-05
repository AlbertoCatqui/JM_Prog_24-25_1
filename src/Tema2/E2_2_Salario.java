package Tema2;

import java.util.Scanner;

public class E2_2_Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre del trabajador:");
        String nombre = sc.nextLine();
        System.out.println("Introduce numero de horas semanales trabajadas");
        int horas = sc.nextInt();
        System.out.println("Introduce la tarifa normal por hora");
        double precioHora = sc.nextDouble();
        double salarioBruto;
        double salarioNeto = 0;
        /* Calculo de salario segun horas */
        if (horas >= 35) {
            int horasTarifaCara = horas - 35;
            salarioBruto = 35 * precioHora + horasTarifaCara * precioHora * 1.5;
        } else {
            salarioBruto = horas * precioHora;
        }
        /* Impuestos */
        if (salarioBruto <= 500) { //500 o menos
            salarioNeto = salarioBruto;
        } else if (salarioBruto > 500 && salarioBruto <= 900) { //900 o menos
            salarioNeto = ((salarioBruto - 500) * 0.75) + 500;
        } else if (salarioBruto > 900) {    //mas de 900
            salarioNeto = ((400) * 0.75) + ((salarioBruto - 900) * 0.55) + 500;
        }
        //salidas
        System.out.println("-Nombre: " + nombre);
        System.out.println("-Salario bruto: " + salarioBruto);
        System.out.println("-Tasas: " + (salarioBruto - salarioNeto));
        System.out.println("-Salario neto: " + salarioNeto);
    }
}
