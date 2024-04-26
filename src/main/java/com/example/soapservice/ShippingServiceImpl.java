package com.example.soapservice;

import com.example.soapservice.types.CalculateShippingCostRequest;
import com.example.soapservice.types.CalculateShippingCostResponse;
import org.springframework.ws.server.endpoint.PayloadEndpoint;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class ShippingServiceImpl implements ShippingService {

    private static final double RATE_PER_KM = 0.5;

    @PayloadRoot(namespace = "http://example.com/shipping", localPart = "calculateShippingCostRequest")
    @ResponsePayload
    public CalculateShippingCostResponse calculateShippingCost(@RequestPayload CalculateShippingCostRequest request) {
        double weight = request.getWeight();
        int distance = request.getDistance();

        double cost = calculateCost(weight, distance);

        CalculateShippingCostResponse response = new CalculateShippingCostResponse();
        response.setCost(cost);
        return response;
    }

    private double calculateCost(double weight, int distance) {

        return (weight * distance) * RATE_PER_KM;
    }


}
