package com.ams.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ams.data.controllers.ArticleController;
import java.io.File;

@SpringBootApplication
public class AmsVermegDataApplication {

	public static void main(String[] args) {
		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(AmsVermegDataApplication.class, args);
		}

}
