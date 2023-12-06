
package com.mycompany.prestamos;
import java.util.Date;

/**
 *
 * @author carlos
 */
public class PrestamoDTO {
    
    private int idPrestamo;
    private ClienteDTO cliente;
    private Date fecha;
    private double montoPrestamo;
    private double tasa;
    private int cuotas;
    private int cuotasPagadas;
    
    
    public double totalAPagar(){
        return montoPrestamo * (1 + tasa / 100);
    }
    
    public double getMontoCuota(){
        return totalAPagar() / cuotas;
    }
    
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getCuotasPagadas() {
        return cuotasPagadas;
    }

    public void setCuotasPagadas(int cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }
    
    
}
