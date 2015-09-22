/**
 * ObjectCacheClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObjectCachePackage;

public class ObjectCacheClassServiceLocator extends org.apache.axis.client.Service implements ObjectCachePackage.ObjectCacheClassService {

    public ObjectCacheClassServiceLocator() {
    }


    public ObjectCacheClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ObjectCacheClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ObjectCacheClass
    private java.lang.String ObjectCacheClass_address = "http://localhost:8080/ObjectCacheService/services/ObjectCacheClass";

    public java.lang.String getObjectCacheClassAddress() {
        return ObjectCacheClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ObjectCacheClassWSDDServiceName = "ObjectCacheClass";

    public java.lang.String getObjectCacheClassWSDDServiceName() {
        return ObjectCacheClassWSDDServiceName;
    }

    public void setObjectCacheClassWSDDServiceName(java.lang.String name) {
        ObjectCacheClassWSDDServiceName = name;
    }

    public ObjectCachePackage.ObjectCacheClass getObjectCacheClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ObjectCacheClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getObjectCacheClass(endpoint);
    }

    public ObjectCachePackage.ObjectCacheClass getObjectCacheClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ObjectCachePackage.ObjectCacheClassSoapBindingStub _stub = new ObjectCachePackage.ObjectCacheClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getObjectCacheClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setObjectCacheClassEndpointAddress(java.lang.String address) {
        ObjectCacheClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ObjectCachePackage.ObjectCacheClass.class.isAssignableFrom(serviceEndpointInterface)) {
                ObjectCachePackage.ObjectCacheClassSoapBindingStub _stub = new ObjectCachePackage.ObjectCacheClassSoapBindingStub(new java.net.URL(ObjectCacheClass_address), this);
                _stub.setPortName(getObjectCacheClassWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ObjectCacheClass".equals(inputPortName)) {
            return getObjectCacheClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ObjectCachePackage", "ObjectCacheClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ObjectCachePackage", "ObjectCacheClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ObjectCacheClass".equals(portName)) {
            setObjectCacheClassEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
