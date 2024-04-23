package com.example.InventoryManagement1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
