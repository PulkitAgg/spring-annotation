package com.pulkit.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // default name is "samsung" (non qualified and de capitalized) ,for giving your name use @Component("yourName")
public class Samsung {
	
	@Autowired
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



	public void config() {
		System.out.println("Octa core, 4 gb Ram, 12MP camera");
		cpu.process();
	}
}
