package com.scaler.designpatterns.factorymethod.after;


public class MySqlDatabase implements Database {


    @Override
    public void setUrl() {

    }

    @Override
    public void getHostname() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.MYSQL;
    }

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
