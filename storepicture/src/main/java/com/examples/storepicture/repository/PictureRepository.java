package com.examples.storepicture.repository;

import org.springframework.data.repository.CrudRepository;

import com.examples.storepicture.model.Picture;

public interface PictureRepository extends CrudRepository<Picture, Long> {

}
