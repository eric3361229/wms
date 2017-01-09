
package com.routdata.zzfw.webservice.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-31T13:56:11.944+08:00
 * Generated source version: 2.6.0
 */

@WebFault(name = "SysException", targetNamespace = "http://service.webservice.zzfw.routdata.com/")
public class SysException_Exception extends Exception {
    
    private com.routdata.zzfw.webservice.service.SysException sysException;

    public SysException_Exception() {
        super();
    }
    
    public SysException_Exception(String message) {
        super(message);
    }
    
    public SysException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SysException_Exception(String message, com.routdata.zzfw.webservice.service.SysException sysException) {
        super(message);
        this.sysException = sysException;
    }

    public SysException_Exception(String message, com.routdata.zzfw.webservice.service.SysException sysException, Throwable cause) {
        super(message, cause);
        this.sysException = sysException;
    }

    public com.routdata.zzfw.webservice.service.SysException getFaultInfo() {
        return this.sysException;
    }
}
