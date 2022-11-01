package com.hendisantika.controller;

import com.hendisantika.service.PlantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak5
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/1/22
 * Time: 08:11
 * To change this template use File | Settings | File Templates.
 */

@Slf4j
@RestController()
@RequestMapping("/plant")
@RequiredArgsConstructor
public class PlantController {

    private final PlantService plantService;
}
