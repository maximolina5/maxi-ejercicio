/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonal;

/**
 *
 * @author ASFMZA01
 */
public class DiagonalPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valores[][] = new int[][]{{2, 3, -4},{2, 3, 4},{-2, 3, 4}};
        int diag1 = 0;
        int diag2 = 0;
        
        for (int i = 0; i < valores.length; i++) {
            
            for( int j = 0; j < valores.length; j++) {
                if((i-j) == 0) {
                    diag1 += valores[i][j];
                }
                
                if((i+j) == (valores.length-1)) {
                    diag2 += valores[i][j];
                }
            }
            
        }
        
        System.out.println("El resultado es: " + (Math.abs(diag1 - diag2)));
    }
    
}
