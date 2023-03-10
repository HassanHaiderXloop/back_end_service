package com.micro.back_end_service.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.ObtainVia;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String longDescription;
    private String experienceLevel;
    private boolean hasPool;
    private double pricePerNight;
    private String urlString;
  
    @OneToMany(mappedBy = "hotel")
    private List<Price> prices;

   



    
    
}
