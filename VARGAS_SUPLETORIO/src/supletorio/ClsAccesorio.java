/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

/**
 *
 * @author ESFOT
 */
public class ClsAccesorio {
    private String tipo;
    private String capacidad;
    private String ram;
    private String  procesador;
     private String color;
      private String velocidad;

    public ClsAccesorio(String tipo, String capacidad, String ram, String procesador, String color, String velocidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ram = ram;
        this.procesador = procesador;
        this.color = color;
        this.velocidad = velocidad;
    }

    ClsAccesorio(String laptop, String gb, String ram, String intel) {
    this.tipo = tipo;
        this.capacidad = capacidad;
        this.ram = ram;
        this.procesador = procesador;
    }

    ClsAccesorio(String mochila, String coloro) {
      this.tipo = tipo;
      this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
      
      
      
    
    
}
