import java.util.List;
import java.util.ArrayList;

class BaseRecommendationModel implements Prototype {
    private List<String> recommendations;

    public BaseRecommendationModel() {
        this.recommendations = new ArrayList<>();
        this.recommendations.add("Action Movie 1");
        this.recommendations.add("Comedy Movie 1");
    }

    public void showRecommendations() {
        System.out.println(recommendations);
    }

    public List<String> getRecommendations() {
        return recommendations;
    }

    @Override
    public BaseRecommendationModel clone() {
        BaseRecommendationModel clone = new BaseRecommendationModel();
        clone.recommendations = new ArrayList<>(this.recommendations);
        return clone;
    }
}