package cn.goingtodo.mdblog.pojo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/12/1723:47
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findall();
}
