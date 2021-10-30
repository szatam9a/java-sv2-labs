package compositionlist.cumputer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel  4", 5);
        PersonalComputer pc = new PersonalComputer(cpu);
        Hardware monitor = new Hardware("monitor", "lg");
        Hardware keyBoard = new Hardware("billentyűzet", "lg");
        Hardware mouse = new Hardware("egér", "logitech");
        pc.addHardware(monitor);
        pc.addHardware(keyBoard);
        pc.addHardware(mouse);
        Software windows = new Software("Windows", 110);
        Software idea = new Software(" IDEA", 20_211_020);
        pc.addSoftware(windows);
        pc.addSoftware(idea);

        System.out.println(cpu);
        System.out.println(monitor);
        System.out.println(keyBoard);
        System.out.println(mouse);
        System.out.println(windows);
        System.out.println(idea);

        System.out.println(pc.getCpu());
        System.out.println(pc.getHardwares());
        System.out.println(pc.getSoftwares());

        System.out.println(pc);

    }
}
