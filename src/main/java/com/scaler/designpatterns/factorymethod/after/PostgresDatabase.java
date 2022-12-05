package com.scaler.designpatterns.factorymethod.after;

public class PostgresDatabase implements Database {
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostname() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.POSTGRES;
    }

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}
