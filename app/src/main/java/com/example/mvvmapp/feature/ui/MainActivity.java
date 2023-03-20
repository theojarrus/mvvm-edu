package com.example.mvvmapp.feature.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvmapp.databinding.ActivityMainBinding;
import com.example.mvvmapp.feature.presentation.MainState;
import com.example.mvvmapp.feature.presentation.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.state.observe(this, this::render);

        if (savedInstanceState == null) viewModel.loadUsers();
    }

    private void render(MainState state) {
        binding.textView.setText(state.getText());
    }
}
