// Generated with g9.

package com.sat.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="emisor/receptor")
public class Emisor_receptor implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Column(nullable=false, precision=10)
    private int idemirec;
    @Column(nullable=false, length=30)
    private String nombre;
    @Column(nullable=false, length=50)
    private String regimen;
    @Column(nullable=false, length=40)
    private String tipofactura;
    @Column(nullable=false, length=20)
    private String clientefrecuente;
    @Column(nullable=false, length=30)
    private String usofactura;
    @Column(nullable=false, precision=10)
    private int rfc;

    /** Default constructor. */
    public Emisor_receptor() {
        super();
    }

    /**
     * Access method for idemirec.
     *
     * @return the current value of idemirec
     */
    public int getIdemirec() {
        return idemirec;
    }

    /**
     * Setter method for idemirec.
     *
     * @param aIdemirec the new value for idemirec
     */
    public void setIdemirec(int aIdemirec) {
        idemirec = aIdemirec;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for regimen.
     *
     * @return the current value of regimen
     */
    public String getRegimen() {
        return regimen;
    }

    /**
     * Setter method for regimen.
     *
     * @param aRegimen the new value for regimen
     */
    public void setRegimen(String aRegimen) {
        regimen = aRegimen;
    }

    /**
     * Access method for tipofactura.
     *
     * @return the current value of tipofactura
     */
    public String getTipofactura() {
        return tipofactura;
    }

    /**
     * Setter method for tipofactura.
     *
     * @param aTipofactura the new value for tipofactura
     */
    public void setTipofactura(String aTipofactura) {
        tipofactura = aTipofactura;
    }

    /**
     * Access method for clientefrecuente.
     *
     * @return the current value of clientefrecuente
     */
    public String getClientefrecuente() {
        return clientefrecuente;
    }

    /**
     * Setter method for clientefrecuente.
     *
     * @param aClientefrecuente the new value for clientefrecuente
     */
    public void setClientefrecuente(String aClientefrecuente) {
        clientefrecuente = aClientefrecuente;
    }

    /**
     * Access method for usofactura.
     *
     * @return the current value of usofactura
     */
    public String getUsofactura() {
        return usofactura;
    }

    /**
     * Setter method for usofactura.
     *
     * @param aUsofactura the new value for usofactura
     */
    public void setUsofactura(String aUsofactura) {
        usofactura = aUsofactura;
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
