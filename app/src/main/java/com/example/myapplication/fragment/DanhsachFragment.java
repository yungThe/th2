package com.example.myapplication.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.myapplication.ModifyBookActivity;
import com.example.myapplication.adapter.BookAdapter;
import com.example.myapplication.databinding.FragmentDanhSachBinding;
//import com.example.myapplication.db.SQLiteHelper;
import com.example.myapplication.listener.BookListener;
import com.example.myapplication.model.Book;

import java.util.List;

public class DanhsachFragment extends Fragment {
    FragmentDanhSachBinding binding;
    BookAdapter bookAdapter;
    List<Book> books;

    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    resetData();
                }
            }
    );


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void initView() {

    }

    public void resetData() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDanhSachBinding.inflate(inflater, container, false);
        initView();
        return binding.getRoot();
    }
}
