package com.solid.principles.interfacesegregation.good;
//Implemented method what is actual being operated by this.
//We don't had to bother about file operation as interface segregated.
public class DBDaoConnection implements  DAOInterface,DBInterface{
    @Override
    public void createRecord() {
        System.out.println("DB: Creating record in database");
    }

    @Override
    public void deleteRecord() {
        System.out.println("DB: Deleting record from database");
    }

    @Override
    public void openConnection() {
        System.out.println("DB: Opening database connection");
    }
}