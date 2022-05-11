package org.pekaboom.rotango.modules;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		User user = context.getBean(User.class);
		Profile userProfile = user.getProfile();
		user.setFirstname("Abel");
		user.setLastname("Akponine");
		userProfile.setProfileUsername("kingabel.a");
		userProfile.setProfilePassword("test1234");
		userProfile.setAboutInfo("Full-stack Developer");
		
		System.out.println(user.getProfile().getProfilePassword());
	}

}
