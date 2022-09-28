// 예제 4-4

public class E4_4_Book {
    String title;
    String author;

    public E4_4_Book(String t) {
        title = t; author = "작자미상";
    }

    public E4_4_Book(String t, String a) {
        title = t; author = a;
    }

    public static void main(String[] args) {
        E4_4_Book littlePrince = new E4_4_Book("어린왕자", "생텍쥐페리");
        E4_4_Book loveStory = new E4_4_Book("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
