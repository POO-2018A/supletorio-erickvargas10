/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

import java.io.Serializable;

public class ClsProductos implements Serializable{
    
    private int id;
    private String nombre;
    private String precio;
    private String marca;

    public ClsProductos(int id, String nombre, String precio, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    ClsProductos(String nombre, String marca, String precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
   

    @Override
    public String toString(){
        return this.id+" "+this.nombre;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the estado
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String marca) {
        this.marca = marca;
    }
    
    
}
