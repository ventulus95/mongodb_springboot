package com.ventulus95.mongodb_springboot.account;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;

    @PostMapping("/account")
    @ResponseBody
    public String makeAccount(@RequestBody GeoDto geoDto){
        Account temp = new Account();
        temp.setUsername("새로운 글!");
        temp.setLocation(new GeoJsonPoint(Double.parseDouble(geoDto.getLatitude()), Double.parseDouble(geoDto.getLongtitude())));
        return accountRepository.save(temp).getId();
    }

    @GetMapping("/account1")
    public String page(){
        return "account";
    }
}
