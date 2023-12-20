public class Main {
    public static void main(String[] args) {
        // Creating an instance of BaseRecommendationModel
        BaseRecommendationModel user1 = new BaseRecommendationModel();

        // Modifying recommendations for user1
        user1.showRecommendations(); // Original recommendations
        user1.showRecommendations(); // Original recommendations

        // Creating a clone of user1
        BaseRecommendationModel user2 = user1.clone();

        // Modifying recommendations for user2
        user2.showRecommendations(); // Cloned recommendations

        // Modifying recommendations for user2 (appending and removing)
        user2.showRecommendations(); // Updated recommendations for user2

        user2.getRecommendations().remove("Action Movie 1");
        user2.getRecommendations().add("Comedy Movie 2");
        user2.showRecommendations(); // Updated recommendations for user2
    }
}
