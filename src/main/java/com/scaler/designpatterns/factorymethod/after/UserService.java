package com.scaler.designpatterns.factorymethod.after;

public class UserService {
    Database database;

    public  UserService(Database database) {
        this.database = database;
    }

    void registerUser() {
        Query query = database.createQuery();

//        if (database.getType().equals(DatabaseType.MYSQL)) {
//            query = new MySqlQuery();
//        } else if (database.getType().equals(DatabaseType.POSTGRES)) {
//            query = new PostgresQuery();
//        }



    }
}
