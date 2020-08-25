package com.ttc.faceid.gg_drive;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GgDriveApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder()
                .sources(GgDriveApplication.class);
        applicationBuilder.run(args);

    }

}
