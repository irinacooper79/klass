public class Main {
    public static void main(String[] args) {
        System.out.println("Obekt klass");
    }

    private string name;
    private string
            surname;

    publid Author(String name);

    string surname)

    {
        this.name = name;
        this surname = surname;
        this author = name + surname;
        public String getName () {
        return this.name;
        {
            public String getSurmane () {
            return this.surname;
        }
            public String getFullName () {
            return this.name + " " + this surname;
        }
            public class Book {
                private final String title;
                private final Author author;
                private int publicationYear;

                public Book(String title, Author futhor, int publicationYear) {
                    this.title = title;
                    this.author = author;
                    this.publicationYear = publicationYear;
                    public String getYiyle () {
                        return this.title;
                    }
                    public Author getAuthor () {
                        return this.author;
                    }
                    public int getPublicationYear () {
                        return this.publicationYear;
                    }
                    public void setPublicationYear ( int publicationYear){
                        this.publicationYear = publicationYear;
                    }
                }
                public class HomeworkObjects{
                    public static void main (String[]args) {

                        Author LevTolstoy = new Author(name:"Лев," suname:
                        "Толстой");
                        Author stephenking = new Author(name:"Стивен," surname:
                        "Кинг");
                        Book voynaIMir = new Book(title:"Война и мир," levTolstoy, publicationYrar 2020);
                        Book siyanie = new Book(title:"Сияние," stephenKing, publicationYear:2002);
                        System.out.println(voynaIMir.bookInfo());
                        System.out.println(siyanie.bookInfo());
                        voynaIMir.setPublicationYear(2022);
                        System.out.println(voynaIMir.bookInfo());
                        voynaIMir.equals(voynaIMir);
                    }
                }
                public String toString() {
                    return name + " " + this.surname;
                }
                pyblic boolean equals (Object 0){
                    if (this == 0) {
                        return true;
                    }
                    if (0 == null || getClass () !=0 getClass (){
                        return false;
                    }
                    Author author = (Author) 0;
                    return objects.equals (name, author name && objects.equaks (surname, author.surname));

                    public static void addBook (Book book){
                        boolean bookAdded = false;
                        for (int i=0; i < books.length; i++){
                            if (books [i] == null){
                                book[i] = book;
                                bookAdded = true;
                                break;
                            }
                        }
                        if (! bookAdded){
                            System.out.println ("Нет места для новых книг")
                        }
                    }
                    public String extendedBook in to (String title);
                    String result = null;
                    for (Book book: books){
                        if (book.getTitle(). equals(title)){
                            return String.format (% s by % s was published in % s, book.getTitle()), book.getAuthor(),
                                    book. getPublicationYear();
                        }
                        return result;
                    }
                    public void changePublicationYear (Stringtitle, int newPublicationYear){
                        for (Book book: books){
                            if (book. getTitle(). equals (title)){
                                book setPublicationYear (newPublicationYear);
                            }
                        }
                    }
