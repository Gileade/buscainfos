package com.example.getinfo.buscainfos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "computer_info")
public class ComputerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String computerName;
    private String ipAddress;

    public ComputerInfo(Long id, String computerName, String ipAddress) {
        this.id = id;
        this.computerName = computerName;
        this.ipAddress = ipAddress;
    }

    public ComputerInfo() {
    }

    public Long getId() {
        return id;
    }

    public String getComputerName() {
        return computerName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
