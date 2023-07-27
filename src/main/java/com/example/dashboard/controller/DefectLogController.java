package com.example.dashboard.controller;


import com.example.dashboard.dto.DefectLogDto;
import com.example.dashboard.entity.DefectLog;
import com.example.dashboard.service.DefectLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping(path = "/api/v1/dashboard")
public class DefectLogController {

    @Autowired
    private DefectLogService defectLogService;

    @GetMapping(value = "/getDefectLogs")
    public ResponseEntity<List<DefectLog>> getAll(@RequestParam(required = false) String from,@RequestParam(required = false) String to,@RequestParam(required = false,defaultValue = "0") int page,@RequestParam(required = false,defaultValue = "100") int size){


        List<DefectLog> defectLogDtos = defectLogService.getAll(from,to,page,size);
        return ResponseEntity.ok(defectLogDtos);

    }
}
