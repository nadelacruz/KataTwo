public class BinaryChop {
    public int chop(int numberToSearch, int[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            return -1;
        }
        if (arrayOfNumbers.length == 1) {
            if (arrayOfNumbers[0] != numberToSearch) {
                return -1;
            }
            return 0;
        }

        int midPoint = arrayOfNumbers.length / 2;

        if (arrayOfNumbers[midPoint] == numberToSearch) {
            return midPoint;
        }

        return -99;
    }
}
