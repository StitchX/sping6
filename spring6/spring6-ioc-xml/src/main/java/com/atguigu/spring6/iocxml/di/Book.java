package com.atguigu.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    private String others;

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        System.out.println("无参数构造执行了");
        return author;
    }

    public void setAuthor(String author) {
        System.out.println("有参数构造执行了");
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book();
//        通过set方法注入
        book.setAuthor("霍金");
        book.setBname("时间简史");
        System.out.println(book.getBname());

//        通过构造器方法注入
        Book book1 = new Book("11","22");
    }
}
