package com.fkahraman.databindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.fkahraman.databindingexample.databinding.ActivityMainBinding;
import com.fkahraman.databindingexample.model.User;

public class MainActivity extends AppCompatActivity {

    private User userModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setActivity(MainActivity.this);
        userModel = new User("Furkan","Kahraman","1997");
        binding.setUserModel(userModel);
    }

    public void btnClick(View view){
        userModel.setUserName("Yağız"); userModel.setUserSurname("Kahraman"); userModel.setBirthYear("2011");
    }
}