package aggregation;

public class Book{
   
int bookid;
String bookName;
Author author;//THIS IS OTHER OBJECT IN BOOK OBJECT. THIS IS CALLED AGGREGATION
Author1 author1;

public Book(int bookid,String bookName,Author author,Author1 author1){

    this.bookid=bookid;
    this.bookName=bookName;
    this.author=author; 
    this.author1=author1; 
}
public void showDetails(){
    System.out.println("BookID:"+ bookid +" "+"BookName:"+ bookName );
    System.out.println("AuthorName:"+author.authorName+" "+"AuthorAge:"+author.authorAge);
    System.out.println("AuthorName1:"+author1.authorName1+" "+"AuthorAge1:"+author1.authorAge1);
}

public static void main(String[] args) {
    
Author author=new Author("Martin", 30);
Author1 author1=new Author1("Earnest", 20);

Book book = new Book(1,"c++",author,author1);
book.showDetails();
}

}
