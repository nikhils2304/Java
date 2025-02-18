

public class Library {
    
    private int fineAmount;

    public Library(){
        this.fineAmount = 5;
    }

    public void displayFine(){
        System.out.println("The fine amount returning the book late is : $" + fineAmount);
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.displayFine();
    }
}
