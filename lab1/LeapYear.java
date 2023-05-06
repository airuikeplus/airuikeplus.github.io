public class LeapYear {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java LeapYear <year>");
            System.exit(1);
        }

        int year = Integer.parseInt(args[0]);

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " 是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }
    }
}