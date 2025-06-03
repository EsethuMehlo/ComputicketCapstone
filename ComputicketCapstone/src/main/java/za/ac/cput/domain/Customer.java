package za.ac.cput.domain;

public class Customer extends User{
      private String address;
      private String contactNumber;
      private User user;

    public Customer() {
    }

    public Customer (Builder builder) {
        this.address = builder.address;
        this.contactNumber = builder.contactNumber;
        this.user = builder.user;
    }



    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", user=" + user +
                '}';
    }

    public static class Builder {
        private String address;
        private String contactNumber;
        private User user;

        public Builder() {
        }

        public Builder(String address, String contactNumber, User user) {
            this.address = address;
            this.contactNumber = contactNumber;
            this.user = user;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder copy(Customer customer) {
            this.user = user;
            this.contactNumber = contactNumber;
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
