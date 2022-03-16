package model;
import java.util.*;

/**
 * POO con acceso a bases de datos. Producto 1.
 * Esta clase "Empresa" es la que contiene la tiemda Online
 * @author: Jose Miguel Serrano García
 * @version: 08/03/2022
 */
public class Empresa {
    /**
     * *************************************************************************
     * *****************Declaración de atributos (variables)********************
     * *************************************************************************
     */
    private String nombreEmpresa;
    
    /**
     * *************************************************************************
     * *************Relaciones con otras clases (Diagrama UML)******************
     * *************************************************************************
     */
    private ArrayList<Cliente> clientes; //Relacion de composicion con cliente
    private ArrayList<Pedido> pedidos; //Relacion de composicion con pedido
    private ArrayList<Articulo> articulos; //Relacion de composicion con articulo
    
    
    /**
     * *************************************************************************
     * ***************************Constructores*********************************
     * *************************************************************************
     **/
    
    
    
    /**
     * Constructor sin parametros***********************************************
     */
    public Empresa(){
        clientes = new ArrayList<Cliente>();//Relacion de composicion
        pedidos = new ArrayList<Pedido>(); //Relacion de composicoin
        articulos = new ArrayList<Articulo>(); //Relacion de composicion
        
    }//Fin del constructor
    
    /**
     * Constructor con parametros***********************************************
     */
    /**
     * 
     * @param nombreEmpresa establece el nombre de la tienda online
     */
    public Empresa (String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;

        clientes = new ArrayList<Cliente>();//Relacion de composicion
        pedidos = new ArrayList<Pedido>(); //Relacion de composicoin
        articulos = new ArrayList<Articulo>(); //Relacion de composicion
        
        
    }//Fin constructor
    
    /**
     * *************************************************************************
     * *************************Metodos consultores*****************************
     * *************************************************************************
     **/
    /**
     * 
     * @return retorna el nombre de la tienda online
     */
    public String getNombreEmpresa (){
        return this.nombreEmpresa;
    }
    
    /**
     * *************************************************************************
     * ************************Metodos modificadores****************************
     * *************************************************************************
     **/
    /**
     * 
     * @param nombreEmpresa establece el nombre de la empresa.
     */
    public void setNombreEmpresa (String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;
    }
    @Override
    public String toString(){
        return "Nombre de la tienda: " + this.nombreEmpresa + " ";
    }    
    
    
    
}
