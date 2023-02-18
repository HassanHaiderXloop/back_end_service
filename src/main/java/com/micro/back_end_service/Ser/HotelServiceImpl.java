package com.micro.back_end_service.Ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.back_end_service.Entity.Hotel;
import com.micro.back_end_service.Repo.HotelRepo;

@Service
public class HotelServiceImpl implements HotelService {


    // @Autowired
    private final HotelRepo hotelRepo;


    public HotelServiceImpl(HotelRepo hotelRepo) {
        this.hotelRepo = hotelRepo;
    }


    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }
    
}
