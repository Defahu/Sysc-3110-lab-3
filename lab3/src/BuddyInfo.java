public class BuddyInfo {

    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer","xxx");
        System.out.println("Hello "+ buddy.getName());

    }


    public void setName(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}