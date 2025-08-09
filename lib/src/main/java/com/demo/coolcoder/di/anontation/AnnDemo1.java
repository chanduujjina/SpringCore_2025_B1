package com.demo.coolcoder.di.anontation;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnDemo1 {
	
	@Autowired
	private AnnDemo2 annonDemo2;//setter based DI
	
	public AnnDemo2 getAnnonDemo2() {
		return annonDemo2;
	}

	public void setAnnonDemo2(AnnDemo2 annonDemo2) {
		this.annonDemo2 = annonDemo2;
	}

	

}
