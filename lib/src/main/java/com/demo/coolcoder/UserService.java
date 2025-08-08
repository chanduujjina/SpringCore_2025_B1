package com.demo.coolcoder;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	public static void main(String[] args) {
		UserInfo userInfo = adduser();
		
		System.out.println(userInfo.getAudtitData());
		System.out.println(userInfo.getDateInfo());
		
		System.out.println(userInfo.getMaskList());
	}
	
	public static UserInfo adduser() {
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserFirstName("testFirst");
		userInfo.setLastName("testLast");
		//read meta/annotation data using reflection api
	
		//load the class runtime
		
	     Class<UserInfo> cls = UserInfo.class;
	    String auditInfo = null;
	      if (cls.isAnnotationPresent(AuditData.class)) {
	    	  AuditData auditData = cls.getAnnotation(AuditData.class);
	    	  auditInfo = auditData.name()+ ","+auditData.value()[0]+","+auditData.value()[1];
	      }
	      userInfo.setAudtitData(auditInfo);
	      
	      //read met info from method level annotation
	      String createDate = null;
	      for (Method method :cls.getDeclaredMethods()) {
	    	  if (method.isAnnotationPresent(LogTime.class)) {
	    		  LogTime annotation = method.getAnnotation(LogTime.class);
	    		  createDate= annotation.dateInfo();
	    		  break;
	    	  }
	      }
	      userInfo.setDateInfo(createDate);
	      
	      List<String> maskList = new ArrayList();
	      for(Field field :cls.getDeclaredFields()) {
	    	  if (field.isAnnotationPresent(Mask.class)) {
	    		  Mask annotation = field.getAnnotation(Mask.class);
	    		  maskList.add(annotation.name());
	    	  }
	      }
	      userInfo.setMaskList(maskList);
		
		return userInfo;
	}

}
