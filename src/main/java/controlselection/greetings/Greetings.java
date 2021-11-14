package controlselection.greetings;

public class Greetings {




    public String greet(int hour, int minutes) {
      int time = hour*60+minutes;

      if (time>20*60){
          return "jó éjt";
      } else if (time>18*60+30){
          return "jó estét";
      } else if (time>9*60){
          return "jó napot";
      } else if (time>5*60){
           return "jó reggelt";
      } else {return "jó éjt";}
    }
}
