package com.fkahraman.databindingexample.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.fkahraman.databindingexample.BR;

public class User extends BaseObservable {

    private String userName;
    private String userSurname;
    private String birthYear;

    public User(String userName, String userSurname, String birthYear) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.birthYear = birthYear;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
        notifyPropertyChanged(BR.userSurname);
    }

    @Bindable
    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
        notifyPropertyChanged(BR.birthYear);
    }

}
