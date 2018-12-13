package com.auto_insurance.dao;

import com.auto_insurance.model.Claim;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimDao extends CrudRepository<Claim, String> {
//    Claim findById(int id);
    List<Claim> findAll();
//    Claim deleteById(String email);
}