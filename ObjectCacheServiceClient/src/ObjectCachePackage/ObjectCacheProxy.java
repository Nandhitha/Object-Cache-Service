package ObjectCachePackage;

public class ObjectCacheProxy implements ObjectCachePackage.ObjectCache {
  private String _endpoint = null;
  private ObjectCachePackage.ObjectCache objectCache = null;
  
  public ObjectCacheProxy() {
    _initObjectCacheProxy();
  }
  
  public ObjectCacheProxy(String endpoint) {
    _endpoint = endpoint;
    _initObjectCacheProxy();
  }
  
  private void _initObjectCacheProxy() {
    try {
      objectCache = (new ObjectCachePackage.ObjectCacheServiceLocator()).getObjectCache();
      if (objectCache != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)objectCache)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)objectCache)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (objectCache != null)
      ((javax.xml.rpc.Stub)objectCache)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ObjectCachePackage.ObjectCache getObjectCache() {
    if (objectCache == null)
      _initObjectCacheProxy();
    return objectCache;
  }
  
  public java.lang.Object getCache(java.lang.Object k) throws java.rmi.RemoteException{
    if (objectCache == null)
      _initObjectCacheProxy();
    return objectCache.getCache(k);
  }
  
  public void putCache(java.lang.Object k, java.lang.Object v) throws java.rmi.RemoteException{
    if (objectCache == null)
      _initObjectCacheProxy();
    objectCache.putCache(k, v);
  }
  
  public java.lang.Object LRUreplacement() throws java.rmi.RemoteException{
    if (objectCache == null)
      _initObjectCacheProxy();
    return objectCache.LRUreplacement();
  }
  
  
}