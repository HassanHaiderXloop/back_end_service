package com.micro.back_end_service.Cont;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.back_end_service.Entity.Hotel;
import com.micro.back_end_service.Ser.HotelServiceImpl;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelServiceImpl;
    
    @PostMapping("/add")
    public Hotel saveHotel(@RequestBody Hotel hotel){
        return hotelServiceImpl.saveHotel(hotel);
    }


    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotels = hotelServiceImpl.getAllHotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }
   
    
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id) {
        Optional<Hotel> hotel = hotelServiceImpl.getHotelById(id);
        if (hotel.isPresent()) {
            return new ResponseEntity<>(hotel.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteHotelById(@PathVariable Long id) {
        try {
            hotelServiceImpl.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
