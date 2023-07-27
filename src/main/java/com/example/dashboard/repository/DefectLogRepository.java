package com.example.dashboard.repository;

import com.example.dashboard.entity.DefectLog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefectLogRepository extends CrudRepository<DefectLog, Integer> {



    List<DefectLog> findAllByTimeStampBetweenOrderByTimeStampAsc(String from,String to,Pageable page);

    @Query(nativeQuery = true,value = "select DISTINCT  (Defect_Type) from Defect_Log;")
    List<String> getDefectTypes();

    @Query(nativeQuery = true,value = "select DISTINCT  (Bottle_Type) from Defect_Log;")
    List<String> getBottleBrands();
}
