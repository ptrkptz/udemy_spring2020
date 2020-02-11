package com.pmp.springtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.pmp.springdemo.FortuneService;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName = "C:\\Development\\git\\udemy_spring2020\\spring-demo-section9\\src\\com\\pmp\\springtest\\fortune.txt";
	private List<String> theFortune;
	
	private Random rand = new Random();
	
	@PostConstruct
	private void loadFile() {
		System.out.println(" >> inside the loadFile method");
		
		File file = new File(fileName);
		
		//System.out.println("Reading file: "+file);
		//System.out.println("File exists: "+file.exists());
		
		theFortune = new ArrayList<String>();
		
		//read the file
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String tempLine;
			
			while ((tempLine = br.readLine()) != null) {
				theFortune.add(tempLine);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		
		//System.out.println("Size: "+theFortune.size());
		int index = rand.nextInt(theFortune.size());
		
		//System.out.println("Index: "+index);
		String rtnFortune = theFortune.get(index);
		
		return rtnFortune;
	}

}
