package com.example.dashboard.controller;


import com.example.dashboard.entity.DefectLog;
import com.example.dashboard.service.DefectLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping(path = "/api/v1/common")
public class CommonController {

    @Autowired
    private DefectLogService defectLogService;

    @GetMapping(value = "/getDefectTypes")
    public ResponseEntity<List<String>> getDefectTypes(){

//        Pageable pageable = PageRequest.of(page,size);
        List<String> defectTypes = defectLogService.getDefectTypes();
        return ResponseEntity.ok(defectTypes);

    }
    @GetMapping(value = "/getBottleBrands")
    public ResponseEntity<List<String>> getBottleBrands(){

//        Pageable pageable = PageRequest.of(page,size);
        List<String> defectTypes = defectLogService.getBottleBrands();
        return ResponseEntity.ok(defectTypes);

    }
}
