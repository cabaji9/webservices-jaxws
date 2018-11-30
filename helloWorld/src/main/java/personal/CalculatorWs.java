package personal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Hyun Woo Son on 11/30/18
 **/
@WebService
public interface CalculatorWs {

     @WebMethod
     int sum(@XmlElement(required=true) @WebParam(name = "add1")int add1,
             @XmlElement(required=true) @WebParam(name = "add2")int add2);

     int multiply(int mul1, int mul2);

}
