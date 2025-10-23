/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author jdsan
 */
public class EstudioDeCaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Solicitar datos del vendedor
        String nombre = JOptionPane.showInputDialog("Nombre del conductor:");
        String cedula = JOptionPane.showInputDialog("Cédula del conductor:");
        String codigoEmpleado = JOptionPane.showInputDialog("Código de empleado:");
        int vehiculo = JOptionPane.showConfirmDialog(null, "¿Tiene vehiculo propio?", "Vehiculo", JOptionPane.YES_NO_OPTION);
        String sucursal = JOptionPane.showInputDialog("Nombre de la sucursal:");
       
        // Agregar un nuevo vendedor 
        Vendedor vendedor1 = new Vendedor(nombre, cedula, codigoEmpleado, vehiculo, vehiculo == JOptionPane.YES_OPTION, sucursal);
        // Variables acumuladoras
        int cantProductosElectricos = 0;
        int cantProductosAutomotrices = 0;
        int cantProductosContruccion = 0;
        int totalPuntos = 0;
        int totalFacturas = 0;

            // Obtenr los datod de la factura
            String codFactura = JOptionPane.showInputDialog("Código de la factura:");
            String nomCliente = JOptionPane.showInputDialog("Nombre del cliente:");
            String cedCliente = JOptionPane.showInputDialog("Cédula del cliente:");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Número de mes (1-12):"));
            boolean productoElectrico = JOptionPane.showConfirmDialog(null, "¿Compro un producto Electrico?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productoAutomotriz = JOptionPane.showConfirmDialog(null, "¿¿Compro un producto Automotriz?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productoConstruccion = JOptionPane.showConfirmDialog(null, "¿¿Compro un producto de Construccion?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

            // Agregar una nueva Factura
            Facturas fact1 = new Factura(codFactura, nomCliente, cedCliente, monto, mes, productoElectrico, productoAutomotriz, productoConstruccion);

            //acumular dato
                total += fact1.getDistanciaKm();
                totalComisiones += fact1.calcularComisiones();
                totalPuntos += fact1.calcularPuntos();
                totalFacturas++;
            

        // Verificar si aplica bono extra
        boolean bonoExtra = totaFacturas > 3 || monto >300000;
        if (bonoExtra) {
            totalComisiones += 2000;
            totalPuntos += 5;
        }

        // Mostrar resumen final
        String resumen = "El Vendedor \"" + Vendedor.getNombre() + "\" código: " + conductor.getCodigoEmpleado() + "\n" +
                "· Vendio un total de " + montoFactura + "
                "· Obtuvo un total en comisiones de $" + totalComisiones + "\n" +
                "· " + (bonoExtra ? "Logró el BONO EXTRA." : "No logró el bono extra.") + "\n" +
                "· Puntos obtenidos: " + totalPuntos + "\n" +
                "· " + (vendedor.tieneVehiculoPropio() ? "Cuenta con licencia vehiculo." : "No tiene.") + "\n" +
             

        JOptionPane.showMessageDialog(null, resumen);
    }
    
}
