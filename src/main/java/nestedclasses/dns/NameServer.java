package nestedclasses.dns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameServer {
    private List<DnsEntry> entries;

    public NameServer() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String hostName, String hostIp) {
        DnsEntry anEntry = new DnsEntry(hostName, hostIp);
        if (shouldAddToList(hostName, hostIp))
            entries.add(new DnsEntry(hostName, hostIp));
    }

    private boolean shouldAddToList(String hostName, String hostIp) {
        for (DnsEntry d : entries) {
            if (d.ipAddress == hostIp || d.name == hostName) {
                throw new IllegalArgumentException(" Already exists");
            }
        }
        return true;
    }

    public void removeEntryByName(String hostName) {
        Iterator<DnsEntry> it = entries.iterator();
        while (it.hasNext()) {
            DnsEntry current = it.next();
            if (current.name.equals(hostName)) {
                it.remove();
            }
        }
    }

    public void removeEntryByIp(String hostName) {
        Iterator<DnsEntry> it = entries.iterator();
        while (it.hasNext()) {
            DnsEntry current = it.next();
            if (current.ipAddress.equals(hostName)) {
                it.remove();
            }
        }
    }

    public String getIpByName(String name) {
        for (DnsEntry d : entries) {
            if (d.name.equals(name)) {
                return d.ipAddress;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String name) {
        for (DnsEntry d : entries) {
            if (d.ipAddress.equals(name)) {
                return d.name;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public List<DnsEntry> getEntries() {
        return entries;
    }

    private class DnsEntry {
        private String name;
        private String ipAddress;

        public DnsEntry(String name, String ipAddress) {
            this.name = name;
            this.ipAddress = ipAddress;
        }

        @Override
        public String toString() {
            return "DnsEntry{" +
                    "name='" + name + '\'' +
                    ", ipAddress='" + ipAddress + '\'' +
                    '}';
        }
    }
}
