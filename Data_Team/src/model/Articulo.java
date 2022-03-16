package model;
/**
 * POO con acceso a bases de datos. Producto 1.
 * Esta clase "Pedido" es la que contiene los pedidos de la tienda
 * @author: Jose Miguel Serrano García
 * @version: 08/03/2022
 */
public class Articulo {
    /**
     * *************************************************************************
     * *****************Declaración de atributos (variables)********************
     * *************************************************************************
     */
    private int codigo, tiempoEnvio;
    private float precio, gastosEnvio;
    private String descripcion;
    
    
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
    public Articulo(){
        
    }
            
    /**
     * Constructor con parametros***********************************************
     */
    /**
     * 
     * @param codigo establece el codigo del Articulo
     * @param descripcion establece la descripcion del Articulo
     * @param precio establece el precio del Articulo
     * @param gastosEnvio establece los gastos de envio del Articulo
     * @param tiempoEnvio  establece el tiempo de envio del Articulo
     */
    public Articulo (int codigo, String descripcion, float precio, float gastosEnvio, int tiempoEnvio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gastosEnvio = gastosEnvio;
        this.tiempoEnvio = tiempoEnvio;
            
    }    
    /**
     * *************************************************************************
     * *************************Metodos consultores*****************************
     * *************************************************************************
     **/
    /**
     * 
     * @return retorna el codigo del Articulo 
     */
    public int getCodigoArticulo(){
        return this.codigo;
    }
    /**
     * 
     * @return retorna la descripcion del Articulo 
     */
    public String getDescripcion (){
        return this.descripcion;
    }
    /**
     * 
     * @return retorna el precio del Articulo 
     */
    public float getPrecio (){
        return this.precio;
    }
    /**
     * 
     * @return retorna los gastos de envio de un Articulo 
     */
    public float getGastoEnvio(){
        return this.gastosEnvio;
    }
    /**
     * 
     * @return el tiempo necesario para preparar un envio, en minutos
     */
    public int getTiempoEnvio (){
        return this.tiempoEnvio;
    }
    /**
     * *************************************************************************
     * ************************Metodos modificadores****************************
     * *************************************************************************
     **/  
    /**
     * 
     * @param codigo establece el codigo de un envio.
     */
    public void setCodigoArticulo (int codigo){
        this.codigo = codigo;
    }
    /**
     * 
     * @param descripcion establece la descripcion de un articulo. 
     */
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    /**
     * 
     * @param precio establece el precio de un articulo 
     */
    public void setPrecio (float precio){
        this.precio = precio;
    }
    /**
     * 
     * @param gastosEnvio establece los gastos de envio de un articulo
     */
    public void setGastosEnvio(float gastosEnvio){
        this.gastosEnvio = gastosEnvio;
    }
    /**
     * 
     * @param tiempoEnvio establece el tiempo de preparacion de un articulo en 
     * minutos.
     */
    public void setTiempoEnvio (int tiempoEnvio){
        this.tiempoEnvio = tiempoEnvio;
    }
    
    @Override
    public String toString(){
        return "Codigo Articulo: " + this.codigo + "   : " + this.descripcion + "   Precio: " + this.precio + "   Gastos Envio: " + this.gastosEnvio + "   Tiempo Envio: " + this.tiempoEnvio + " ";
    }
 
}