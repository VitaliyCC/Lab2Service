package com.example.soapservice;

import com.example.soapservice.types.CalculateShippingCostRequest;
import com.example.soapservice.types.CalculateShippingCostResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ShippingService {

    @WebMethod
    CalculateShippingCostResponse calculateShippingCost(CalculateShippingCostRequest request);
}