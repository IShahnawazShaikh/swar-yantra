package com.swar.yantra.controller;

import com.swar.yantra.dto.DepartmentMasterDto;
import com.swar.yantra.service.DepartmentMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentMasterService departmentMasterService;

    @PostMapping("/save")
    public ResponseEntity<?> addDepartment(@RequestBody DepartmentMasterDto departmentMasterDto) {
        try {
           departmentMasterDto = departmentMasterService.saveDepartment(departmentMasterDto);
            return new ResponseEntity(departmentMasterDto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<?> updateDepartment(@PathVariable Integer Id,@RequestBody DepartmentMasterDto departmentMasterDto) {
        try {
            departmentMasterService.updateDepartmentMaster(Id, departmentMasterDto.getDepartmentHOD());

            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
