package com.micro.back_end_service.Entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Long priceExpense;

    @Column(nullable = false)
    private Date arivalDate;

    @Column(nullable = false)
    private Date departureDate;

    @Column(nullable = false)
    private Long tax;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    
}
