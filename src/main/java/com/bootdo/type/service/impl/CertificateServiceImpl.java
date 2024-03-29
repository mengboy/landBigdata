package com.bootdo.type.service.impl;

import com.bootdo.common.utils.Query;
import com.bootdo.type.dao.CertificateMapper;
import com.bootdo.type.domain.Certificate;
import com.bootdo.type.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("certificate")
public class CertificateServiceImpl implements CertificateService{


    @Autowired
    CertificateMapper certificateMapper;


    @Override
    public void insert(Certificate certificate) {
        certificateMapper.insertSelective(certificate);
    }

    @Override
    public void update(Certificate certificate) {
        certificateMapper.updateByPrimaryKeySelective(certificate);
    }

    @Override
    public void upDelStatus(Integer id) {
        certificateMapper.upDelStatus(id);
    }

    @Override
    public Certificate selectById(Integer id) {
        return certificateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int count() {
        return certificateMapper.count();
    }

    @Override
    public List<Certificate> list(Query query) {
        return certificateMapper.list(query);
    }
}
