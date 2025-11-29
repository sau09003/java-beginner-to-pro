package CoreJava.Arrays;

public class BookArray {
    int id;
    String name;
    String author;
    String date;
    float rating;

    BookArray( int id,String name,String author,String  date,float rating){
        this.id=id;
        this.name=name;
        this.author=author;
        this.date=date;
        this.rating=rating;
    }

    @Override
    public String toString() {
        return "BookArray{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        BookArray array[]= new BookArray[3];
BookArray book1= new BookArray(01,"freedom","Mahatma Gandhi","20-12-1944",4.5f);
BookArray book2= new BookArray(02,"Education","Mahatma Phule","10-2-1974",4.8f);
BookArray book3= new BookArray(03,"Difference Caste","APJ","20-12-1977",4f);
array[0]=book1;
array[1]=book2;
array[2]=book3;

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
