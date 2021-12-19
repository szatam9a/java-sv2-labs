package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        String[] temp;
        for (String s : billItems) {
            temp = s.split(";");
            sb.append(temp[0]).append(", ").append(temp[2]).append(" * ").append(temp[1])
                    .append(" = ").append(Integer.parseInt(temp[2]) * Integer.parseInt(temp[1])).append(" Ft").
                    append(System.lineSeparator());
        }
        return sb.toString();
    }
}
