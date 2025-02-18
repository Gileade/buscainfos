package com.example.getinfo.buscainfos.dtos;

public class ComputerInfoDTO {

    private String computerName;
    private String ipAddress;

    public ComputerInfoDTO() {
    }

    public ComputerInfoDTO(String computerName, String ipAddress) {
        this.computerName = computerName;
        this.ipAddress = ipAddress;
    }

    public String getComputerName() {
        return computerName;
    }

    public String getIpAddress() {
        return ipAddress;
    }
}
