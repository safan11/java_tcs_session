package com.example.calculationsoap.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(
        name = "CalculateRequest",
        namespace = "http://example.com/calculator"
)
public class CalculateRequest {

    @XmlElement(namespace = "http://example.com/calculator")
    private int a;

    @XmlElement(namespace = "http://example.com/calculator")
    private int b;

    @XmlElement(namespace = "http://example.com/calculator")
    private Operation operation;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Operation getOperation() {
        return operation;
    }
}
