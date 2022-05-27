// Generated with g9.

package com.sat.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="complemento")
public class Complemento implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Column(nullable=false, precision=10)
    private int idcomplemento;
    @Column(nullable=false, length=50)
    private String tipocomprobante;
    @Column(nullable=false, precision=10)
    private int rfc;

    /** Default constructor. */
    public Complemento() {
        super();
    }

    /**
     * Access method for idcomplemento.
     *
     * @return the current value of idcomplemento
     */
    public int getIdcomplemento() {
        return idcomplemento;
    }

    /**
     * Setter method for idcomplemento.
     *
     * @param aIdcomplemento the new value for idcomplemento
     */
    public void setIdcomplemento(int aIdcomplemento) {
        idcomplemento = aIdcomplemento;
    }

    /**
     * Access method for tipocomprobante.
     *
     * @return the current value of tipocomprobante
     */
    public String getTipocomprobante() {
        return tipocomprobante;
    }

    /**
     * Setter method for tipocomprobante.
     *
     * @param aTipocomprobante the new value for tipocomprobante
     */
    public void setTipocomprobante(String aTipocomprobante) {
        tipocomprobante = aTipocomprobante;
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

}
