package top.airprogram.user.dao;

import org.apache.ibatis.annotations.Param;
import top.airprogram.user.entity.teacher;

import java.util.List;

public interface teacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(teacher record);

    int insertSelective(teacher record);

    teacher selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(teacher record);

    int updateByPrimaryKey(teacher record);

    teacher selectByPrimaryKeyWithStudent(Integer tid);


    List<teacher> selectByTid(@Param("tids") List<Integer> tids);//  后15min    查询id（不止一个ID，往常是一个id）为1 2 的老师
}