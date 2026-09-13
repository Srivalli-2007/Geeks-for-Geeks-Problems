import java.time.*;
class Solution {
    public String timeGap(String st, String et) {
        LocalTime start = LocalTime.parse(st);
        boolean nextDay = et.startsWith("24");

        if (nextDay) {
            et = "00" + et.substring(2);
        }

        LocalTime end = LocalTime.parse(et);

        Duration d = Duration.between(start, end);

        if (nextDay) {
            d = d.plusHours(24);
        }

        long total = d.getSeconds();

        long h = total / 3600;
        long m = (total / 60) % 60;
        long s = total % 60;

        return String.format("%02d:%02d:%02d", h, m, s);
    }
}