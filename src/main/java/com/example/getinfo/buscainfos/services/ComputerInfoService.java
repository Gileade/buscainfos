package com.example.getinfo.buscainfos.services;

import com.example.getinfo.buscainfos.dtos.ComputerInfoDTO;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class ComputerInfoService {

    public ComputerInfoDTO getComputerInfo() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        String computerName = inetAddress.getHostName();
        String ipAddress = inetAddress.getHostAddress();
        return new ComputerInfoDTO(computerName, ipAddress);
    }
}
