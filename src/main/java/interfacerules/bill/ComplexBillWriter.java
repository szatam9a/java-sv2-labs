package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        String[] temp;
        for (String s : billItems) {
            temp = s.split(";");
            sb.append(temp[0]).append("; darabszám: ").append(temp[2]).append(", egységár: ").append(temp[1])
                    .append(", összesen: ").append(Integer.parseInt(temp[2]) * Integer.parseInt(temp[1])).append(" Ft").
                    append(System.lineSeparator());
        }
        return sb.toString();
    }

}
