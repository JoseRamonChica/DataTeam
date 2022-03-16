package model;
import java.time.*;
/**
 * POO con acceso a bases de datos. Producto 1.
 * Esta clase "Pedido" es la que contiene los pedidos de la tienda
 * @author: Jose Miguel Serrano García
 * @version: 08/03/2022
 */
public class Pedido {
    /**
     * *************************************************************************
     * *****************Declaración de atributos (variables)********************
     * *************************************************************************
     */
    private int numero, cantidad;
    LocalDate fechaPedido;
    LocalTime horaPedido;        
       
    /**
     * *************************************************************************
     * *************Relaciones con otras clases (Diagrama UML)******************
     * *************************************************************************
     */
    private Articulo articulo; //Asociacion con la clase Articulo
    private Cliente cliente; //Asociacion con la clase cliente
    
    /**
     * *************************************************************************
     * ***************************Constructores*********************************
     * *************************************************************************
     **/ 
    /**
     * Constructor sin parametros***********************************************
     */
    public Pedido(){
        
    }
    /**
     * Constructor con parametros***********************************************
     */
    /** 
     * 
     * @param numero define un numero de pedido
     * @param cantidad define la cantidad del articulo incluido en el pedido
     * @param fechaPedido establece la fecha en la que se hace el pedido
     * @param horaPedido establece la hora en la que se hace el pedido
     * @param articulo establece el articulo incluido en el pedido
     * @param cliente establce el cliente al que va el pedido
     */
    public Pedido(int numero, int cantidad, LocalDate fechaPedido, LocalTime horaPedido, Articulo articulo, Cliente cliente){
        this.numero = numero;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.articulo = articulo;
        this.cliente = cliente;
        
        
    }     
    /**
     * *************************************************************************
     * *************************Metodos consultores*****************************
     * *************************************************************************
     **/
    /**
     * 
     * @return retorna el numero de pedido de un Pedido
     */
    public int getNumeroPedido(){
        return this.numero;
    }
    /**
     * 
     * @return retorna la cantidad del articulo incluido en el Pedido 
     */
    public int getCantidad(){
        return this.cantidad;
    }
    /**
     * 
     * @return la fecha en la que se hizo el pedido 
     */
    public LocalDate getFechaPedido(){
        return this.fechaPedido;
    }
    /**
     * 
     * @return retorna la hora en la que se hizo el pedido 
     */
    public LocalTime getHoraPedido(){
        return this.horaPedido;
    }
    /**
     * *************************************************************************
     * ************************Metodos modificadores****************************
     * *************************************************************************
     **/  
    /**
     * 
     * @param numero esteblece el numero de un Pedido 
     */
    public void setNumeroPedido(int numero){
        this.numero = numero;
    }
    /**
     * 
     * @param cantidad establece la cantidad de articulo incluidad en el pedido
     */
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    /**
     * 
     * @param fechaPedido establece la fecha en la que se hace el pedido
     */
    public void setFechaPedido(LocalDate fechaPedido){
        this.fechaPedido = fechaPedido;
    }
    /**
     * 
     * @param horaPedido establece la hora en la que se hace el pedido
     */
    public void setHoraPedido(LocalTime horaPedido){
        this.horaPedido = horaPedido;
    }
    
    @Override 
    public String toString(){
        return "Pedido Numero: " + this.numero + "Cliente : " + this.cliente.nombre + "   Cantidad: " + this.cantidad + "   Articulo: " + this.articulo.getCodigoArticulo()+ "   Fecha: " + this.fechaPedido + " Hora: " + this.horaPedido + " ";
    
    }
    
}