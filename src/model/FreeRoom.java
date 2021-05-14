package model;

public class   FreeRoom extends Room{

    public FreeRoom(int price){
        price = 0;
    }

    @Override
    public String toString() {return super.toString() +"The price of the room is:" + getRoomPrice();
    }
}
