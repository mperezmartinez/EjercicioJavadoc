/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg1;

/**
 *
 * @author mperezmartinez
 */
public class Boletin41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consumo con = new Consumo();
        
        con.setLitros(50);
        con.setpGas(1.57);
        
        
        
        Consumo con2 = new Consumo(100,50,1.57,80);
        
      con2.consumoMedio(100, 50);
      
      System.out.println("Consumo medio ="+con2.consumoMedio(100, 50));
      
      
      con2.setLitros(25);
      
      
      System.out.println("velocidade media = "+con2.getvMed());  
        
        // TODO code application logic here
    }
    
}
