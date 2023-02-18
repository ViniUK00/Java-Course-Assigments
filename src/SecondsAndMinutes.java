public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(36000));
        System.out.println(getDurationString(36567));
        System.out.println(getDurationString(609,27));

    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return "Invalid Input";
        }
        return getDurationString(seconds / 60,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 60 || minutes < 0) {
            return "Invalid Input";
        }
        int getHours = minutes/60;
        minutes = minutes % 60;
        return (getHours + " h " + minutes + " m " + seconds + " s");
    }
}
