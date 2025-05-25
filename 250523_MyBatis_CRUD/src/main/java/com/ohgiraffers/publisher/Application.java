package com.ohgiraffers.publisher;

import java.util.Scanner;

// 프로그램 실행의 시작점 - 사용자 입력을 받아 컨트롤러에 요청 전달
public class Application {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    BookController bookController = new BookController();

    do {
      System.out.println("==========메뉴 관리==========");
      System.out.println("1. 도서 전체 조회");
      System.out.println("2. 도서 코드로 도서 조회");
      System.out.println("3. 신규 도서 추가");
      System.out.println("4. 도서 수정");
      System.out.println("5. 도서 삭제");
      System.out.print("메뉴 관리 번호를 입력하세요 : ");
      int no = sc.nextInt();

      switch (no) {
        case 1:
          bookController.selectAllBooks();
          break;
        default:
          System.out.println("잘못된 메뉴를 선택하셨습니다.");
          break;
      }
    } while (true);
  }
}
