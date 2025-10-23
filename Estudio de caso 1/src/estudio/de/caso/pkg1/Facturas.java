/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1;

/**
 *
 * @author jdsan
 */
public class Facturas {
    private String codigoFactura;
    private String nombreCliente;
    private String cedulaCliente;
    private double montoFactura;
    private int mes;
    private boolean prodElectricos;
    private boolean prodAutomotrices;
    private boolean prodConstruccion;

    // Constructor que inicializa todos los atributos del viaje
    public Facturas(String codigoFactura, String nombreCliente, String cedulaCliente, double montoFactura, int mes,
                 boolean prodElectricos, boolean prodAutomotrices, boolean prodConstruccion) {
        this.codigoFactura = codigoFactura;
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.prodElectricos = prodElectricos;
        this.prodAutomotrices = prodAutomotrices;
        this.prodConstruccion = prodConstruccion;
    }

    // calcular las comisiones totales del vendedor
    public double calcularComision() {
        double bono = 0;
        double base = 50000; //No se da un salario Base en el documento
         
        if (prodElectricos && prodAutomotrices && prodConstruccion ) bono += base * 0.10;
        if (montoFactura > 50000) bono += base * 0.05; 
        if (prodConstruccion) bono += base * 0.08;

        return base + bono;
    }

    // calcularr los puntos obtenidos por el vendedor
    public int calcularComisiones() {
        int puntos = 0;
        if (prodElectricos && prodAutomotrices && prodConstruccion) puntos += 3;
        if ( prodConstruccion ) puntos += 2;
        if ( montoFactura > 5000 ) puntos += 1;
        return puntos;
    }

    // obtener monto de la factura 
    public double getMontoFactura() {
        return montoFactura;
    }


}
