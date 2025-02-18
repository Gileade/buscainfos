package com.example.getinfo.buscainfos.controllers;

import com.example.getinfo.buscainfos.dtos.ComputerInfoDTO;
import com.example.getinfo.buscainfos.services.ComputerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
@RequestMapping("/computer")
public class ComputerInfoController {

    @Autowired
    private ComputerInfoService computerInfoService;


    @GetMapping("/info")
    public ComputerInfoDTO getComputerInfo() throws UnknownHostException {
        return computerInfoService.getComputerInfo();
    }
}
