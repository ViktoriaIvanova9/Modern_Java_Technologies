public class TourGuide {

    public static int getBestSightseeingPairScore(int[] places) {
        int bestSightseeing = 0, currentSightseeing = 0;

        for (int i = 0; i < places.length - 1; ++i) {
            for (int j = i + 1; j < places.length; ++j) {
                currentSightseeing = places[i] + i + places[j] - j;

                if (currentSightseeing > bestSightseeing) {
                    bestSightseeing = currentSightseeing;
                }
            }
        }
        return bestSightseeing;
    }
}
