package com.example.springpractice.mapper;

import com.example.springpractice.dto.PhotoDto;
import com.example.springpractice.entity.PhotoEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-24T16:47:21+0900",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class PhotoMapperImpl implements PhotoMapper {

    @Override
    public List<PhotoEntity> toEntity(List<PhotoDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<PhotoEntity> list = new ArrayList<PhotoEntity>( dto.size() );
        for ( PhotoDto photoDto : dto ) {
            list.add( photoDtoToPhotoEntity( photoDto ) );
        }

        return list;
    }

    protected PhotoEntity photoDtoToPhotoEntity(PhotoDto photoDto) {
        if ( photoDto == null ) {
            return null;
        }

        PhotoEntity photoEntity = new PhotoEntity();

        photoEntity.setTitle( photoDto.getTitle() );
        photoEntity.setUrl( photoDto.getUrl() );
        photoEntity.setThumbnailUrl( photoDto.getThumbnailUrl() );

        return photoEntity;
    }
}
