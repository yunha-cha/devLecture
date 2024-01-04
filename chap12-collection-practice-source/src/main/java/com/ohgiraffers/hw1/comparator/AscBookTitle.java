package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class AscBookTitle implements Comparator<BookDTO> {

    public int compare(BookDTO a, BookDTO b) {

        return a.getTitle().compareTo(b.getTitle());

    }


}