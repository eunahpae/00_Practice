package com.ohgiraffers.publisher;

public class BookDTO {

  // 필드 선언부
  private int bookCode;
  private String bookName;
  private int authorCode;
  private int publishYear;
  private int bookPrice;
  private int isbn;
  private String etc;

  // 기본 생성자
  public BookDTO() {
  }

  // 모든 필드를 포함한 생성자
  public BookDTO(int bookCode, String bookName, int authorCode, int publishYear, int bookPrice,
      int isbn, String etc) {
    this.bookCode = bookCode;
    this.bookName = bookName;
    this.authorCode = authorCode;
    this.publishYear = publishYear;
    this.bookPrice = bookPrice;
    this.isbn = isbn;
    this.etc = etc;
  }

  // Getter & Setter
  public int getBookCode() {
    return bookCode;
  }

  public void setBookCode(int bookCode) {
    this.bookCode = bookCode;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public int getAuthorCode() {
    return authorCode;
  }

  public void setAuthorCode(int authorCode) {
    this.authorCode = authorCode;
  }

  public int getPublishYear() {
    return publishYear;
  }

  public void setPublishYear(int publishYear) {
    this.publishYear = publishYear;
  }

  public int getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(int bookPrice) {
    this.bookPrice = bookPrice;
  }

  public int getIsbn() {
    return isbn;
  }

  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }

  public String getEtc() {
    return etc;
  }

  public void setEtc(String etc) {
    this.etc = etc;
  }

  // 객체 정보를 문자열로 반환하는 toString 메서드
  // 디버깅이나 로그 출력 시 BookDTO 객체의 상태를 한눈에 확인하는 데 매우 유용
  // 예: System.out.println(book); 을 호출하면 이 메서드가 자동으로 실행됨
  @Override
  public String toString() {
    return "BookDTO{" +
        "bookCode=" + bookCode +
        ", bookName='" + bookName + '\'' +
        ", authorCode=" + authorCode +
        ", publishYear=" + publishYear +
        ", bookPrice=" + bookPrice +
        ", isbn=" + isbn +
        ", etc='" + etc + '\'' +
        '}';
  }
}
