package com.ohgiraffers.publisher;

import java.util.List;

// 실행 결과를 사용자에게 출력하는 역할
public class PrintResult {

  public void printBookList(List<BookDTO> bookList) {
    for (BookDTO book : bookList) {
      System.out.println(book);
    }
  }

  public void printBook(BookDTO book) {
    System.out.println(book);
  }

  public void printSuccessMessage(String successCode) {
    String successMessage = "";
    switch (successCode) {
      case "selectAllBooks":
        successMessage = "도서 전체 조회 성공";
        break;
    }
    System.out.println(successMessage);
  }

  public void printErrorMessage(String errorCode) {
    String errorMessage = "";
    switch (errorCode) {
      case "selectAllBooks":
        errorMessage = "도서 전체 조회 실패";
        break;

    }
    System.out.println(errorMessage);
  }
}
