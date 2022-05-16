package com.example.myapplication.listener;

import com.example.myapplication.model.Book;

public interface BookListener {
    void onDeleteBook(Book book);
    void onModifyBook(Book book);
}
