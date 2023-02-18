package com.micro.back_end_service.Cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.back_end_service.Entity.Hotel;
import com.micro.back_end_service.Repo.HotelRepo;
import com.micro.back_end_service.Ser.HotelService;
import com.micro.back_end_service.Ser.HotelServiceImpl;

@RestController
@RequestMapping("/")
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelServiceImpl;
    
    @PostMapping("")
    public Hotel createHotel(@RequestBody Hotel hotel){
        return hotelServiceImpl.createHotel(hotel);
    }
}
