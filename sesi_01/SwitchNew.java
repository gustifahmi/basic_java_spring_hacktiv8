public class SwitchNew {
    public static void main(String args[]) {
        //Assign nilai day
        String day = "T";

        //Switch clause yang hasilnya diassign ke result
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    result = "Please insert a valid day.";
                else
                    result = "Looks like a Sunday.";
                throw new IllegalStateException("Invalid day: " + result);
            }
        };

        //Print result
        System.out.println(result);
    }
}