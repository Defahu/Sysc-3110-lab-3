import java.util.ArrayList;
import java.util.List;

public class    AddressBook {
    private List<BuddyInfo> buddyList;

    public AddressBook(){
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddyList.add(buddy);
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < buddyList.size()) {
            return this.buddyList.remove(index);
        }
        return null;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        //System.out.println("Address Book");
    }


}