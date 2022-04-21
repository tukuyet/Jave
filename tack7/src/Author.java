public class Author {
    private  String name;
    private String email;
    private char gender;

    public Author(String Name, String Email, char Gender) {
        this.name = Name;
        this.email = Email;
        this.gender = Gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String Email) {
        this.email = Email;
    }

    @Override
    public String toString() {
        return name + " (" +  gender + ") at " + email;
    }

    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("gender is: " + ahTeck.getGender());
        System.out.println("email is: " + ahTeck.getEmail());
    }
}


