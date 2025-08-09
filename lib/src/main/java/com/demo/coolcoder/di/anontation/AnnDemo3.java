package com.demo.coolcoder.di.anontation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnDemo3 {
	
	public AnnDemo4 getAnnDemo4() {
		return annDemo4;
	}

	public void setAnnDemo4(AnnDemo4 annDemo4) {
		this.annDemo4 = annDemo4;
	}

	@Autowired
	@Qualifier(value = "annonDemo4_v2")
	private AnnDemo4 annDemo4;

}
