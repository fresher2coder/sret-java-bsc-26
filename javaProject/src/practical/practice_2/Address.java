package practical.practice_2;

public class Address {
    private String doorNo, street, city, pincode;
    static String country;

    static {
        country = "India";
    }

    public Address(String doorNo, String street, String city, String pincode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public String getShortAddress() {
        return doorNo + ", " + city + " - " + pincode;
    }
}
