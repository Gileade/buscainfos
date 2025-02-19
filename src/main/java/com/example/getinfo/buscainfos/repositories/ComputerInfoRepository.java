package com.example.getinfo.buscainfos.repositories;

import com.example.getinfo.buscainfos.models.ComputerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerInfoRepository extends JpaRepository<ComputerInfo, Long> {
}
