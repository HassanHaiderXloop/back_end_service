package com.micro.back_end_service.Ser;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.back_end_service.Entity.Hotel;
import com.micro.back_end_service.Repo.HotelRepo;
import com.micro.back_end_service.Repo.PriceRepo;

@Service
public class HotelServiceImpl implements HotelService {


    @Autowired 
    private  HotelRepo hotelRepo;
    @Autowired
    private PriceRepo priceRepo; 


    // public HotelServiceImpl(HotelRepo hotelRepo) {
    //     this.hotelRepo = hotelRepo;
    // }

    @Override
    public Hotel saveHotel(Hotel hotel) {

        hotel.getPrices().stream().map(p->priceRepo.save(p));
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    @Override
    public Optional<Hotel> getHotelById(Long id) {
        return hotelRepo.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        hotelRepo.deleteById(id);
    }

   
    
}
