package model;

//package vista;

import java.util.Objects;


/**
 * POO con acceso a bases de datos. Producto 1.
 * Esta clase "Cliente" es la que contiene los clientes de la tienda
 * @author: Jose Miguel Serrano García
 * @version: 08/03/2022
 */
public abstract class Cliente {
    /**
     * *************************************************************************
     * *****************Declaración de atributos (variables)********************
     * *************************************************************************
     */
    protected String nombre, domicilio, nif, email;
    
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
    public Cliente(){
    }//Fin de constructor
    
    /**
     * Constructor con parametros***********************************************
     */
     /** Constructor con parametros*********************************************
     * @param nombre define el nombre del cliente
     * @param domicilio define los apellidos del cliente
     * @param nif define el dni del cliente
     * @param email define el email de un cliente
     */ 
     public Cliente (String nombre, String domicilio, String nif, String email){
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
     * 
     * @return retorna el nombre del cliente 
     */
    public String getNombre (){
        return this.nombre;
    }
    /**
     * @return retorna el domicilio del cliente
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * 
     * @return el nif de un cliente 
     */
    public String getNif(){
        return this.nif;
    }
    /**
     * 
     * @return retorna el email de un cliente 
     */
    public String getEmail(){
        return this.email;
    }
    
    
    /**
     * *************************************************************************
     * ************************Metodos modificadores****************************
     * *************************************************************************
     **/  
    /**
     * @param nombre establece el nombre de un cliente
     */  
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    /**
     * 
     * @param domicilio establece el domicilio de un cliente
     */
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    /**
     * 
     * @param nif establece el nif de un cliente
     */
    public void setNif (String nif){
        this.nif = nif;
    }
    /**
     * 
     * @param email establece el email de un cliente
     */
    public void setEmail (String email){
        this.email = email;
    }   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.email);
        return hash;
    }
/**
 * 
 * Sobrescribe el metodo equal y hashCode para que diferencie entre dos clases 
 * de tipo Cliente mediante el email
 * @return true si es igual, false si no es igual
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString(){
        return "Cliente: " + this.nombre + "   Direccion: " + this.domicilio + "   NIF: " + this.nif + "   Email: " + this.email;
    }
}//fin de cliente
