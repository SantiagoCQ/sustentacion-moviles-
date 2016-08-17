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
public class Sustentacionlab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
        int opcion = 7;
        Producto catalogo[] = new Producto[100];
        
        for(int k=0; k<catalogo.length; k++){       //creo la lista de productos, con tosos sus atributos en cero
            catalogo[k] = new Producto();
            catalogo[k].Productokk();
        }
        
        do{
            System.out.println("Digite una opcion:");
            System.out.println("1. Agregar producto.");
            System.out.println("2. Buscar producto.");
            System.out.println("3. Eliminar producto.");
            System.out.println("4. Mostrar inventario.");
            System.out.println("5. Realizar venta.");
            System.out.println("6. Mostrar Ganancias totales.");
            System.out.println("7. Salir");
            opcion = lector.nextInt();
            switch (opcion){
                case 1:
                    for (int i=0; i<catalogo.length; i++){
                        
                        String cmp = " ";
                        float value = catalogo[i].getValorunitario();
                        int quantity = catalogo[i].getCantidad();
                        int soldunts = catalogo[i].getUnidades_vendidas();
                        if(cmp.equals(catalogo[i].getNombre()) && quantity==0 && soldunts==0){
                            catalogo[i].set_producto();
                            i=catalogo.length;
                        }
                        else if(i==catalogo.length){
                            System.out.println("No es posible crear mas productos, porfavor contacte al soporte tecnico.");
                        }
                    }
                break;
                case 2:
                    System.out.println("Por favor ingrese el nobre del producto que desea buscar.");
                    String busqueda = lector.next();
                    for(int z=0; z<catalogo.length; z++){
                        if(z==catalogo.length-1){
                            System.out.println("El producto no existe.");
                        }
                        if(busqueda.equals(catalogo[z].getNombre())){
                            System.out.println("Nombre del producto: "+ catalogo[z].getNombre());
                            System.out.println("Cantidad disponible: "+ catalogo[z].getCantidad());
                            System.out.println("Precio unitario: "+ catalogo[z].getValorunitario());
                            z=catalogo.length;
                        }
                    }
                    
                break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a borrar");
                    String kkk = lector.next();
                    for(int j=0; j<catalogo.length; j++){
                        if(j==catalogo.length-1){
                            System.out.println("El Producto no exixte!");
                        }
                        if(kkk.equals(catalogo[j].getNombre())){
                            catalogo[j].Productokk();
                            j=catalogo.length;
                        }
                    }
                break;
                case 4:
                    System.out.println("Lista de productos:");
                    String f = " ";
                    for (int l=0; l<catalogo.length; l++){
                        if(f.equals(catalogo[l].getNombre())){
                            
                        }
                        else{
                            System.out.println("Nombre del producto: "+catalogo[l].getNombre());
                            System.out.println("Unidades disponibles: "+catalogo[l].getCantidad());
                            System.out.println("Precio: "+catalogo[l].getValorunitario());
                        }
                    }
                break;
                case 5:
                    System.out.println("Ingrese el nombre del producto a vender");
                    busqueda = lector.next();
                    for(int z=0; z<catalogo.length; z++){
                        if(z==catalogo.length-1){
                            System.out.println("El producto no existe.");
                        }
                        if(busqueda.equals(catalogo[z].getNombre())){
                            System.out.println("Ingrese la cantidad de productos a vender.");
                            int u = lector.nextInt();
                            catalogo[z].setUnidades_vendidas(u);
                        }
                    } 
                break;
                case 6:
                    System.out.println("Lista de productos y ganancias:");
                    f = " ";
                    for (int l=0; l<catalogo.length; l++){
                        if(f.equals(catalogo[l].getNombre())){
                            
                        }
                        else{
                            System.out.println("Nombre del producto: "+catalogo[l].getNombre());
                            System.out.println("Unidades disponibles: "+catalogo[l].getCantidad());
                            System.out.println("Precio: "+catalogo[l].getValorunitario());
                            System.out.println("Unidades vendidas: "+catalogo[l].getUnidades_vendidas());
                            System.out.println("Ganancias totales: "+(catalogo[l].getUnidades_vendidas()*catalogo[l].getValorunitario()));
                        }
                    }
                break;
            }
        }while(opcion != 7);
    }
    
}
