package cxf.nartv.service;

import service.WetherService;

public class WetherServiceImpl implements WetherService {
    @Override
    public String findCityByZipcode(String zipcode) {
        return "city:"+zipcode;
    }
}
