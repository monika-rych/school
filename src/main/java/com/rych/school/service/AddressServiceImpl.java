package com.rych.school.service;

import com.rych.school.domain.Address;
import com.rych.school.repository.api.SchoolRepository;
import com.rych.school.service.api.AddressService;

import java.util.List;
import java.util.stream.IntStream;

public class AddressServiceImpl implements AddressService {

    private SchoolRepository schoolRepository;

    public AddressServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }


    @Override
    public int getTheLowestNumberOfHomeNumber() {
        List<Address> addresses = schoolRepository.getAllStudentsAddresses();
        return addresses.stream()
                .flatMapToInt(address -> IntStream.of(address.getHomeNumber()))
                .min()
                .getAsInt();
    }
}
