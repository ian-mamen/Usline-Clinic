package models;

public class Doctor extends Users {
    private static final String DATABASE_TYPE= "doctor";
    private int id;
//    private int docid;
    public Doctor(String email, String password, String firstName, String lastName, String gender, String phone){
//    this.docid=docid;



    this.email=email;
//    this.password=password;
    this.firstName =firstName;
    this.lastName=lastName;
    this.gender=gender;
    this.phone=phone;
    role=DATABASE_TYPE;
    }

//    public int getDocid(){return docid;}
//    public void setDocid(int docid){ this.docid=docid; }


    public String getEmail(){return email;}
    public void setEmail(String email){ this.email=email; }

//    public String getPassword(){return password;}
//    public void setPassword(String Password){this.password=password;}

    public String getFirtsname(){return firstName;}
    public void setFirstname(String firstname){this.firstName = firstname;}

    public String getLastname(){return lastName;}
    public void setLastname(String lastname){this.lastName = lastName;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

    public static String getDatabaseRole() {return DATABASE_TYPE; }
    public void  setDatabaseType(String role){role=DATABASE_TYPE;}

    public int getId() { return id; }
    public void setId(int id) {this.id = id;}
}
