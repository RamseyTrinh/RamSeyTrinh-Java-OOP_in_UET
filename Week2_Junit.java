public class Week4 {
    /**
     * TXHoang.
     */
    public static int max2Int(int a, int b) {
        int x = 0;
        if (a > b) {
            x = a;
        } else {
            x = b;
        }
        return x;
    }

    /**
     * TXhoang.
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     *Hoang.
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        double round = Math.round(BMI * 100.0) / 100.0;
        if (round < 18.5) {
            return "Thiếu cân";
        }
        if (round >= 18.5 && BMI <= 22.9) {
            return "Bình thường";
        }
        if (round >= 23 && BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";

        }
    }
}