/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.github;

public class ProyectoGithub {

    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " con una nota"
                + " deseada de " + args[3] + " y la nota real "+args[4]);
        
    }
    
    private static String veredicto(String valor1, String valor2) {
        /**
         * Si el primer valor es igual al segundo
         */
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";  //Da como resultado
        }
        /**
         * En cambio si el primer valor es menor que el segundo
         */
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";   //Da como resultado
        }
        return "Te has confiado. Falta realismo.";    //Termina con un return String
    }
}
