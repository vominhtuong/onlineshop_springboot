package com.onlineshop.library.service.impl;

import com.onlineshop.library.model.City;
import com.onlineshop.library.repository.CityRepository;
import com.onlineshop.library.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
