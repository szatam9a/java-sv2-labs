package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

class ComplexBillWriterTest {

    @Test
    void writeBillTest() {
        Bill bill = new Bill();
        ComplexBillWriter sbw = new ComplexBillWriter();

        System.out.println(
                sbw.writeBill(bill.readBillItemsFromFile(Path.of("src/test/resources/interfacerules/billitems.txt"))));

    }
}