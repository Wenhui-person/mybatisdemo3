package cn.edu.sdut.mapper;

import cn.edu.sdut.entity.Tbuser;

import java.util.List;

public interface UserMapper {
    Tbuser queryUserById(int userid);
    int queryUserCount();
    Tbuser queryUserByusername(String username);
    Tbuser login(Tbuser tbuser);
    List<Tbuser> queryUsers();
    int addUser(Tbuser tbuser);
    int updateUser(Tbuser tbuser);
    int deleteUser(int userid);
}
