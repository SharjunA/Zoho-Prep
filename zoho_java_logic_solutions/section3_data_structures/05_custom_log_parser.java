public class CustomLogParser {
    public static void main(String[] args) {
        String logs = "ERROR: Disk full\nINFO: System rebooted\nERROR: Out of memory";
        String[] lines = logs.split("\\n");
        for (String line : lines)
            if (line.startsWith("ERROR"))
                System.out.println("Error Log: " + line);
    }
}