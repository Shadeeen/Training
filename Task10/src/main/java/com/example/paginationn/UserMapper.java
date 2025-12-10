package com.example.paginationn;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    RespUserDTO resptUser(Userss user);
    Userss requestUser(RequestUserDTO requestUserDTO);

}
