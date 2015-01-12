/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg1;


/**
 * Clase Consumo , que contiene todos los metodos del programa.
 * @author mperezmartinez
 */
public class Consumo {
    
   private double km;
   private double litros;

    /**
     *
     */
    public double vMed;
   private double pGas;
   
    /**
     *Devuelve vMed
     * @return vMed
     */
    public double getvMed() {
        return vMed;
    }

     /**
      * Permite cambiar los kilometros
      * @param km 
      */
    public void setKm(double km) {
        this.km = km;
    }

/**
 * Permite cambiar los litros
 * @param litros 
 */
    public void setLitros(double litros) {
        this.litros = litros;
    }

/**
 * Permite cambiar los vMed
 * @param vMed 
 */
    public void setvMed(double vMed) {
        this.vMed = vMed;
    }

/**
 * Permite cambiar los pGas
 * @param pGas 
 */
    public void setpGas(double pGas) {
        this.pGas = pGas;
    }

    /**
     *
     */
    public Consumo(){

}   
 
 /**
  * 
  * @param km
  * @param litros
  * @param pGas
  * @param vMed 
  */
 public Consumo(double km, double litros, double pGas , double vMed){
     
     this.km=km;
     this.litros=litros;
     this.pGas=pGas;
     this.vMed=vMed;
     
 }
 
    /**
     *Calcula el tiempempo con los km y la vMed
     * @param km
     * @param vMed
     * @return
     */
    public double getTiempo(double km,double vMed) {
     
    this.km=km;
    this.vMed=vMed;
    
    return km/vMed;   
 }
 
    /**
     *Calcula en consumoMedio con los litros y km
     * @param km
     * @param litros
     * @return
     */
    public double consumoMedio(double km,double litros){
    
  this.km=km;
  this.litros=litros;
    
  return litros*100/km;        
  
}

    /**
     *Calcula el consumoEuros con el pGas y los Km
     * @param km
     * @param pGas
     * @return
     */
    public double consumoEuros(double km, double pGas){
    
  this.km=km;
  this.pGas=pGas;
    
    return pGas*100/km;
}
    
}
