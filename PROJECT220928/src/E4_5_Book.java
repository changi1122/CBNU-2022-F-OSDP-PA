// 예제 4-5

public class E4_5_Book {
    String title;
    String author;

    void show() { System.out.println(title + " " + author); }

    public E4_5_Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public E4_5_Book(String title) {
        this(title, "작자미상");
    }

    public E4_5_Book(String title, String author) {
        this.title = title; this.author = author;
    }

    public static void main(String[] args) {
        E4_5_Book littlePrince = new E4_5_Book("어린왕자", "생텍쥐페리");
        E4_5_Book loveStory = new E4_5_Book("춘향전");
        E4_5_Book emptyBook = new E4_5_Book();
        loveStory.show();
    }
}
