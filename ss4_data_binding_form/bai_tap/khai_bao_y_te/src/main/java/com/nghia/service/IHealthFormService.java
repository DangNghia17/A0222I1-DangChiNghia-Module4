package com.nghia.service;

import com.nghia.entity.HealthDeclare;

import java.util.List;
import java.util.Map;

public interface IHealthFormService {
    List<String> genderList ();
    List<String> nationalityList ();
    List<String> travelInfoList ();
    Map<String, String> checkData(HealthDeclare healthDeclare);

}
