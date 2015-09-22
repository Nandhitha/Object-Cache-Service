package ObjectCachePackage;

public class ObjectCacheClassProxy implements ObjectCachePackage.ObjectCacheClass {
  private String _endpoint = null;
  private ObjectCachePackage.ObjectCacheClass objectCacheClass = null;
  
  public ObjectCacheClassProxy() {
    _initObjectCacheClassProxy();
  }
  
  public ObjectCacheClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initObjectCacheClassProxy();
  }
  
  private void _initObjectCacheClassProxy() {
    try {
      objectCacheClass = (new ObjectCachePackage.ObjectCacheClassServiceLocator()).getObjectCacheClass();
      if (objectCacheClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)objectCacheClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)objectCacheClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (objectCacheClass != null)
      ((javax.xml.rpc.Stub)objectCacheClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ObjectCachePackage.ObjectCacheClass getObjectCacheClass() {
    if (objectCacheClass == null)
      _initObjectCacheClassProxy();
    return objectCacheClass;
  }
  
  public void hello(java.lang.String name) throws java.rmi.RemoteException{
    if (objectCacheClass == null)
      _initObjectCacheClassProxy();
    objectCacheClass.hello(name);
  }
  
  
}