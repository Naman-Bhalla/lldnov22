package com.scaler.designpatterns.factorymethod.after;


public interface Database {

    void setUrl();

    void getHostname();

    DatabaseType getType();

    // Factory Method
    Query createQuery();
}
