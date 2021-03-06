package com.justintime.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashMap;

@Data
@Document
public class QueuedUser extends AbstractUser {
    public LinkedHashMap<String, QueuedFacility> queuedFacilities = new LinkedHashMap<>();
}
