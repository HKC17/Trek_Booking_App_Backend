package com.trekappAPI.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trekappAPI.entity.Bookings;

public interface BookingRepo extends JpaRepository<Bookings, Long> {
  
	List<Bookings> findByCustomerCid( Long cid);
	
    List<Bookings> findByTrekTid(Long tid);
  
}
