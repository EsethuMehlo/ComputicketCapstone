package za.ac.cput.domain;

import java.time.LocalDateTime;



public class Event {

    private String eventID;
    private String eventName;
    private String eventDescription;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    enum status{
        soldOut,
        cancelled,
        Active,
    }

    public Event() {
    }

    public Event(Builder builder) {
        this.eventID =  builder.eventID;
        this.eventName =  builder.eventName;
        this.eventDescription =  builder.eventDescription;
        this.startTime =  builder.startTime;
        this.endTime =  builder.endTime;
    }

    public String getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public static class Builder {
        private String eventID;
        private String eventName;
        private String eventDescription;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        enum status{
            soldOut,
            cancelled,
            Active,
        }

        public Builder(LocalDateTime endTime, LocalDateTime startTime, String eventDescription,
                       String eventName, String eventID) {
            this.eventID = eventID;
            this.eventName = eventName;
            this.endTime = endTime;
            this.startTime = startTime;
            this.eventDescription = eventDescription;

        }

        public Builder setEventID(String eventID) {
            this.eventID = eventID;
            return this;
        }

        public Builder setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
            return this;
        }

        public Builder setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public  Builder copy(Event event) {
            this.eventID = eventID;
            this.eventName = eventName;
            this.eventDescription = eventDescription;
            this.startTime = startTime;
            this.endTime = endTime;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }


}
