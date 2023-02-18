package com.micro.back_end_service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.micro.back_end_service.Entity.Hotel;

@SpringBootTest
public class HotelEntityTest {

    @Test
    public void  contextLoads() {
	}

    @Test
	public void HotelIdTest(){
        Hotel cut = new Hotel();
        cut.setId(1L);
        assertEquals(1L, cut.getId());
    }
    @Test
	public void HotelNameTest(){
        Hotel cut = new Hotel();
        cut.setId(1L);
        assertEquals(1L, cut.getId());
    }
    @Test
	public void HotelDescriptionTest(){
        Hotel cut = new Hotel();
        cut.setDescription("here is the hotel");
        assertEquals("here is the hotel", cut.getDescription());
    }
    @Test
	public void HotelLongDescriptionTest(){
        Hotel cut = new Hotel();
        cut.setLongDescription("here is the longgggg hotel");
        assertEquals("here is the longgggg hotel", cut.getLongDescription());
    }
    @Test
	public void HotelExperienceLevelTest(){
        Hotel cut = new Hotel();
        cut.setExperienceLevel("luxuary");
        assertEquals("luxuary", cut.getExperienceLevel());
    }
    @Test
	public void HotelHasPoolTest(){
        Hotel cut = new Hotel();
        cut.setHasPool(true);
        assertEquals(true, cut.isHasPool());
    }
    @Test
	public void HotelPricePerNightTest(){
        Hotel cut = new Hotel();
        cut.setPricePerNight(120000);
        assertEquals(120000, cut.getPricePerNight());
    }
    @Test
	public void HotelUrlStringTest(){
        Hotel cut = new Hotel();
        cut.setUrlString("url.com");
        assertEquals("url.com", cut.getUrlString());
    }
    @Test
    void saveHotelWithNotNullColumns(){
        Hotel cut =  Hotel.builder().id(1L).name("Hotel1").description("here is the hotel").build();
        assertEquals(1L, cut.getId());
        assertEquals("Hotel1", cut.getName());
        assertEquals("here is the hotel", cut.getDescription());
        assertEquals(null, cut.getLongDescription());
        
    }
    
}
