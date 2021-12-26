package com.swar.yantra.service;

import com.swar.yantra.dto.DepartmentMasterDto;
import com.swar.yantra.entity.DepartmentMaster;
import com.swar.yantra.mapper.DepartmentMasterMapper;
import com.swar.yantra.repository.DepartmentMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class DepartmentMasterService {

    @Autowired
    DepartmentMasterRepository departmentMasterRepository;

    @Autowired
    DepartmentMasterMapper departmentMasterMapper;

    public DepartmentMasterDto saveDepartment(DepartmentMasterDto departmentMasterDto) {
        DepartmentMaster entity=departmentMasterMapper.dtoToEntity(departmentMasterDto);
        entity=departmentMasterRepository.save(entity);
        departmentMasterDto=departmentMasterMapper.entityToDto(entity);
        return departmentMasterDto;
    }

    public void updateDepartmentMaster(Integer id, String HODName) {
        departmentMasterRepository.updateDepartment(id,HODName);
    }
}
