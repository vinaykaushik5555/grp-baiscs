package com.vinay;

import com.vinay.library.Author;
import com.vinay.library.Book;
import com.vinay.library.Collections;
import com.vinay.library.Edition;

import java.util.List;

import static com.vinay.library.Collections.*;

public class BookDemo {

    public static void main(String[] args) {
        Author bc_rao = Author.newBuilder().setName("BC Rao").setId("1").build();
        Author dc_rao = Author.newBuilder().setName("DC Rao").setId("2").build();

        Book grpc = Book.newBuilder().addAllAuthors(List.of(bc_rao, dc_rao))
                .setTitle("Let gRPC")
                .addGenres("Technology")
                .addGenres("CNCF")
                .addEditions(Edition.newBuilder().setEditionNumber(1).setPublicationYear("2014").build())
                .putProperties("rating", "****")
                .putProperties("listing", "amazon")
                .build();
        System.out.println(grpc);
    }
}
