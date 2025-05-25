package com.ohgiraffers.publisher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 프로그램 실행의 시작점 - 사용자 입력을 받아 컨트롤러에 요청 전달
public class Application {

  public static void main(String[] args) {
    // 하나의 Scanner 객체만 생성해서 재사용하는 것이 리소스 낭비를 줄이고, 입력 오류를 방지
    Scanner sc = new Scanner(System.in);

    BookController bookController = new BookController();

    do {
      System.out.println("==========메뉴 관리==========");
      System.out.println("1. 도서 전체 조회");
      System.out.println("2. 도서 코드로 도서 조회");
      System.out.println("3. 신규 도서 추가");
      System.out.println("4. 도서 수정");
      System.out.println("5. 도서 삭제");
      System.out.println("0. 프로그램 종료");
      System.out.print("메뉴 관리 번호를 입력하세요 : ");
      int no = sc.nextInt();

      // nextInt(), nextDouble() 등 숫자 입력 후 개행 문자가 남아있기 때문에,
      // nextLine()으로 개행 문자를 미리 제거해주지 않으면 이후 문자열 입력이 제대로 동작하지 않을 수 있음
      sc.nextLine(); // 개행 문자 제거

      switch (no) {
        case 1:
          bookController.selectAllBooks();
          break;
        case 2:
          bookController.selectBookByCode(inputBookCode(sc));
          break;
        case 3:
          bookController.registBook(inputBook(sc));
          break;
        case 4:
          bookController.modifyBook(modifyBook(sc));
          break;
        case 5:
          bookController.deleteBook(inputDeleteBook(sc));
          break;
        case 0:
          System.out.println("====== 프로그램을 종료합니다. =======");
          sc.close(); // Scanner 객체는 사용이 끝나면 닫아줘야 함
          return;
        default:
          System.out.println("잘못된 메뉴를 선택하셨습니다.");
          break;
      }
    } while (true);
  }

  // Scanner 객체를 매개변수로 전달하여 여러 메소드에서 하나의 Scanner를 재사용
  private static Map<String, String> inputBookCode(Scanner sc) {
    System.out.print("도서 코드를 입력하세요 : ");
    String code = sc.nextLine();

    Map<String, String> parameter = new HashMap<>();
    parameter.put("code", code);

    return parameter;
  }

  private static Map<String, String> inputBook(Scanner sc) {
    System.out.print("도서 이름을 입력하세요 : ");
    String bookName = sc.nextLine();
    System.out.print("작가 코드를 입력하세요 : ");
    String authorCode = sc.nextLine();
    System.out.print("제작 년도를 입력하세요 : ");
    String publishYear = sc.nextLine();
    System.out.print("도서 가격을 입력하세요 : ");
    String bookPrice = sc.nextLine();
    System.out.print("ISBN 넘버를 입력하세요(숫자만 9자리 이하 입력) : ");
    String isbn = sc.nextLine();
    System.out.print("기타 정보를 입력하세요 : ");
    String etc = sc.nextLine();

    Map<String, String> parameter = new HashMap<>();
    parameter.put("bookName", bookName);
    parameter.put("authorCode", authorCode);
    parameter.put("publishYear", publishYear);
    parameter.put("bookPrice", bookPrice);
    parameter.put("isbn", isbn);
    parameter.put("etc", etc);

    return parameter;
  }

  private static Map<String, String> modifyBook(Scanner sc) {
    System.out.print("수정할 도서 코드를 입력하세요 : ");
    String bookCode = sc.nextLine();
    System.out.print("도서 이름을 입력하세요 : ");
    String bookName = sc.nextLine();
    System.out.print("작가 코드를 입력하세요 : ");
    String authorCode = sc.nextLine();
    System.out.print("제작 년도를 입력하세요 : ");
    String publishYear = sc.nextLine();
    System.out.print("도서 가격을 입력하세요 : ");
    String bookPrice = sc.nextLine();
    System.out.print("ISBN 넘버를 입력하세요(숫자만 9자리 이하 입력) : ");
    String isbn = sc.nextLine();
    System.out.print("기타 정보를 입력하세요 : ");
    String etc = sc.nextLine();

    Map<String, String> parameter = new HashMap<>();
    parameter.put("bookCode", bookCode);
    parameter.put("bookName", bookName);
    parameter.put("authorCode", authorCode);
    parameter.put("publishYear", publishYear);
    parameter.put("bookPrice", bookPrice);
    parameter.put("isbn", isbn);
    parameter.put("etc", etc);

    return parameter;
  }

  private static Map<String, String> inputDeleteBook(Scanner sc) {
    System.out.print("삭제할 도서 코드를 입력하세요 : ");
    String bookCode = sc.nextLine();

    Map<String, String> parameter = new HashMap<>();
    parameter.put("bookCode", bookCode);

    return parameter;
  }
}
