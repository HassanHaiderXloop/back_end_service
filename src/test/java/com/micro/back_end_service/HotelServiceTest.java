package com.micro.back_end_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.BDDMockito.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.micro.back_end_service.Repo.HotelRepo;
import com.micro.back_end_service.Ser.HotelServiceImpl;

@SpringBootTest
public class HotelServiceTest {

    @Test
    void contextLoads() {
    }

    @Mock
    private HotelRepo hotelRepo;

    @InjectMocks
    private HotelServiceImpl hotelServiceImpl;

    @Test
    void CreateHotelTest() {
        // Hotel cut = Hotel.builder().id(1L).name("hotal1").description("this is hotal1")
        //         .longDescription("this is hotal1 long").experienceLevel("luxuary").hasPool(true)
        //         .pricePerNight(15000).urlString("url.pool").build();
        // // given matlb yay dia hoa hey is he par call ho
        // when(hotelRepo.save(cut)).thenReturn(cut);

        // HotelServiceImpl cutServiceImpl = new HotelServiceImpl(hotelRepo);
        // // given(HotelRepo.findbyId(1L).willReturn(Optional.empty()));
        // // given(HotelRepo.save(cut).willReturn(cut));
        // assertEquals(cut, cutServiceImpl.createHotel(cut));
    }

}
