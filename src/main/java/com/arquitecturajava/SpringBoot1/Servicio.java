package com.arquitecturajava.SpringBoot1;

import org.springframework.stereotype.Service;

@Service
public class Servicio {


    public String mensaje() {
        return "hola desde Spring";
    }
}
