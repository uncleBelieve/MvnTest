package top.airprogram.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.airprogram.user.dao.*;
import top.airprogram.user.entity.student;
import top.airprogram.user.entity.teacher;


@Service("stuServiceImpl")  //标注service层并命名
public class StuServiceImpl implements StuService {


    @Autowired
    private studentMapper studentMapper;

    @Autowired
    private TeacherService teacherService;


    @Override
    @Transactional//事务注解
    public int createStu(student student) {      //增加学生和老师是同一个事务，本处老师表中已经有Tid且已经设为主键3，不可重复，异常。而学生数据是从
                                               //前端工具传进，正常。但是属于同一个事务测试结果是否的确都插不进去，因为属于同一事务
        studentMapper.insertSelective(student);
        teacher teacher =new teacher();
        teacher.setTid(3);
        teacher.setUsername("ssmAll");
        teacher.setPassword("123");
        teacherService.createTeacher(teacher);
        return 0;
    }
}
