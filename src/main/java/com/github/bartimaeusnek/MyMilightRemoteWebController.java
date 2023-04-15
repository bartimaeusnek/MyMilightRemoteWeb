package com.github.bartimaeusnek;

import io.micronaut.http.annotation.*;

@Controller("/myMilightRemoteWeb")
public class MyMilightRemoteWebController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}