package com.bootdo.type.service.impl;

import com.bootdo.type.dao.SolutionMapper;
import com.bootdo.type.domain.Solution;
import com.bootdo.type.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("soluction")
public class SolutionServiceImpl implements SolutionService{

    @Autowired
    SolutionMapper solutionMapper;

    @Override
    public List<Solution> solutions(Map<String, Object> map) {
        return solutionMapper.list(map);
    }

    @Override
    public Solution getSolutionById(Integer id) {
        return solutionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delSolution(Integer id) {
        return solutionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSolution(Solution solution) {
        return solutionMapper.insertSelective(solution);
    }

    @Override
    public int upSolution(Solution solution) {
        return solutionMapper.updateByPrimaryKeySelective(solution);
    }

    @Override
    public int count() {
        return solutionMapper.count();
    }
}
