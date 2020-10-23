package cxf.natv.client;

import cxf.natv.client.stub.WetherService;
import cxf.natv.client.stub.WetherServiceService;

public class NatvClientApplication {
    public static void main(String[] args) {
        WetherServiceService wetherServiceService=new WetherServiceService();
        WetherService wetherService=wetherServiceService.getWetherServicePort();
        String city=wetherService.findCityByZipcode("021");
        System.out.println(city);
    }
}
