package personal;

import javax.jws.WebService;

/**
 * Created by Hyun Woo Son on 11/30/18
 **/
@WebService(
        portName = "CalculatorPort",
        serviceName = "CalculatorService",
        endpointInterface = "personal.CalculatorWs")
public  class Calculator extends Operations implements CalculatorWs {

    @Override
    public int sum(int add1, int add2) {
        return add.sum(add1,add2);
    }

    @Override
    public int multiply(int mul1, int mul2) {
        return multiply.multiply(mul1,mul2);
    }
}
