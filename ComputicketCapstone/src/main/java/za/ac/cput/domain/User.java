package za.ac.cput.domain;

public class User {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userType;

    public User() {
    }
    private User (Builder builder){
        this.username = builder.username;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.userType = builder.userType;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    public class Builder{
        private String username;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String userType;

        public Builder() {
        }

        public Builder(String username, String firstName, String lastName,
                       String email, String password, String userType) {
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.userType = userType;
        }

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder copy(User user) {
            this.username = username;
            this.firstName =firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.userType =userType;
            return this;
        }
         public User build() {
            return new User(this);
         }
    }
}
