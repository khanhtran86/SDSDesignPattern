package com.samsung.firstspringboot.Controller;

import com.samsung.firstspringboot.Common.IRServiceConfigurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Qualifier("IRServiceConfigurations")
    @Autowired
    IRServiceConfigurations irServiceConfigurations;

    @GetMapping("/config")
    public ResponseEntity getConfig(){
        return ResponseEntity.ok(irServiceConfigurations.getBaseurl());
    }
}
