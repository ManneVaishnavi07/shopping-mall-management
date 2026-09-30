package com.tnsif.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.shoppingmall.entity.entity;
import com.tnsif.shoppingmall.repository.repository;

@Service
public class service {

    @Autowired
    private repository repo;

    // Add parking slot
    public entity addSlot(entity slot) {
        return repo.save(slot);
    }

    // Get parking slot by ID
    public entity getSlotById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    // Update parking slot
    public entity updateSlot(Integer id, entity slot) {

        entity existingSlot = repo.findById(id).orElse(null);

        if (existingSlot != null) {

            existingSlot.setSlotNumber(slot.getSlotNumber());
            existingSlot.setVehicleNumber(slot.getVehicleNumber());
            existingSlot.setVehicleType(slot.getVehicleType());
            existingSlot.setOccupied(slot.isOccupied());
            existingSlot.setPricePerHour(slot.getPricePerHour());

            return repo.save(existingSlot);
        }

        return null;
    }

    // Delete parking slot
    public String deleteSlot(Integer id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Parking slot deleted successfully";
        } 
        return "Parking slot not found";
    }

		public List<entity> getSlotsByOccupied(boolean status) {
			// TODO Auto-generated method stub
			return null;
		}
}
