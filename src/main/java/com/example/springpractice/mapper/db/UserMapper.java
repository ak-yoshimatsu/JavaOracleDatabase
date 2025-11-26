package com.example.springpractice.mapper.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.springpractice.entity.db.UserEntity;

@Mapper
public interface UserMapper {

	List<UserEntity> getAll();

}
