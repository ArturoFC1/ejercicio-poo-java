package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void mostrarProductosDisponibles(Producto product[]){
        System.out.println(" ID - Nombre - Precio - Cantidad");
        for (int i = 0; i < product.length; i++) {
            System.out.println("* "+product[i].getIdProducto()+" - "+product[i].getNombreProducto()+"  -  "+product[i].getPrecioProducto()+"  -  "+
                    product[i].getCantidadDisponible()+"\n");
        }
    }
    public static int buscarIDProducto(Producto productos[], int id){
        boolean encontrado = false;
        int i = 0, indice = -1;
        
        while(i < productos.length && encontrado == false){
            if (id == productos[i].getIdProducto()) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        return indice;
    }
    public static void main(String[] args) {
        String nombre, nombreProducto;
        double dineroDisponible, precioProducto;
        int cantidadProductos, cantidadProducto, cantidadVenta, idProducto, idEncontrado, opc;
        Producto product [];
        Cliente client;
        
        nombre = JOptionPane.showInputDialog("Ingrese nombre de usuario: ");
        dineroDisponible = Double.parseDouble(JOptionPane.showInputDialog("Ingrese dineron disponible: "));
        cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos a registrar: "));
        
        product = new Producto[cantidadProductos];
        
        for (int i = 0; i < cantidadProductos; i++) {
            nombreProducto = JOptionPane.showInputDialog((i+1)+". Ingrese nombre del producto: ");
            precioProducto = Double.parseDouble(JOptionPane.showInputDialog((i+1)+". Ingese precio del producto: "));
            cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Ingrese stock del producto: "));
            
            product[i] = new Producto(nombreProducto, precioProducto, cantidadProducto);
        }
        
        client = new Cliente(nombre, dineroDisponible, product);
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("--Tienda DoñaGorda--\n"
                    + "1. Ver productos\n"
                    + "2. Ver mi informacion\n"
                    + "3. Comprar productos\n"
                    + "4. Salir\n"
                    + "Ingrese una opcion: "));
            
            switch  (opc){
                case 1: 
                    mostrarProductosDisponibles(product);
                    break;
                case 2:
                    System.out.println(client.getInformacionCliente());
                    break;
                case 3:
                    idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id de producto a comprar"));
                    idEncontrado = buscarIDProducto(product, idProducto); 
                    if (idEncontrado == -1) {
                        System.out.println("ID de producto no existe");
                    }else{
                        cantidadVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad del producto " +product[idEncontrado].getNombreProducto()+" a comprar"));
                        client.comprarProducto(idEncontrado, cantidadVenta);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta ingrese otra opcion");
            }
        } while (opc != 4);
    }
}