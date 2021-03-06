package com.justintime.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public abstract class AbstractFacility {
    @Id
    protected String id;
    protected String name;
    protected String address;
    protected String mail;
    protected String telephone;
}
