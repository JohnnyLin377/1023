package cxf.spring.server.service;

import org.springframework.stereotype.Service;
import service.WetherService;
@Service
public class WetherServiceImpl implements WetherService {
    @Override
    public String findCityByZipcode(String zipcode) {
        return "city:"+zipcode;
    }
}
