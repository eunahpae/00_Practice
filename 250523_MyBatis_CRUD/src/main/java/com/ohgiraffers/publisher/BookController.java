package com.ohgiraffers.publisher;

import java.util.List;

// 사용자의 요청을 서비스 계층으로 전달하고 결과를 화면에 출력
public class BookController {

  private final PrintResult printResult;
  private final BookService bookService;

  public BookController() {
    printResult = new PrintResult();
    bookService = new BookService();
  }

  public void selectAllBooks(){
    List<BookDTO> bookList = bookService.selectAllBooks();
    if (bookList !=null){
      printResult.printSuccessMessage("selectAllBooks");
      printResult.printBookList(bookList);
    }else{
      printResult.printErrorMessage("selectAllBooks");
    }
  }
}
