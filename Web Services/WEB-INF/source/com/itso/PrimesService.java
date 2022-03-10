/**
 * PrimesService.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf20411.06 v32504192757
 */

package com.itso;

public interface PrimesService extends javax.xml.rpc.Service {
    public java.lang.String getPrimesAddress();

    public com.itso.Primes getPrimes() throws javax.xml.rpc.ServiceException;

    public com.itso.Primes getPrimes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
