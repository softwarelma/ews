package com.softwarelma.ews.main;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class EwsMainWS {

    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name = "name") String name) {
        if (name == null)
            return "Hello";
        return "Hello " + name;
    }

}
