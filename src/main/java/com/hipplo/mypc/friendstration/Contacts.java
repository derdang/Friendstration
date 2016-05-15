package com.hipplo.mypc.friendstration;

/**
 * Created by mewbu on 5/14/2016.
 */
public class Contacts {
    private String _name, _phone, _email;
    public Contacts (String name,String phone,String email){
        _name = name;
        _phone = phone;
        _email = email;
    }
    public String getName(){
    return _name;
    }
    public String getPhone(){
        return _phone;
    }
    public String getEmail(){
        return _email;
    }
}
