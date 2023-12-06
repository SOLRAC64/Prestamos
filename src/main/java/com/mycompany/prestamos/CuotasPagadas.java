
package com.mycompany.prestamos;

import java.util.Date;


public class CuotasPagadas {
    int idCuota;
    int idPrestamo;
    Date fechaPago;

    public CuotasPagadas(PrestamoDTO prestamo) {
        this.idCuota = 0;
        this.idPrestamo = prestamo.getIdPrestamo();
        this.fechaPago = new Date();
    }   
     public CuotasPagadas(int idPrestamo) {
        this.idCuota = 0;
        this.idPrestamo = idPrestamo;
        this.fechaPago = new Date();
    }     

}
