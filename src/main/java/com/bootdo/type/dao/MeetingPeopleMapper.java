package com.bootdo.type.dao;

import com.bootdo.type.domain.MeetingPeople;

public interface MeetingPeopleMapper {
    int deleteByPrimaryKey(Integer mpId);

    int insert(MeetingPeople record);

    int insertSelective(MeetingPeople record);

    MeetingPeople selectByPrimaryKey(Integer mpId);

    int updateByPrimaryKeySelective(MeetingPeople record);

    int updateByPrimaryKey(MeetingPeople record);
}