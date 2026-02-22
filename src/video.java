public class video extends items {
    private int duration;

//Constructor
public video(String title, String type,double currentLoanDays, int duration) {
    super(title, type, currentLoanDays, 2);
    this.duration = duration;
}

// Getter
public int getDuration() { return duration ; }

 // Setter

public void setDuration(int duration)  { this.duration= duration;}


   //Polymorphic method
    //commented ud indtil vi finder ud af hvordan den skal fungere
//@Override
//    public String toString() {
//                return "Product: " + title + " | Duration " + duration + " ";
//            }
}

