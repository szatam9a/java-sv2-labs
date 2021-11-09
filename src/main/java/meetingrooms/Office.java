package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom room:meetingRooms
             ) {
            System.out.println(room.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size()-1; i >= 0  ; i--) {
            System.out.println(meetingRooms.get(i).getName());

        }
    }

    public void printEvenNames(){
        for (int i = 0; i < meetingRooms.size() ; i++) {
            if (i%2==0){
                System.out.println(meetingRooms.get(i).getName());
            }
        }

    }
    public void printAreas(){
        for (MeetingRoom actual:meetingRooms
             ) {
            System.out.println(actual);

        }
    }
    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom actual:meetingRooms
             ) { if (actual.getName().equals(name)){
            System.out.println(actual);
        }

        }

    }

    public void printMeetingRoomsWithContains(String name){
        for (MeetingRoom actual:meetingRooms
        ) { if (actual.getName().contains(name)){
            System.out.println(actual);
        }

        }
    }
    public void printAreasLargerThan(int area){
        for (MeetingRoom actual:meetingRooms
        ) { if (actual.getArea()>area){
            System.out.println(actual);
        }

        }
    }

}
