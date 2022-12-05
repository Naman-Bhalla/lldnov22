package com.scaler.designpatterns.factorymethod.after;

public class Client {

    UserService userService = new UserService(new MySqlDatabase());
}
