/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonal;

/**
 *
 * @author maxim
 */
public class sumadiagonal {
    public static void main(String[] args) {
        int valores [][]=new int[][]{{2,3,4},{5,-6,7},{-1,2,-4}};
       DiagonalPrincipal diag = new DiagonalPrincipal(); 
       int resultado = diag.resolver(valores);       
       System.out.println("la suma de las diagonales da como resultado: "+resultado);
}
    }