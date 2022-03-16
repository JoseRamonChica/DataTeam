package model;

/**
 * POO con acceso a bases de datos. Producto 1.
 * Esta clase "Cliente Premium" es la que contiene los clientes Premium
 * de la tienda
 * @author: Jose Miguel Serrano García
 * @version: 08/03/2022
 */
public class ClientePremium extends Cliente{
    /**
     * *************************************************************************
     * *****************Declaración de atributos (variables)********************
     * *************************************************************************
     */
    private float cuota, descuentoEnvio;    
    /**
     * *************************************************************************
     * *************Relaciones con otras clases (Diagrama UML)******************
     * *************************************************************************
     */
    
    

    /**
     * *************************************************************************
     * ***************************Constructores*********************************
     * *************************************************************************
     **/ 
    /**
     * Constructor sin parametros***********************************************
     */
    public ClientePremium(){
        
    }
    /**
     * Constructor con parametros***********************************************
     */
    /**
     * @param nombre define el nombre del cliente
     * @param domicilio define los apellidos del cliente
     * @param nif define el dni del cliente
     * @param email define el email de un cliente
     * @param cuota define una cuota para un cliente
     * @param descuentoEnvio define un descuento en el envio para un cliente
     * 
     */
     public ClientePremium (String nombre, String domicilio, String nif, String email, float cuota, float descuentoEnvio){
         super (nombre, domicilio, nif, email);         
         this.cuota = cuota;
         this.descuentoEnvio = descuentoEnvio;       
         
     }         
     
    /**
     * *************************************************************************
     * *************************Metodos consultores*****************************
     * *************************************************************************
     **/
    /**
     * 
     * @return cuota retorna la cuota que paga un socio premium
     */
    public float getCuota (){
        return this.cuota;
    }
    /**
     * 
     * @return descuentoEnvio retorna el descuento en el envio de un socio
     * premium
     */
    public float getDescuentoEnvio(){
        return this.descuentoEnvio;
    }

    /**
     * *************************************************************************
     * ************************Metodos modificadores****************************
     * *************************************************************************
     **/  
    /**
     * 
     * @param cuota establece la cuota de un socio premium
     */
    public void setCuota (float cuota){
        this.cuota = cuota;
    }
    /**
     * 
     * @param descuentoEnvio establece el descuento en los gastos de envio de 
     * un socio premium
     */
    public void setDescuentoEnvio (float descuentoEnvio){
        this.descuentoEnvio = descuentoEnvio;
    }
    
    @Override
    public String toString(){
        return "Cliente Premiun: " + this.nombre + "   Direccion: " + this.domicilio + "   NIF: " + this.nif + "   Email: " + this.email + " cuota: " + this.cuota + "Descuento en envio: " + this.descuentoEnvio;
    }     
    
    
}
