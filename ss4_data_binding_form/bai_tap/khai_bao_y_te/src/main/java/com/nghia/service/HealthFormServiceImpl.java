package com.nghia.service;

import com.nghia.entity.HealthDeclare;
import com.nghia.repository.HealthFormRepoImpl;
import com.nghia.repository.IHealthFormRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HealthFormServiceImpl implements IHealthFormService {
    IHealthFormRepo healthFormRepo = new HealthFormRepoImpl();

    @Override
    public List<String> genderList() {
        return healthFormRepo.genderList();
    }

    @Override
    public List<String> nationalityList() {
        return healthFormRepo.nationalityList();
    }

    @Override
    public List<String> travelInfoList() {
        return healthFormRepo.travelInfoList();
    }

    @Override
    public Map<String, String> checkData(HealthDeclare healthDeclare) {

        Map<String, String> error = new HashMap<>();
        if (healthDeclare.getName().equals("")) {
            error.put("name", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getBirthday().equals("")) {
            error.put("birthday", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getIdCard().equals("")) {
            error.put("idCard", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getTravelInfo() == null) {
            error.put("travelInfo", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getNumberVehicle().equals("")) {
            error.put("numberVehicle", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getNumberSeat().equals("")) {
            error.put("numberSeat", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getDateStart().equals("")) {
            error.put("dateStart", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getDateEnd().equals("")) {
            error.put("dateEnd", "Ban chua nhap vao muc nay!");
        }
        if (healthDeclare.getOtherInfo().equals("")) {
            error.put("otherInfo", "Ban chua nhap vao muc nay!");
        }
        return error;
    }
}
