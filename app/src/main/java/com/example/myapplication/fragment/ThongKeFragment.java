package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.myapplication.adapter.BookAdapter;
import com.example.myapplication.databinding.FragmentThongkeBinding;
//import com.example.myapplication.db.SQLiteHelper;
import com.example.myapplication.model.Book;

import java.util.List;

public class ThongKeFragment extends Fragment {
    FragmentThongkeBinding binding;
    //SQLiteHelper sqLiteHelper;
    BookAdapter bookAdapter;
    List<Book> books;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentThongkeBinding.inflate(inflater,container,false);
        initView();


        return binding.getRoot();
    }

    private void initView() {

    }}
