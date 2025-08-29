package com.solid.principles.interfacesegregation.good;

//Here dont need to bother about db part.
public class FileDaoConnection implements FileInterface,DAOInterface{
    @Override
    public void createRecord() {
        System.out.println("File: Creating record in file");
    }

    @Override
    public void deleteRecord() {
        System.out.println("File: Deleting record from file");
    }

    @Override
    public void openFile() {
        System.out.println("File: Opening file");
    }
}