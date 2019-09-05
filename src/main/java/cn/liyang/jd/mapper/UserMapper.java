package cn.liyang.jd.mapper;

import cn.liyang.jd.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author liyang
 * @date 2019/9/5 15:32
 * @description:
 */
@Repository
@Mapper
public interface UserMapper {
    @Select( "select * from user where username=#{username} and password=#{password}" )
    User findByNameAndPassword(User user);
}
