package service;

import javax.jws.WebService;

@WebService
public interface WetherService {
    String findCityByZipcode(String zipcode);
}
