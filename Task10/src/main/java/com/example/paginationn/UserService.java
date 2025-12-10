package com.example.paginationn;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;


@Service
public class UserService {


    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public RespUserDTO createUser(RequestUserDTO requestDTO) {
        System.out.println(requestDTO);
        Userss userEntity = userMapper.requestUser(requestDTO);
        System.out.println(userEntity);
        Userss savedUser = userRepository.save(userEntity);
        return userMapper.resptUser(savedUser);
    }

    public Page<RespUserDTO> getUsers(PageRequest pageRequest) {
        Page<Userss> page = userRepository.findAll(pageRequest);

        return page.map(userMapper::resptUser);
    }

}
