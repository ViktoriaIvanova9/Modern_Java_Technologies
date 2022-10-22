public class DataCenter {
    public static int getCommunicatingServersCount(int[][] map) {

        int[] columnIndexesSaver = new int[map[0].length];
        boolean[] isChecked = new boolean[map[0].length];

        int countComputersPerRow = 0, countTotalComputers = 0;
        int indexColumnOfLastComputerPerRow = 0;

        for (int i = 0; i < map.length; ++i) {
            for (int j = 0; j < map[0].length; ++j) {
                if (map[i][j] == 1) {
                    countComputersPerRow++;
                    indexColumnOfLastComputerPerRow = j;
                    isChecked[indexColumnOfLastComputerPerRow] = true;
                }
            }

            if (countComputersPerRow > 1) {
                countTotalComputers += countComputersPerRow;
            } else if (countComputersPerRow == 1) {
                columnIndexesSaver[indexColumnOfLastComputerPerRow]++;
                isChecked[indexColumnOfLastComputerPerRow] = false;
            }

            countComputersPerRow = 0;
        }

        for (int i = 0; i < columnIndexesSaver.length; ++i) {
            if ((columnIndexesSaver[i] > 1) || (columnIndexesSaver[i] == 1 && isChecked[i] == true)) {
                countTotalComputers += columnIndexesSaver[i];
            }
        }
        return countTotalComputers;
    }
}
