package cn.liyang.jd.mapper;

import cn.liyang.jd.pojo.Cat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyang
 * @date 2019/9/5 16:09
 * @description:
 */
@Repository
@Mapper
public interface CatMapper {
    @Select( "select * from cat where id=#{id}" )
    Cat findById (long id);
    @Select( "select * from cat limit 20 " )
    List<Cat> findAll ( );
}
