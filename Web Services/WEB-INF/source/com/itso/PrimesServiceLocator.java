/**
 * PrimesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf20411.06 v32504192757
 */

package com.itso;

public class PrimesServiceLocator extends com.ibm.ws.webservices.engine.client.Service implements com.itso.PrimesService {

    // Use to get a proxy class for primes
    private final java.lang.String primes_address = "http://localhost:9080/PrimesWebService/services/Primes";

    public java.lang.String getPrimesAddress() {
        return primes_address;
    }

    // The WSDD port name defaults to the port name.
    private java.lang.String primesWSDDPortName = "Primes";

    public java.lang.String getPrimesWSDDPortName() {
        return primesWSDDPortName;
    }

    public void setPrimesWSDDPortName(java.lang.String name) {
        primesWSDDPortName = name;
    }

    public com.itso.Primes getPrimes() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(primes_address);
        }
        catch (java.net.MalformedURLException e) {
            return null; // unlikely as URL was validated in WSDL2Java
        }
        return getPrimes(endpoint);
    }

    public com.itso.Primes getPrimes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.itso.PrimesSoapBindingStub _stub = new com.itso.PrimesSoapBindingStub(portAddress, this);
            _stub.setPortName(getPrimesWSDDPortName());
            return _stub;
        }
        catch (com.ibm.ws.webservices.engine.WebServicesFault e) {
            return null;
        }
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.itso.Primes.class.isAssignableFrom(serviceEndpointInterface)) {
                com.itso.PrimesSoapBindingStub _stub = new com.itso.PrimesSoapBindingStub(new java.net.URL(primes_address), this);
                _stub.setPortName(getPrimesWSDDPortName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("WSWS3273E: Error: There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        String inputPortName = portName.getLocalPart();
        if ("Primes".equals(inputPortName)) {
            return getPrimes();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://itso.com", "PrimesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://itso.com","Primes"));
        }
        return ports.iterator();
    }

    public javax.xml.rpc.Call[] getCalls(javax.xml.namespace.QName portName) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
        if  (portName.getLocalPart().equals("Primes")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "getPrime"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
    }
}
