/**
 * ObjectCacheService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObjectCachePackage;

public interface ObjectCacheService extends javax.xml.rpc.Service {
    public java.lang.String getObjectCacheAddress();

    public ObjectCachePackage.ObjectCache getObjectCache() throws javax.xml.rpc.ServiceException;

    public ObjectCachePackage.ObjectCache getObjectCache(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
