package com.swar.yantra.repository;

import com.swar.yantra.entity.DepartmentMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

public interface DepartmentMasterRepository extends JpaRepository<DepartmentMaster,Integer> {
    @Modifying
    @Transactional
    @Query(value="UPDATE DepartmentMaster dm set dm.departmentHOD=:name Where dm.departmentId=:id",nativeQuery = true)
    void updateDepartment(Integer id,String name);
}
