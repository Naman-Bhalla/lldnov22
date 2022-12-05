package com.scaler.designpatterns.factorymethod.before;

public interface Database {

    void setUrl();

    void getHostname();

    DatabaseType getType();
}
