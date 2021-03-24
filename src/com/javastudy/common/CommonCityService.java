package com.javastudy.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonCityService {
    
    public static void insertCityInfo () {
        System.out.println(Arrays.toString(CityCode.values()));
        System.out.println(CityCode.BUSAN);
        
        List<CityCode> cityCodes = Arrays.stream(CityCode.values()).collect(Collectors.toList());
        System.out.println(cityCodes);
        
        for (CityCode cityCode : cityCodes){
            System.out.println(cityCode.getCityId());
            System.out.println(cityCode.getCityCode());
            System.out.println(cityCode.getCityPrefix());
        }
    }
    
    public static void main (String[] args) {
        CommonCityService.insertCityInfo();
    }
}
