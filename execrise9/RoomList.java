
package oop.execrise9;
import java.util.ArrayList;

public class RoomList {
    private ArrayList<Room> RoomList = new ArrayList<>();
    
    public void AddRoom(Room room){
        RoomList.add(room);
    }
    
    public Room findRoomById(String id) {
        for (Room room : RoomList) {
            if (room.getId().equals(id)) {
                return room;
            }
        }
        return null;
    }
    
//    public boolean updateRoomById(String id, Room newRoom) {
//        for (int i = 0; i < RoomList.size(); i++) {
//            if (RoomList.get(i).getId().equals(id)) {
//                RoomList.set(i, newRoom);
//                return true;
//            }
//        }
//        return false;
//    }
    public void updateRoom(String id) {
        Room room = findRoomById(id);
        if (room != null) {
            System.out.println("Updating room with ID: " + id);
             room.updateRoom(id);
        } else {
            System.out.println("Room with ID " + id + " not found!");
        }
    }
    
    public boolean DeleteRoomByID(String id) {
        Room room = findRoomById(id);
        if (room != null) {
            RoomList.remove(room);
            System.out.println("Room co ID la " + id + " da duoc xoa thanh cong.");
            return true;
        }
        System.out.println("Room co ID la " + id + " khong co trong danh sach.");
        return false;
    }
    
    public void displayAllRooms() {
        if (RoomList.isEmpty()) {
            System.out.println("Danh sach sach hien dang trong.");
            return;
        }
        System.out.println("\nRoom List:");
        for (Room room : RoomList) {
            room.displayDetails();
            System.out.println("---------------------------");
        }
    }
    
    public Room findMostExpensiveRoom() {
        Room mostExpensive = null;
        double maxCost = 0;
        for (Room room : RoomList) {
            double cost = room.calculateCost();
            if (cost > maxCost) {
                maxCost = cost;
                mostExpensive = room;
            }
        }
        return mostExpensive;
    }
    public void countRooms() {
        int meetingRooms = 0, bedRooms = 0;
        for (Room room : RoomList) {
            if (room instanceof MeetingRoom) {
                meetingRooms++;
            } else if (room instanceof BedRoom) {
                bedRooms++;
            }
        }
        System.out.println("Meeting Rooms: " + meetingRooms + ", Bed Rooms: " + bedRooms);
    }
    
    
    
    
}
