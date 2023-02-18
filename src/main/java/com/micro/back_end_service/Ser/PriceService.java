package com.micro.back_end_service.Ser;

import com.micro.back_end_service.Entity.Price;

public interface PriceService {
    
    double calculatePrice(Price price );
    boolean bookStay(Price price );
}
