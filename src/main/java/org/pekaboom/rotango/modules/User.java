package org.pekaboom.rotango.modules;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User implements UserActions {
	@Autowired
	Profile profile;
	String firstname;
	String lastname;
	Date dateOfBirth;
	String nationality;
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getFullName() {
		return firstname+" "+lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void swipeRight() {
		System.out.print("Swiped Right");
	}

	public void swipeLeft() {
		System.out.print("Swiped Left");
	}

	public void blockAnotherUser() {
		System.out.print("Another User is Blocked");
	}

	public void unBlockAnotherUser() {
		System.out.print("Another User is Unblocked");
	}

	public void undoLastLeftSwipe() {
		System.out.print("Last Left Swipe Undone");
	}
}
