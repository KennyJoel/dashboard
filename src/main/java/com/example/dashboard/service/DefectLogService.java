package com.example.dashboard.service;

import com.example.dashboard.entity.DefectLog;
import com.example.dashboard.mapper.DLMapper;
import com.example.dashboard.repository.DefectLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DefectLogService {

    @Autowired
    private DefectLogRepository defectLogRepository;
    @Autowired
    private DLMapper mapper;

    public List<DefectLog> getAll(String from, String to, int page, int size){
        List<DefectLog> defectLog = defectLogRepository.findAllByTimeStampBetweenOrderByTimeStampAsc(from,to,PageRequest.of(page,size));
        log.info("defectLog: {}",defectLog);
        return defectLog;
    }

    public List<String> getDefectTypes() {
        List<String> defectTypes = defectLogRepository.getDefectTypes();
        log.info("defectTypes: {}",defectTypes);
        return defectTypes;
    }

    public List<String> getBottleBrands() {
        List<String> bottleBrands = defectLogRepository.getBottleBrands();
        log.info("bottleBrands: {}",bottleBrands);
        return bottleBrands;
    }
}
