/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1;

/**
 *
 * @author jdsan
 */
public class Vendedor {
    private String nombre;
    private String cedula;
    private String codigoEmpleado;
    private boolean vehiculoPropio;
    private String sucursal;

    public Vendedor(String nombre, String cedula, String codigoFactura, int monto, boolean vehiculoPropio, String sucursal) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigoEmpleado = codigoEmpleado;
        this.vehiculoPropio = vehiculoPropio;
        this.sucursal = sucursal;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCodigoEmpleado() { return codigoEmpleado; }
    public boolean tieneVehiculoPropio() { return vehiculoPropio; }
}
