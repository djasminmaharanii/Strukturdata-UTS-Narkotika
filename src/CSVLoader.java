import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVLoader {

    public static CustomArrayList<PutusanNarkotika> loadData(String filePath) {
        CustomArrayList<PutusanNarkotika> list = new CustomArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] values = parseCSVLine(line);
                if (values.length >= 14) {
                    PutusanNarkotika p = new PutusanNarkotika(
                            values[0].trim(),
                            values[1].trim(),
                            values[2].trim(),
                            values[3].trim(),
                            values[4].trim(),
                            values[5].trim(),
                            parseSafeDouble(values[6]),
                            values[7].trim(),
                            parseSafeInt(values[8]),
                            parseSafeInt(values[9]),
                            parseSafeDouble(values[10]),
                            values[11].trim(),
                            values[12].trim(),
                            values[13].trim()
                    );
                    list.add(p);
                }
            }
        } catch (IOException e) {
            System.err.println("Gagal membaca file CSV: " + e.getMessage());
        }

        return list;
    }

    private static double parseSafeDouble(String str) {
        try {
            return Double.parseDouble(str.trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    private static int parseSafeInt(String str) {
        try {
            return Integer.parseInt(str.trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static String[] parseCSVLine(String line) {
        CustomArrayList<String> tokens = new CustomArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                tokens.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        tokens.add(sb.toString());

        String[] result = new String[tokens.size()];
        for (int i = 0; i < tokens.size(); i++) {
            result[i] = tokens.get(i);
        }
        return result;
    }
}