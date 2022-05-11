package org.pekaboom.rotango.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Profile {
	String profileUsername;
	private String profilePassword;
	private String profileImage;
	String profileUrl;
	String aboutInfo;
	String lookingFor;
	String relationshipStatus;
	String wantChildren;
	String haveChildren;
	String drinking;
	String smoking;
	List<Map<String, String>> schooling = new ArrayList<Map<String, String>>();
	List<String> languages = new ArrayList<String>();
	List<String> hobbies = new ArrayList<String>();
	
	public String getProfileUsername() {
		return profileUsername;
	}
	public void setProfileUsername(String profileUsername) {
		this.profileUsername = profileUsername;
	}
	public String getProfilePassword() {
		return profilePassword;
	}
	public void setProfilePassword(String profilePassword) {
		this.profilePassword = profilePassword;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public String getAboutInfo() {
		return aboutInfo;
	}
	public void setAboutInfo(String aboutInfo) {
		this.aboutInfo = aboutInfo;
	}
	public String getLookingFor() {
		return lookingFor;
	}
	public void setLookingFor(String lookingFor) {
		this.lookingFor = lookingFor;
	}
	public String getRelationshipStatus() {
		return relationshipStatus;
	}
	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
	public String getWantChildren() {
		return wantChildren;
	}
	public void setWantChildren(String wantChildren) {
		this.wantChildren = wantChildren;
	}
	public String getHaveChildren() {
		return haveChildren;
	}
	public void setHaveChildren(String haveChildren) {
		this.haveChildren = haveChildren;
	}
	public String getDrinking() {
		return drinking;
	}
	public void setDrinking(String drinking) {
		this.drinking = drinking;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public List<Map<String, String>> getSchooling() {
		return schooling;
	}
	public void setSchooling(List<Map<String, String>> schooling) {
		this.schooling = schooling;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
}
