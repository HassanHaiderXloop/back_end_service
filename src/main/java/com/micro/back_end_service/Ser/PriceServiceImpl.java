package com.micro.back_end_service.Ser;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

import com.micro.back_end_service.Entity.Price;
import com.micro.back_end_service.Repo.PriceRepo;

@Service
public class PriceServiceImpl implements PriceService {

    private PriceRepo priceRepo;

    @Override
    public double calculatePrice(Price price) {
        
        double dailyRate = price.getPriceExpense();
        int numDays = (int) ChronoUnit.DAYS.between(LocalDate.parse(price.getArivalDate().toString()), LocalDate.parse(price.getDepartureDate().toString()));
        double subtotal = dailyRate * numDays;
        double tax = subtotal * 0.12;
        return (subtotal + tax);
    }

    @Override
    public boolean bookStay(Price price) {
        // TODO Auto-generated method stub
        return false;
    }

    // @Override
    // public Price bookStay(Price price) {
    //     return priceRepo.save(price);
    // }


    
}
