package guru.spring.rest.models;

import lombok.Data;

import java.util.List;

@Data
public class UserData {

    List<User> data;
/*
    GETTER SETTER CREATED BY LOMBOK
    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }*/
}
