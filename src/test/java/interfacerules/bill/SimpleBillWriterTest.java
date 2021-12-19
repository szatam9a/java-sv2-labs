package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBillWriterTest {

    @Test
    void writeBillTest() {
        Bill bill = new Bill();
        SimpleBillWriter sbw = new SimpleBillWriter();

        System.out.println(
                sbw.writeBill(bill.readBillItemsFromFile(Path.of("src/test/resources/interfacerules/billitems.txt"))));

    }
}