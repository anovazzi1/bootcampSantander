package com.project.bootcamp.mapper;


import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock local = new Stock();
        local.setId(dto.getId());
        local.setDate(dto.getDate());
        local.setName(dto.getName());
        local.setPrice(dto.getPrice());
        local.setVariation(dto.getVariation());
        return local;

    }

    public StockDTO toDto(Stock stock) {
        StockDTO local = new StockDTO();
        local.setId(stock.getId());
        local.setDate(stock.getDate());
        local.setName(stock.getName());
        local.setPrice(stock.getPrice());
        local.setVariation(stock.getVariation());
        return  local;
    }

    public List<StockDTO> toDto(List<Stock> listStock)
    {
        return listStock.stream().map(this::toDto).collect(Collectors.toList());
    }

}
