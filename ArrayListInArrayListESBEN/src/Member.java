import java.util.ArrayList;

public class Member {

    private String name;
    private String address;
    private ArrayList<Member>  listOfMembers;

    public Member(String name, String address){
        this.name = name;
        this.address = address;
        listOfMembers = new ArrayList<Member>();
    }

   public String setName(String name){
        return name;
   }

   public String setAddress(String address){
        return address;
   }
}
