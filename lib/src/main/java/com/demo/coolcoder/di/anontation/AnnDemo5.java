package com.demo.coolcoder.di.anontation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnDemo5 {

	private AnnDemo6 annDemo6;
	
	private AnnDemo7 annDemo7;
	
	private AnnDemo4 annDemo4;
	
	@Autowired
	public AnnDemo5(AnnDemo6 annDemo6,AnnDemo7 annDemo7,@Qualifier(value = "annonDemo4_v1") AnnDemo4 annDemo4) {
		super();
		this.annDemo6 = annDemo6;
		this.annDemo7 = annDemo7;
		this.annDemo4 = annDemo4;
	}
	
	public AnnDemo6 getAnnDemo6() {
		return annDemo6;
	}
	
	public AnnDemo7 getAnnDemo7() {
		return annDemo7;
	}
	
	public AnnDemo4 getAnnDemo4() {
		return annDemo4;
	}

	

}
