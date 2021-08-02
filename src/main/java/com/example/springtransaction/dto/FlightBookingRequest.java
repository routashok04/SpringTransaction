package com.example.springtransaction.dto;

import com.example.springtransaction.entity.PassengerInfo;
import com.example.springtransaction.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
}
