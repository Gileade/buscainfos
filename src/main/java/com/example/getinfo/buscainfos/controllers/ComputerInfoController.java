package com.example.getinfo.buscainfos.controllers;

import com.example.getinfo.buscainfos.services.ComputerInfoService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/computer")
public class ComputerInfoController {

    @Autowired
    private ComputerInfoService computerInfoService;

    @GetMapping("/capture")
    public void captureComputerInfo(HttpServletResponse response) throws IOException {
        computerInfoService.saveComputerInfo();
        response.sendRedirect("https://google.com");
    }
}
