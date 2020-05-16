package org.top.gmall.gmalluser.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.top.gmall.gmalluser.model.UmsMember;

import java.util.List;

@Mapper
public interface UmsMemberMapper {

    Boolean saveUser(@Param("user") UmsMember user);

    UmsMember selectUser(Integer id);

    List<UmsMember> selectAll();

    Boolean updateUser(@Param("user") UmsMember user);


    Boolean deleteUser(Integer id);


}
