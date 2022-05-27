// Generated with g9.

package com.sat.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="usuario")
public class Usuario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    @Column(nullable=false, precision=10)
    private int rfc;
    @Column(nullable=false, length=20)
    private byte[] contrasena;

    /** Default constructor. */
    public Usuario() {
        super();
    }

    /**
     * Access method for rfc.
     *
     * @return the current value of rfc
     */
    public int getRfc() {
        return rfc;
    }

    /**
     * Setter method for rfc.
     *
     * @param aRfc the new value for rfc
     */
    public void setRfc(int aRfc) {
        rfc = aRfc;
    }

    /**
     * Access method for contrasena.
     *
     * @return the current value of contrasena
     */
    public byte[] getContrasena() {
        return contrasena;
    }

    /**
     * Setter method for contrasena.
     *
     * @param aContrasena the new value for contrasena
     */
    public void setContrasena(byte[] aContrasena) {
        contrasena = aContrasena;
    }

}
