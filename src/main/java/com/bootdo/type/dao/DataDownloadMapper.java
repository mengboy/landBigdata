package com.bootdo.type.dao;

import com.bootdo.type.domain.DataDownload;

import java.util.List;
import java.util.Map;

public interface DataDownloadMapper {
    int deleteByPrimaryKey(Integer ddid);

    int insert(DataDownload record);

    int insertSelective(DataDownload record);

    DataDownload selectByPrimaryKey(Integer ddid);

    int updateByPrimaryKeySelective(DataDownload record);

    int updateByPrimaryKey(DataDownload record);

    List<DataDownload> list(Map<String, Object> map);

    int count();
}