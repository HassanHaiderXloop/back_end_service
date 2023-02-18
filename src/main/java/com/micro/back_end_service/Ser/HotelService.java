package com.micro.back_end_service.Ser;

import java.util.List;
import java.util.Optional;

import com.micro.back_end_service.Entity.Hotel;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Optional<Hotel> getHotelById(Long id);
    void deleteById(Long id);
    
}
