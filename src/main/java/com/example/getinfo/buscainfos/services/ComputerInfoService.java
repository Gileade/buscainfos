package com.example.getinfo.buscainfos.services;

import com.example.getinfo.buscainfos.dtos.ComputerInfoDTO;
import com.example.getinfo.buscainfos.models.ComputerInfo;
import com.example.getinfo.buscainfos.repositories.ComputerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class ComputerInfoService {

    @Autowired
    ComputerInfoRepository computerInfoRepository;

    public void saveComputerInfo() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String computerName = inetAddress.getHostName();
            String ipAddress = inetAddress.getHostAddress();

            ComputerInfo computerInfo = new ComputerInfo();
            computerInfo.setComputerName(computerName);
            computerInfo.setIpAddress(ipAddress);

            computerInfoRepository.save(computerInfo);
        } catch (UnknownHostException e) {
            throw new RuntimeException("Erro ao obter informações do computador", e);
        }
    }
}
