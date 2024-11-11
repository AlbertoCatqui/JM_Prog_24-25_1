package Tema3;

import java.util.Scanner;

public class E3_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int promedio = sc.nextInt();
        String calificacion;
        if (promedio<5){
            calificacion = "no apto";

        }else{
            if (promedio <6){
                calificacion="suficiente";
            }else{
                if (promedio<9){
                    calificacion="bien";
                }else{
                    calificacion="muy bien";
                }
            }
        }
        System.out.println(calificacion);
    }
}
