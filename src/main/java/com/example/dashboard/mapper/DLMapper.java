package com.example.dashboard.mapper;

import com.example.dashboard.dto.DefectLogDto;
import com.example.dashboard.entity.DefectLog;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DLMapper extends EntityMapper<DefectLogDto, DefectLog>{

    List<DefectLogDto> toDto (List<DefectLog> defectLogs);

}

