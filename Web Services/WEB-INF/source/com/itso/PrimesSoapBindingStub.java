/**
 * PrimesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf20411.06 v32504192757
 */

package com.itso;

public class PrimesSoapBindingStub extends com.ibm.ws.webservices.engine.client.Stub implements com.itso.Primes {
    public PrimesSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        initTypeMapping();
        super.cachedEndpoint = endpointURL;
        super.connection = ((com.ibm.ws.webservices.engine.client.Service) super.service).getConnection(endpointURL);
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[1];
    }

    private void initTypeMapping() {
        javax.xml.rpc.encoding.TypeMapping tm = super.getTypeMapping(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
        java.lang.Class javaType = null;
        javax.xml.namespace.QName xmlType = null;
        com.ibm.ws.webservices.engine.encoding.SerializerFactory sf = null;
        com.ibm.ws.webservices.engine.encoding.DeserializerFactory df = null;
    }

    private com.ibm.ws.webservices.engine.description.OperationDesc _getPrimeOperation0 = null;
    private com.ibm.ws.webservices.engine.description.OperationDesc _getgetPrimeOperation0() {
        if (_getPrimeOperation0 == null) {
            com.ibm.ws.webservices.engine.description.ParameterDesc[] _params = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
                new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://itso.com", "numDigits"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            };
            _getPrimeOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("getPrime", _params, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://itso.com", "getPrimeReturn"));
            _getPrimeOperation0.setReturnType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
            _getPrimeOperation0.setElementQName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://itso.com", "getPrime"));
            _getPrimeOperation0.setSoapAction("");
            com.ibm.ws.webservices.engine.description.FaultDesc _fault = null;
        }
        return _getPrimeOperation0;
    }

    private int _getPrimeIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getgetPrimeInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_getPrimeIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(_getgetPrimeOperation0());
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setOperationStyle("wrapped");
            mc.setOperationUse("literal");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.ws.webservices.engine.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
            mc.setProperty(com.ibm.ws.webservices.engine.WebServicesEngine.PROP_DOMULTIREFS, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_getPrimeIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public java.lang.String getPrime(int numDigits) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getgetPrimeInvoke0(new java.lang.Object[] {new java.lang.Integer(numDigits)}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            throw wsf;
        } 
        try {
            return (java.lang.String) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (java.lang.String) com.ibm.ws.webservices.engine.utils.JavaUtils.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), java.lang.String.class);
        }
    }

}
