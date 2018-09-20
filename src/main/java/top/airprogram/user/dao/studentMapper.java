package top.airprogram.user.dao;


import top.airprogram.user.entity.student;

public interface studentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);

    student selectByPrimaryKeyWithTeacher(Integer sid);
}