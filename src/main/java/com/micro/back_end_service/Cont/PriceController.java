package com.micro.back_end_service.Cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.micro.back_end_service.Entity.Price;
import com.micro.back_end_service.Ser.PriceServiceImpl;

public class PriceController {
    
    @Autowired
    private PriceServiceImpl priceServiceImpl ;

    @PostMapping("/calculatePrice")
    public ResponseEntity<Double> calculatePrice(@RequestBody Price price) {
        double totalPrice = priceServiceImpl.calculatePrice(price);
        return ResponseEntity.ok(totalPrice);
    }

    // @PostMapping("/bookStay")
    // public ResponseEntity<String> bookStay() {
    //     boolean booked = priceServiceImpl.bookStay();
    //     if (booked) {
    //         return ResponseEntity.ok("Your stay has been booked.");
    //     } else {
    //         return ResponseEntity.badRequest().body("Failed to book stay.");
    //     }
    // }

}
