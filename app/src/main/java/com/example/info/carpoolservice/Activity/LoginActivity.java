package com.example.info.carpoolservice.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.info.carpoolservice.R;

/**
*
 *  LoginActivity 페이지
 * 1. 로그인버튼 클릭-> 메인페이지로 이동
 * 2. 회원가입버튼 클릭-> 회원가입페이지로 이동
 *
* @author 박종진
* @version 1.0.0
* @since 2018-04-06 오전 7:30
**/
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
