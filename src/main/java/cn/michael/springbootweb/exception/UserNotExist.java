package cn.michael.springbootweb.exception;

public class UserNotExist extends RuntimeException{

    public UserNotExist() {
        super("User doesn't exist.");
    }
}
