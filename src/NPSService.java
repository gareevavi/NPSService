public class NPSService {
    public double nps(int votes[]) {
        int promoters = 0;
        int detractors = 0;
        int neutrals = 0;

        for (int vote : votes) {
            if (vote >= 9) {
                promoters = promoters + 1;
            }
            if (vote <= 6) {
                detractors = detractors + 1;
            }
            if (vote == 7 || vote == 8) {
                neutrals = neutrals + 1;
            }
        }
        double nps = (promoters * 1. - detractors * 1.) * 100 / votes.length;
        return  nps;
    }
}