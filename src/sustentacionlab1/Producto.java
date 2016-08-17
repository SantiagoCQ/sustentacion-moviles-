/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacionlab1;
import java.util.Scanner;
/**
 *
 * @author Santiago
 */
public class Producto {
    private Scanner lector;
    private String Nombre;
    private int cantidad;
    private float valorunitario;
    private int unidades_vendidas;

    public void Productokk(){
        Nombre = " ";
        cantidad = 0;
        valorunitario = 0;
        unidades_vendidas = 0;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getValorunitario() {
        return valorunitario;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }
    
    public float ganancias_producto(){
        return (getUnidades_vendidas()*getValorunitario());
    }
    
        public void set_producto(){
        lector = new Scanner (System.in);
        System.out.println("Se creara un nuevo producto.");
        System.out.println("Ingrese el nombre del producto");
        Nombre = lector.nextLine();
        System.out.println("Ingrese la cantidad de unidades disponibles.");
        cantidad = lector.nextInt();
        System.out.println("Ingrese el valor unitario.");
        valorunitario = lector.nextFloat();
        unidades_vendidas = 0;
    }
    
    
}
