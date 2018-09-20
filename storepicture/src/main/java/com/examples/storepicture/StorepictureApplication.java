package com.examples.storepicture;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.examples.storepicture.model.Picture;
import com.examples.storepicture.repository.PictureRepository;

@SpringBootApplication
public class StorepictureApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorepictureApplication.class, args);
	}
	
	@Bean
	public static CommandLineRunner demo(PictureRepository pictureRepository){
		return args -> {
			
			// creating picture file
			File file = new File("tr.png");
			byte[] pictureBytes = new byte[(int) file.length()];
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(pictureBytes);
			fileInputStream.close();
			
			Picture picture = new Picture("TR", pictureBytes, new Date());
			
			// Save
			pictureRepository.save(picture);
			
		};
	}
	
}
