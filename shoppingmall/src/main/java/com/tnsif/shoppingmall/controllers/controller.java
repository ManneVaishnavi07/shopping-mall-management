package com.tnsif.shoppingmall.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tnsif.shoppingmall.entity.entity;
import com.tnsif.shoppingmall.service.service;

@RestController
@RequestMapping("/parking")
public class controller {

    @Autowired
    private service parkingService;

    // Add parking slot
    @PostMapping("/add")
    public entity addSlot(@RequestBody entity slot) {
        return parkingService.addSlot(slot);
    }

    // Get parking slot by ID
    @GetMapping("id/{id}")
    public entity getSlotById(@PathVariable Integer id) {
        return parkingService.getSlotById(id);
    }

    // Update parking slot
    @PutMapping("/{id}")
    public entity updateSlot(
            @PathVariable Integer id,
            @RequestBody entity slot) {

        return parkingService.updateSlot(id, slot);
    }

    // Delete parking slot
    @DeleteMapping("/{id}")
    public String deleteSlot(@PathVariable Integer id) {
        return parkingService.deleteSlot(id);
    }

    }
