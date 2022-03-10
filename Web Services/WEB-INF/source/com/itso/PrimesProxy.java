package com.itso;

public class PrimesProxy implements com.itso.Primes {
  private boolean _useJNDI = true;
  private String _endpoint = null;
  private com.itso.Primes primes = null;
  
  public PrimesProxy() {
    _initPrimesProxy();
  }
  
  private void _initPrimesProxy() {
  
  if (_useJNDI) {
    try{
      javax.naming.InitialContext ctx = new javax.naming.InitialContext();
      primes = ((com.itso.PrimesService)ctx.lookup("java:comp/env/service/PrimesService")).getPrimes();
      }
    catch (javax.naming.NamingException namingException) {}
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  if (primes == null) {
    try{
      primes = (new com.itso.PrimesServiceLocator()).getPrimes();
      }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  if (primes != null) {
    if (_endpoint != null)
      ((javax.xml.rpc.Stub)primes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    else
      _endpoint = (String)((javax.xml.rpc.Stub)primes)._getProperty("javax.xml.rpc.service.endpoint.address");
  }
  
}


public void useJNDI(boolean useJNDI) {
  _useJNDI = useJNDI;
  primes = null;
  
}

public String getEndpoint() {
  return _endpoint;
}

public void setEndpoint(String endpoint) {
  _endpoint = endpoint;
  if (primes != null)
    ((javax.xml.rpc.Stub)primes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
  
}

public com.itso.Primes getPrimes() {
  if (primes == null)
    _initPrimesProxy();
  return primes;
}

public java.lang.String getPrime(int numDigits) throws java.rmi.RemoteException{
  if (primes == null)
    _initPrimesProxy();
  return primes.getPrime(numDigits);
}


}