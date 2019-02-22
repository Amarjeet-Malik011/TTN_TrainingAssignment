package LibraryManagementSystempro;

class Member implements User
{
    private String memberName;
    private int memberID;

    Member(String name, int id)
    {
        memberName = name;
        memberID = id;
    }

    // Giving a body to interface method
    public void getUser()
    {
        System.out.println("Name of the member " + memberName);
        System.out.println("ID of the member " + memberID);
    }

}
