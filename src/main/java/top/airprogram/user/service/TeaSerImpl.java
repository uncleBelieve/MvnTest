package top.airprogram.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.airprogram.user.dao.*;
import top.airprogram.user.entity.teacher;


@Service
public class TeaSerImpl implements TeacherService {


    @Autowired
    private teacherMapper teacherMapper;


    @Override
    @Transactional//只要是改变数据库操作就要加上该事务注解
    public int createTeacher(teacher teacher) {
       teacherMapper.insertSelective(teacher);
        return 0;
    }
}
