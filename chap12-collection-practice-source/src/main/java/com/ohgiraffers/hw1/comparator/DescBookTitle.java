package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescBookTitle implements Comparator<BookDTO> {

    public int compare(BookDTO a, BookDTO b) {

        return b.getTitle().compareTo(a.getTitle());
    }
}

