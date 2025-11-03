import java.util.*;
class Book{
    String name,author;
    int pages,price;
    Book(String name,String author,int price,int pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }
    public String toString(){
        String name,author,price,pages;
        name="Book name: "+this.name+"\n";
        author="Author name: "+this.author+"\n";
        price="Price: "+this.price+"\n";
        pages ="Number of pages: "+this.pages+"\n";
        return name +author+price+pages;

    }
}
class to_string{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;int pages;int price; String name;String author;
        System.out.println("Enter number of books");
        n=s.nextInt();
        s.nextLine();
        Book b[]=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("---Enter details---\n Enter book name: ");
            name=s.nextLine();
            System.out.println("Enter author's name: ");
            author=s.nextLine();
            System.out.println("Enter Price: ");
            price=s.nextInt();
            System.out.println("Enter number of pages: ");
            pages=s.nextInt();
            s.nextLine();
            b[i]=new Book(name,author,price,pages);
        }
        for(int i=0;i<n;i++){
            System.out.println("---BOOK DETAILS---\n");
            System.out.println(b[i]);
        }
    }
}
