package com.dsvendas.controllers;

import com.dsvendas.dto.SaleDTO;
import com.dsvendas.dto.SaleSuccessDTO;
import com.dsvendas.dto.SaleSumDTO;
import com.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService salesService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> salesDTOList = salesService.findAll(pageable);
        return ResponseEntity.ok(salesDTOList);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        List<SaleSumDTO> saleSumDTOList = salesService.amountGroupedBySeller();
        return ResponseEntity.ok(saleSumDTOList);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        List<SaleSuccessDTO> saleSuccessDTOList = salesService.successGroupedBySeller();
        return ResponseEntity.ok(saleSuccessDTOList);
    }
}
