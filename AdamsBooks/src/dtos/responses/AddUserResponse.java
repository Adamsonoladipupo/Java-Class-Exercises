package dtos.responses;

import data.models.BookBorrowed;

import java.util.ArrayList;

public class AddUserResponse {
    private String name;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
