package dev.david.OnePassword.websocket;

public class Message {
    private String message;
    private String userId;
    public Message () {

    }
    public Message (String message, String userId){
        this.message = message;
        this.userId = userId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getUserId() {return userId;}
    public void setUserId(String userId) {this.userId = userId;}
}
