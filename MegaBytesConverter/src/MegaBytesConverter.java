public class MegaBytesConverter {

    public static void printMegaBytesAndKiloByes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int fullMeg = Math.round(kiloBytes / 1024);
            int remainder = Math.round(kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + fullMeg + " MB " + remainder + "KB");
        }
    }
}
