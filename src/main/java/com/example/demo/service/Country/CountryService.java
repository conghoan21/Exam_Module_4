package com.example.demo.service.Country;

import com.example.demo.model.Country;
import com.example.demo.repo.CountryRepository;
import com.example.demo.service.Country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void delete(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public Country findByName(String name) {
        return countryRepository.findByName(name);
    }
}
