
package oop.execrise9;

import java.util.Scanner;


public class Processor {

    public static void main(String[] args) {
        RoomList roomlist = new RoomList();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("\n--- Menu ---");
            System.out.println("1.Add a new meeting room");
            System.out.println("2.Add a new bedroom");
            System.out.println("3.Update Room by id");
            System.out.println("4.Delete Room by id");
            System.out.println("5.Find Room by id");
            System.out.println("6.Display all Rooms");
            System.out.println("7.Find the most expensive Room");
            System.out.println("8.Count the total number of meeting room and bedroom separately in the Room List");
            System.out.println("9.Exit.");
            System.out.print("Chon mot tuy chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1: 
                    System.out.print("Enter Meeting Room ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Meeting Room Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Base Cost: ");
                    double baseCost = scanner.nextDouble();
                    System.out.print("Enter Capacity: ");
                    int capacity = scanner.nextInt();
                    roomlist.AddRoom(new MeetingRoom(id, name, baseCost, capacity));
                    break;
                case 2:
                    System.out.print("Enter Bedroom ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Bedroom Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Base Cost: ");
                    baseCost = scanner.nextDouble();
                    System.out.print("Enter Number of Beds: ");
                    int numberOfBeds = scanner.nextInt();
                    roomlist.AddRoom(new BedRoom(id, name, baseCost, numberOfBeds));
                    System.out.println("Bedroom added successfully!");
                    break;
                case 3:
//                    System.out.print("Enter Room ID to update: ");
//                    id = scanner.nextLine();
//                    System.out.print("Enter new Room Name: ");
//                    name = scanner.nextLine();
//                    System.out.print("Enter new Base Cost: ");
//                    baseCost = scanner.nextDouble();
//                    scanner.nextLine();
//                    System.out.print("Is it a meeting room (true/false)? ");
//                    boolean isMeetingRoom = scanner.nextBoolean();
//                    
//                    Room updatedRoom;
//                    if (isMeetingRoom) {
//                        System.out.print("Enter new Capacity: ");
//                        capacity = scanner.nextInt();
//                        updatedRoom = new MeetingRoom(id, name, baseCost, capacity);
//                    } else {
//                        System.out.print("Enter new Number of Beds: ");
//                        numberOfBeds = scanner.nextInt();
//                        updatedRoom = new BedRoom(id, name, baseCost, numberOfBeds);
//                    }
//                    
//                    if (roomlist.updateRoomById(id, updatedRoom)) {
//                        System.out.println("Room updated successfully!");
//                    } else {
//                        System.out.println("Room not found!");
//                    }
                    System.out.println("Enter ID to update: ");
                    id = scanner.nextLine();
                    roomlist.updateRoom(id);
                    break;
                case 4:
                    System.out.print("Enter Room ID to delete: ");
                    id = scanner.nextLine();
                    if (roomlist.DeleteRoomByID(id)) {
                        System.out.println("Room deleted successfully!");
                    } else {
                        System.out.println("Room not found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter Room ID to find: ");
                    id = scanner.nextLine();
                    Room foundRoom = roomlist.findRoomById(id);
                    if (foundRoom != null) {
                        foundRoom.displayDetails();
                    } else {
                        System.out.println("Room not found!");
                    }
                    break;
                case 6: 
                    roomlist.displayAllRooms();
                    break;
                case 7:
                    Room mostExpensiveRoom = roomlist.findMostExpensiveRoom();
                    if (mostExpensiveRoom != null) {
                        System.out.println("Most expensive room details:");
                        mostExpensiveRoom.displayDetails();
                    } else {
                        System.out.println("No rooms available!");
                    }
                    break;
                case 8:
                    roomlist.countRooms();
                    break;
                case 9:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default: 
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        
    }
    
}
