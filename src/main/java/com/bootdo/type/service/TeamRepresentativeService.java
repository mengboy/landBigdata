package com.bootdo.type.service;

import com.bootdo.type.domain.TeamRepresentative;

import java.util.List;
import java.util.Map;

public interface TeamRepresentativeService {

    List<TeamRepresentative> teamRepresentatives(Map<String, Object> map);

    int count();

    int add(TeamRepresentative teamRepresentative);

    int del(Integer id);

    TeamRepresentative get(Integer id);

    int update(TeamRepresentative teamRepresentative);

}
