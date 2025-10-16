package ClasesyObjetos;

public class Cliente {
    
    private String nombre;
    private double dineroDisponible;
    private Producto producto [];

    public Cliente(String nombre, double dineroDisponible, Producto producto []) {
        this.nombre = nombre;
        this.dineroDisponible = dineroDisponible;
        this.producto = producto;
    }
    
    public String getInformacionCliente(){
        return "Nombre cliente: "+nombre+"\nDinero: "+dineroDisponible;
    }
    
    public void disminuirDinero(double gasto){
        dineroDisponible -= gasto;
    }
    
    public void comprarProducto(int idP, int cantidad){
        if (cantidad < producto[idP].getCantidadDisponible()) {
            if (dineroDisponible > producto[idP].totalVenta(cantidad)) {
                producto[idP].ventaProducto(cantidad);
                disminuirDinero(producto[idP].totalVenta(cantidad));
                System.out.println("Compra realizada");    
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("No hay producto disponible");
        }
    }

}