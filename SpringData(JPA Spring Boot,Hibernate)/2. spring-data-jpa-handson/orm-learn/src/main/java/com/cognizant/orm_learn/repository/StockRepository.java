package com.cognizant.orm_learn.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.orm_learn.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByStCodeAndStDateBetween(
            String code, LocalDate start, LocalDate end);

    List<Stock> findByStCodeAndStCloseGreaterThan(
            String code, double price);

    List<Stock> findTop3ByOrderByStVolumeDesc();

    List<Stock> findTop3ByStCodeOrderByStCloseAsc(String code);
}