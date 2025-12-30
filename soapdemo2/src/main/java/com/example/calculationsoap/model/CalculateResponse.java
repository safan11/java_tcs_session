package com.example.calculationsoap.model;


import jakarta.xml.bind.annotation.*;

/*
 Converts Java result into XML response
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CalculateResponse", namespace = "http://example.com/calculator")
public class CalculateResponse {

    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
