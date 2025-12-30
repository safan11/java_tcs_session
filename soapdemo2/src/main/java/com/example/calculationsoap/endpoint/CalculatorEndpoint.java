package com.example.calculationsoap.endpoint;
import com.example.calculationsoap.model.*;

import org.springframework.ws.server.endpoint.annotation.*;

/*
 SOAP endpoint
*/
@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE = "http://example.com/calculator";

    /*
     Handles CalculateRequest XML
    */
    @PayloadRoot(namespace = NAMESPACE, localPart = "CalculateRequest")
    @ResponsePayload
    public CalculateResponse calculate(@RequestPayload CalculateRequest request) {

        int result;

        // Decide operation
        switch (request.getOperation()) {
            case ADD -> result = request.getA() + request.getB();
            case SUB -> result = request.getA() - request.getB();
            case MUL -> result = request.getA() * request.getB();
            case DIV -> result = request.getA() / request.getB();
            default -> throw new IllegalArgumentException("Invalid Operation");
        }

        // Prepare response
        CalculateResponse response = new CalculateResponse();
        response.setResult(result);
        return response;
    }
}
