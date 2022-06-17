public class Switch {
    public static void main(String args[]) {
        //Assign value ke result dan day
        String result = "";
        String day = "T";

        //Switch clause
        switch (day) {
            case "M":
            case "W":
            case "F":
            {
                result = "MWF";
                break;
            }
            case "T":
            case "TH":
            case "S":
            {
                result = "TTS";
                break;
            }
      };

      //Print hasil
      System.out.println("Old Switch Result: ");
      System.out.println(result);
    }
}