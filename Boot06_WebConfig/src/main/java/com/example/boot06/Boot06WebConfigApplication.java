package com.example.boot06;

import java.io.IOException;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.boot06.Boot06WebConfigApplication;

@SpringBootApplication
public class Boot06WebConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot06WebConfigApplication.class, args);
		Runtime rt = Runtime.getRuntime();
	    try {
	        rt.exec("cmd /c start chrome.exe http://localhost:9000/boot06");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

}
}
