package com.ventulus95.mongodb_springboot.account;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
@Data
public class Account {

    @Id
    private String id;

    private String username;

    private String email;

    private GeoJsonPoint location;


}
