/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "Service")
public class Service {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Tambah")
    public Integer Tambah(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Kurang")
    public Integer Kurang(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a-b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Kali")
    public Integer Kali(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a*b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Bagi")
    public Double Bagi(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a/b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Mod")
    public Integer Mod(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a%b;
    }
}
