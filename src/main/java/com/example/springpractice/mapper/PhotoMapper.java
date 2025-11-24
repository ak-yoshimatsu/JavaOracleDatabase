package com.example.springpractice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.springpractice.dto.PhotoDto;
import com.example.springpractice.entity.PhotoEntity;

@Mapper(componentModel = "spring")
public interface PhotoMapper {

	@Mapping(source = "id", target = "photoId")
	List<PhotoEntity> toEntity(List<PhotoDto> dto);
}
