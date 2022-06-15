package pojos;

public class BookingDatesPojo {


    private String checkin="2022-03-01";
    private String checkout="2022-03-11";

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public BookingDatesPojo() {
    }

    public BookingDatesPojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "BookingDatesPojo{" +
                "checking='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }
}
