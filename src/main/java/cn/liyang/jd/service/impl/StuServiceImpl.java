package cn.liyang.jd.service.impl;

import cn.liyang.jd.mapper.StuMapper;
import cn.liyang.jd.pojo.Stu;
import cn.liyang.jd.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liyang
 * @date 2019/9/5 14:38
 * @description:
 */
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper stuMapper;
    @Override
    public List<Stu> findAll () {
        return stuMapper.findAll();
    }
}
