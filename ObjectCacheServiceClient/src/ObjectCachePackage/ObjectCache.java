/**
 * ObjectCache.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObjectCachePackage;

public interface ObjectCache extends java.rmi.Remote {
    public java.lang.Object getCache(java.lang.Object k) throws java.rmi.RemoteException;
    public void putCache(java.lang.Object k, java.lang.Object v) throws java.rmi.RemoteException;
    public java.lang.Object LRUreplacement() throws java.rmi.RemoteException;
}
