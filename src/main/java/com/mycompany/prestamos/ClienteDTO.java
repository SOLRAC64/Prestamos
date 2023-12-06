
package com.mycompany.prestamos;

/**
 *
 * @author carlos
 */
public class ClienteDTO {
    private int cedula;
    private String nombre;
    private String apellido;
    private String telefCel1;
    private String telefCel2;
    private String telefHab;
    private String telefTrab;
    private String dirHab;
    private String dirTrab;

    public ClienteDTO() {
    }

    public ClienteDTO(int cedula, String nombre, String apellido, String telefCel1, String telefCel2, String telefHab, String telefTrab, String dirHab, String dirTrab) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefCel1 = telefCel1;
        this.telefCel2 = telefCel2;
        this.telefHab = telefHab;
        this.telefTrab = telefTrab;
        this.dirHab = dirHab;
        this.dirTrab = dirTrab;
    }

    public String getDirTrab() {
        return dirTrab;
    }

    public void setDirTrab(String dirTrab) {
        this.dirTrab = dirTrab;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefCel1() {
        return telefCel1;
    }

    public void setTelefCel1(String telefCel1) {
        this.telefCel1 = telefCel1;
    }

    public String getTelefCel2() {
        return telefCel2;
    }

    public void setTelefCel2(String telefCel2) {
        this.telefCel2 = telefCel2;
    }

    public String getTelefHab() {
        return telefHab;
    }

    public void setTelefHab(String telefHab) {
        this.telefHab = telefHab;
    }

    public String getTelefTrab() {
        return telefTrab;
    }

    public void setTelefTrab(String telefTrab) {
        this.telefTrab = telefTrab;
    }

    public String getDirHab() {
        return dirHab;
    }

    public void setDirHab(String dirHab) {
        this.dirHab = dirHab;
    }

    
    
    
}
