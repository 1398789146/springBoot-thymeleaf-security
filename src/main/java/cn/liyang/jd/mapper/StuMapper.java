package cn.liyang.jd.mapper;

import cn.liyang.jd.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyang
 * @date 2019/9/5 14:35
 * @description:
 */
@Repository
@Mapper
public interface StuMapper {
    @Select( "select * from stu" )
    List<Stu> findAll();
}
