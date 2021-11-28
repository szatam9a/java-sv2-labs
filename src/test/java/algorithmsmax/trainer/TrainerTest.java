package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {
       @Test
       void onCreate(){
              Trainer trainer= new Trainer("a",1);
              assertEquals("a", trainer.getName());
              assertEquals(1, trainer.getAge());
       }
}