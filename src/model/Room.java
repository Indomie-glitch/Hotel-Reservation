package model;

public  class Room implements IRoom {
    private Double roomPrice;
    private String roomNumber;
    private RoomType roomType;
    private boolean availability;

    public Double getRoomPrice() {
        return roomPrice;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setType(RoomType type) {
        this.roomType = type;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isFree() {
        return availability;
    }
}
