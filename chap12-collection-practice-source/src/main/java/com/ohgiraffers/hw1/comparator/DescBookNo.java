package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescBookNo implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO a, BookDTO b) {
        // 오름차순
        int result = 0;

        if (a.getbNo() < b.getbNo()) {
            return 1;
        } else if (a.getbNo() > b.getbNo()) {

            result = -1;
        } else {
            result = 0;
        }

        return result;
    }

}



