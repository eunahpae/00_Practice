package com.ohgiraffers.publisher;

import java.util.List;
import java.util.Map;

// 사용자의 요청을 서비스 계층으로 전달하고 결과를 화면에 출력
public class BookController {

  private final PrintResult printResult;
  private final BookService bookService;

  public BookController() {
    printResult = new PrintResult();
    bookService = new BookService();
  }

  public void selectAllBooks() {
    List<BookDTO> bookList = bookService.selectAllBooks();
    if (bookList != null) {
      printResult.printSuccessMessage("selectAllBooks");
      printResult.printBookList(bookList);
    } else {
      printResult.printErrorMessage("selectAllBooks");
    }
  }

  public void selectBookByCode(Map<String, String> parameter) {
    int code = Integer.parseInt(parameter.get("code"));

    BookDTO book = bookService.selectBookByCode(code);

    if (book != null) {
      printResult.printSuccessMessage("selectBookByCode");
      printResult.printBook(book);
    } else {
      printResult.printErrorMessage("selectBookByCode");
    }
  }

  public void registBook(Map<String, String> parameter) {
    String bookName = parameter.get("bookName");
    int authorCode = Integer.parseInt(parameter.get("authorCode"));
    int publishYear = Integer.parseInt(parameter.get("publishYear"));
    int bookPrice = Integer.parseInt(parameter.get("bookPrice"));
    int isbn = Integer.parseInt(parameter.get("isbn"));
    String etc = parameter.get("etc");

    BookDTO book = new BookDTO();
    book.setBookName(bookName);
    book.setAuthorCode(authorCode);
    book.setPublishYear(publishYear);
    book.setBookPrice(bookPrice);
    book.setIsbn(isbn);
    book.setEtc(etc);

    System.out.println(book);

    if (bookService.registBook(book)) {
      printResult.printSuccessMessage("registBook");
    } else {
      printResult.printErrorMessage("registBook");
    }
  }

  public void modifyBook(Map<String, String> parameter) {
    int bookCode = Integer.parseInt(parameter.get("bookCode"));
    String bookName = parameter.get("bookName");
    int authorCode = Integer.parseInt(parameter.get("authorCode"));
    int publishYear = Integer.parseInt(parameter.get("publishYear"));
    int bookPrice = Integer.parseInt(parameter.get("bookPrice"));
    int isbn = Integer.parseInt(parameter.get("isbn"));
    String etc = parameter.get("etc");

    BookDTO book = new BookDTO();
    book.setBookCode(bookCode);
    book.setBookName(bookName);
    book.setAuthorCode(authorCode);
    book.setPublishYear(publishYear);
    book.setBookPrice(bookPrice);
    book.setIsbn(isbn);
    book.setEtc(etc);

    if (bookService.modifyBook(book)) {
      printResult.printSuccessMessage("modifyBook");
    } else {
      printResult.printErrorMessage("modifyBook");
    }
  }

  public void deleteBook(Map<String, String> parameter) {
    int bookCode = Integer.parseInt(parameter.get("bookCode"));

    int result = bookService.deleteBookByCode(bookCode);

    if (result > 0) {
      printResult.printSuccessMessage("deleteBook");
    } else {
      printResult.printErrorMessage("deleteBook");
    }
  }

}
