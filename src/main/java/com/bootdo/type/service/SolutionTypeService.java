package com.bootdo.type.service;

import com.bootdo.type.domain.SolutionType;

import java.util.List;
import java.util.Map;

public interface SolutionTypeService {
    List<SolutionType> list(Map<String, Object> map);

    int insert(SolutionType solutionType);

    int del(Integer id);

    int count();

    List<SolutionType> list();

    SolutionType select(Integer stid);
}
