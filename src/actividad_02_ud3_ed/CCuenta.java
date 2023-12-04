/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Alvaro
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Nombre de la cuenta
    * @param sal Numero de saldo en cuenta
    * @param tipo Numero de tipos
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        /**
         *@param declara variablesde la clase ccuenta
         * @author Alvaro
         */
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
   /**
         * declara la clase string de nombre
     * @param nom
         */
    public void asignarNombre(String nom)
    {
        
        nombre=nom;
    }
    /**
         *aqui se declara este metodo pra que devuelva un nombre
     * @return 
         */
    public String obtenerNombre()
    {
        
        return nombre;
    }

    /**
         *constructor de estado de cuenta se declara metodo para que devuelva un saldo
     * @return 
         */
     public double estado ()
    {
        
        return saldo;
    }

     /**
         * constructor de clase para ingresar dinero
     * @param cantidad
     * @throws java.lang.Exception
         */
    public void ingresar(double cantidad) throws Exception
    {
        
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
         *constructor de clase para retirar dinero
     * @param cantidad
     * @throws java.lang.Exception
         */
    public void retirar (double cantidad) throws Exception
    {
       
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
         * constructor para que muestre una cuenta
     * @return 
         */
    public String obtenerCuenta ()
    {
        
        return cuenta;
    }

   /**
     * @param cuenta
         * constructor para que selecciona una cuenta
         */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
    
  }
/**
         * constructor para que selecciona un saldo
     * @param saldo
         */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
    
  }

  /**
         *constructor para que muestre los intereses
     * @return 
         */
  public double getTipoInterés() {
    return tipoInterés;
    
  }
/**
         *constructor para que muestre el tipo de interes
     * @param tipoInterés
         */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
    
  }
}
