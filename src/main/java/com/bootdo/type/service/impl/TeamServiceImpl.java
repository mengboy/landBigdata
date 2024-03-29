package com.bootdo.type.service.impl;


import com.bootdo.type.dao.TeamMapper;
import com.bootdo.type.domain.Team;
import com.bootdo.type.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("teamService")
public class TeamServiceImpl implements TeamService{

    @Autowired
    TeamMapper teamMapper;

    @Override
    public List<Team> teams(Map<String, Object> map) {
        return teamMapper.teams(map);
    }

    @Override
    public int insertTeam(Team team) {
        return teamMapper.insertSelective(team);
    }

    @Override
    public int upTeam(Team team) {
        return teamMapper.updateByPrimaryKeySelective(team);
    }

    @Override
    public int delTeam(Integer id) {
        return teamMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Team getTeam(Integer id) {
        return teamMapper.selectByPrimaryKey(id);
    }

    @Override
    public int count() {
        return teamMapper.count();
    }
}
