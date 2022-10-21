package com.nghia.repository;

import java.util.ArrayList;
import java.util.List;

public class HealthFormRepoImpl implements IHealthFormRepo{
    static List<String> genderList = new ArrayList<>();
    static List<String> nationalityList = new ArrayList<>();
    static List<String> travelInfoList = new ArrayList<>();
    static {
        genderList.add("Nam");
        genderList.add("Nữ");

        nationalityList.add("Viet Nam");
        nationalityList.add("Lao");
        nationalityList.add("Thai Lan");
        nationalityList.add("Campuchia");
        nationalityList.add("Trung Quoc");
        nationalityList.add("Maplaysia");

        travelInfoList.add("Tau bay");
        travelInfoList.add("Tau thuyen");
        travelInfoList.add("O to");
        travelInfoList.add("Khac (ghi ro)");
    }
    @Override
    public List<String> genderList() {
        return genderList;
    }

    @Override
    public List<String> nationalityList() {
        return nationalityList;
    }

    @Override
    public List<String> travelInfoList() {
        return travelInfoList;
    }
}
