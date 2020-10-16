import java.util.Enumeration;

public class HtmlStatement extends Statement {
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = head(aCustomer);
    
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += body(each);
    }

    result += footer(aCustomer);
    return result; 
  }

  public String head(Customer aCustomer) {
    return "<H1>Rental Record for <EM>" + aCustomer.getName() +
          "</EM></H1><P>\n";
  }

  public String body(Rental each) {
    return each.getMovie().getTitle() + ": " +
          String.valueOf(each.getCharge()) + "<BR>\n";
  }

  public String footer(Customer aCustomer) {
    String footer = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) +
                    "</EM><P>\n";
    footer += "On this rental you earned <EM>" + 
              String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
              "</EM> frequent renter points<P>";
    return footer;
  }
}
