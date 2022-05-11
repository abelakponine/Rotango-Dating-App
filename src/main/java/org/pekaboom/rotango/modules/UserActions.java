package org.pekaboom.rotango.modules;

/* User Actions: actions a user can perform on the app */
public interface UserActions {
	/* user can swipe right */
	public void swipeRight();
	/* user can swipe left */
	public void swipeLeft();
	/* user can block another user */
	public void blockAnotherUser();
	/* user can unblock another user */
	public void unBlockAnotherUser();
	/* user can undo last left swipe */
	public void undoLastLeftSwipe();
	
}
