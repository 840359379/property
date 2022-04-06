package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.PersonnelMapper;
import com.example.property.model.Personnel;
import com.example.property.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService {

    @Autowired
    private PersonnelMapper personnelMapper;

    @Override
    public CommonResult<Boolean> addPersonnel(Personnel personnel) {
        Date date = new Date();
        Long dateString = date.getTime();
        personnel.setHomeId("PN" + dateString);
        if(personnelMapper.addPersonnel(personnel)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<List<Personnel>> selectPersonnel(Personnel personnel) {
        return new CommonResult<>(200,"成功",personnelMapper.selectPersonnel(personnel));
    }

    @Override
    public CommonResult<Boolean> updatePersonnel(Personnel personnel) {
        if(personnelMapper.updatePersonnel(personnel)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<Boolean> deletePersonnel(Personnel personnel) {
        if(personnelMapper.deletePersonnel(personnel)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }
}
