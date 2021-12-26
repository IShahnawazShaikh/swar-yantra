package com.swar.yantra.mapper;

import com.swar.yantra.dto.DepartmentMasterDto;
import com.swar.yantra.entity.DepartmentMaster;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMasterMapper {
    public DepartmentMasterDto entityToDto(DepartmentMaster entity){
        DepartmentMasterDto dto=new DepartmentMasterDto();
        dto.setDepartmentName(entity.getDepartmentName());
        dto.setDepartmentHOD(entity.getDepartmentHOD());
        dto.setType(entity.getType());
        dto.setCat(entity.getCat());
        return dto;
    }
    public DepartmentMaster dtoToEntity(DepartmentMasterDto dto){
        DepartmentMaster entity=new DepartmentMaster();
        entity.setDepartmentName(dto.getDepartmentName());
        entity.setDepartmentHOD(dto.getDepartmentHOD());
        entity.setType(dto.getType());
        entity.setCat(dto.getCat());
        return entity;
    }

}
