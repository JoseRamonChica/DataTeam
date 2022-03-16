package model;

/**
 * POO con acceso a bases de datos. Producto 1.
 * Esta clase "Cliente Estandar" es la que contiene los clientes estandar
 * de la tienda
 * @author: Jose Miguel Serrano García
 * @version: 08/03/2022
 */
public class ClienteEstandar extends Cliente {
    /**
     * *************************************************************************
     * *****************Declaración de atributos (variables)********************
     * *************************************************************************
     */
     
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
    public ClienteEstandar(){        
    }
     /** Constructor con parametros***********************************************
     * @param nombre define el nombre del cliente
     * @param domicilio define los apellidos del cliente
     * @param nif define el dni del cliente
     * @param email define el email de un cliente
     */ 
     public ClienteEstandar (String nombre, String domicilio, String nif, String email){
         super();
         this.nombre = nombre;
         this.domicilio = domicilio;
         this.nif = nif;
         this.email = email;
     }//Fin de constructor
   
     
     
     
    /**
     * *************************************************************************
     * *************************Metodos consultores*****************************
     * *************************************************************************
     **/








    /**
     * *************************************************************************
     * ************************Metodos modificadores****************************
     * *************************************************************************
     * @return 
     **/  
    
    @Override
    public String toString(){
        return "Cliente Estandar: " + this.nombre + "   Direccion: " + this.domicilio + "   NIF: " + this.nif + "   Email: " + this.email + " ";
    }    
  
}
