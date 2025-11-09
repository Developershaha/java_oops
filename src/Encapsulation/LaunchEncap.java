package Encapsulation;

class Book {

    private int pageNumber;

    void setPageNumber(int pageNumber) {

        if (pageNumber >= 0) {
            this.pageNumber = pageNumber;

        } else {
            System.out.println("please enter positive number ");
        }
    }

    int getPageNumber() {
        return this.pageNumber;
    }
}

public class LaunchEncap {
    public static void main(String[] args) {
        Book b = new Book();
        b.setPageNumber(94);
        System.out.println(b.getPageNumber());
    }
}
