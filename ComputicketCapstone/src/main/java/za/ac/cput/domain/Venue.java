package za.ac.cput.domain;

public class Venue {
    private int venueID;
    private String venueName;
    private String venueAddress;
    private String venueCapacity;

    public Venue() {

    }

    public Venue(int venueID, String venueName, String venueAddress, String venueCapacity) {
        this.venueID = venueID;
        this.venueName = venueName;
        this.venueAddress = venueAddress;
        this.venueCapacity = venueCapacity;
    }

    public int getVenueID() {
        return venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public String getVenueCapacity() {
        return venueCapacity;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID=" + venueID +
                ", venueName='" + venueName + '\'' +
                ", venueAddress='" + venueAddress + '\'' +
                ", venueCapacity='" + venueCapacity + '\'' +
                '}';
    }

    public class Builder {
        private int venueID;
        private String venueName;
        private String venueAddress;
        private String venueCapacity;

        public Builder(int venueID, String venueName, String venueAddress, String venueCapacity) {
            this.venueID = venueID;
            this.venueName = venueName;
            this.venueAddress = venueAddress;
            this.venueCapacity = venueCapacity;
        }

        public Builder setVenueID(int venueID) {
            this.venueID = venueID;
            return this;
        }

        public Builder setVenueName(String venueName) {
            this.venueName = venueName;
            return this;
        }

        public Builder setVenueAddress(String venueAddress) {
            this.venueAddress = venueAddress;
            return this;
        }

        public Builder setVenueCapacity(String venueCapacity) {
            this.venueCapacity = venueCapacity;
            return this;
        }

    }
}
