package com.example.desafio_password;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.desafio_password.Presenter.Presenter;
import com.example.desafio_password.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity  implements  IPresenteView {

    public ActivityMainBinding binding;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_main);
        presenter = new Presenter(this);
        binding.etxt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presenter.evaluatePass(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    @Override
    public void showWeak() {
        binding.tv1.setText("Weak pass");
        binding.tv1.setBackgroundColor(Color.RED);

    }

    @Override
    public void showMedium() {
        binding.tv1.setText("Medium pass");
        binding.tv1.setBackgroundColor(Color.YELLOW);

    }

    @Override
    public void showStrong() {
        binding.tv1.setText("Strong pass");
        binding.tv1.setBackgroundColor(Color.GREEN);

    }
}