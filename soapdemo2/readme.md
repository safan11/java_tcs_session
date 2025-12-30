
# CALCULATOR – PROJECT README

This project demonstrates a SOAP Web Service using Spring Boot.
It exposes a calculator service that supports add, subtract, multiply, and divide operations.

This document explains:

* Why SOAP uses XML
* What each file does
* What each annotation means
* How the request–response flow works

---

## 1. WHY SOAP

SOAP is mainly used in legacy enterprise systems such as banking, insurance, and government systems.

Reasons SOAP is used:

* Strict contract between client and server
* Strong validation using schemas
* XML-based communication
* Platform and language independent

SOAP is heavier than REST but very reliable for enterprise systems.

---

## 2. PROJECT STRUCTURE

```
src/main/java
 └── com.example.calculatorsoap
     ├── CalculatorSoapApplication.java
     ├── config
     │    └── WebServiceConfig.java
     ├── endpoint
     │    └── CalculatorEndpoint.java
     └── model
          ├── CalculateRequest.java
          ├── CalculateResponse.java
          └── Operation.java

src/main/resources
 └── calculator.xsd
```

---

## 3. FILE BY FILE EXPLANATION

---

### 1) CalculatorSoapApplication.java

Purpose
This is the main Spring Boot application class.

Why it exists

* Starts the Spring Boot application
* Creates the Spring container

Simple explanation
This file turns on the Spring Boot application.

---

### 2) WebServiceConfig.java

Purpose

* Enables SOAP support in Spring Boot
* Registers the SOAP servlet
* Generates the WSDL automatically

Why it is needed
Spring Boot does not support SOAP by default. This configuration enables it.

Important annotations

* EnableWs: Enables SOAP support
* Configuration: Marks this class as a Spring configuration

What it does

* Exposes SOAP endpoint at `/ws`
* Connects XSD schema to WSDL generation

WSDL URL

```
http://localhost:8080/ws/calculator.wsdl
```

Simple explanation
This file tells Spring Boot that this project is a SOAP service and how to generate the WSDL.

---

### 3) calculator.xsd

What is XSD
XSD stands for XML Schema Definition.

Purpose

* Defines structure of request and response XML
* Validates incoming SOAP messages

Why it is needed
SOAP is contract-first. Client and server must agree on the XML structure.

Analogy
Recipe for a dish

If the request XML does not match this schema, SOAP will reject it.

---

### 4) CalculatorEndpoint.java

What this file is
This is the SOAP endpoint, similar to a controller in REST.

Important annotations

* Endpoint: Marks this class as a SOAP endpoint
* PayloadRoot: Maps XML request to a method
* RequestPayload: Converts XML to Java object
* ResponsePayload: Converts Java object to XML

What happens here

* Receives SOAP request
* Performs calculation
* Sends SOAP response

Simple explanation
This is where the calculator logic runs.

---

### 5) CalculateRequest.java

Purpose
Represents the incoming SOAP request.

Why it is a separate class
SOAP converts XML into Java objects using JAXB.

Important annotations

* XmlRootElement: Root element of XML
* XmlElement: XML fields

Fields

* a
* b
* operation

Simple explanation
This class holds input values sent by the client.

---

### 6) CalculateResponse.java

Purpose
Represents the SOAP response.

Why it is needed
SOAP response must match the XSD structure.

Field

* result

Simple explanation
This class sends the calculated result back to the client.

---

### 7) Operation.java (Enum)

Purpose
Defines allowed operations.

Values

* ADD
* SUB
* MUL
* DIV

Why enum is used

* Prevents invalid operations
* Ensures type safety

Simple explanation
Only these operations are allowed.

---

## 4. WHY BOTH JAVA AND XML ARE USED

SOAP is language independent.

* Server may be Java
* Client may be .NET or Python

All platforms understand XML, not Java.

So:

* XML is used for communication
* Java is used for implementation

---

## 5. SOAP REQUEST FLOW

1. Client sends SOAP XML request
2. Spring reads SOAP envelope
3. XML is validated using XSD
4. XML is converted into Java object
5. Endpoint method is invoked
6. Business logic executes
7. Java response is converted to XML
8. SOAP response is sent back

---

## 6. SOAP VS REST COMPARISON

| Feature      | SOAP              | REST                   |
| ------------ | ----------------- | ---------------------- |
| Data format  | XML only          | JSON or XML            |
| HTTP methods | POST only         | GET, POST, PUT, DELETE |
| Contract     | Mandatory WSDL    | Optional               |
| Usage        | Legacy enterprise | Modern APIs            |

---

## 7. HOW TO TEST

Browser
Only WSDL can be opened in browser:

```
http://localhost:8080/ws/calculator.wsdl
```

SoapUI

* Import WSDL
* Auto-generate request
* Send SOAP XML

---

## 8. ONE-LINE SUMMARY

* XSD defines structure
* WSDL defines contract
* Java implements logic
* XML carries data
* Endpoint handles requests

---

## 9. WHY SOAP FEELS CONFUSING

SOAP:

* Uses more files
* Has strict rules
* Requires XML and Java
* Is not beginner friendly


---

