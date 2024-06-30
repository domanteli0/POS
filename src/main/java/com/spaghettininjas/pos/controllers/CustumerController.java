package com.spaghettininjas.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import com.spaghettininjas.pos.Pos.*;
import lombok.extern.slf4j.Slf4j;
import static com.spaghettininjas.pos.common.Exceptions.NotImplementedException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@Slf4j
@RestController
@RequestMapping("/api/customer/")
public class CustumerController {
    @GetMapping("{id}")
    Customer get(@PathVariable Integer id) {
        throw NotImplementedException;
    }
}
