class Main {
  public static void main(String[] args) {
    Movie naruto = new Movie("Naruto", 1);
    Movie sherlock = new Movie("Sherlock Holmes", 0);

    Rental rentalNaruto = new Rental(naruto, 3);
    Rental rentalSherlock = new Rental(sherlock, 3);

    Customer jao = new Customer("Jao");

    jao.addRental(rentalNaruto);
    jao.addRental(rentalSherlock);

    System.out.println(jao.statement());
    System.out.println("\n");
    System.out.println(jao.htmlStatement());
  }
}
