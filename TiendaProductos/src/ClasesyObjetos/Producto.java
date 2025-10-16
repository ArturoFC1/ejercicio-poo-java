package ClasesyObjetos;

public class Producto {
    
    private String nombreProducto;
    private double precioProducto;
    private int cantidadDisponible;
    private int id;
    private static int idProductos = 1;

    public Producto(String nombreProducto, double precioProducto, int cantidadDisponible) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadDisponible = cantidadDisponible;
        this.id = idProductos;
        idProductos++;
    }
    
    public String getInformacionProducto(){
        return "- Nombre producto: "+nombreProducto+"\n- Precio: "+precioProducto+"\n"
                + "- Cantidad: "+cantidadDisponible;
    }
    
    public int getIdProducto(){
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    
    public void ventaProducto(int cantidad){
        cantidadDisponible -= cantidad;
    }
    
    public double totalVenta(int cantidad){
        return precioProducto * cantidad;
    }
}