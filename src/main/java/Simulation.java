public class Simulation {

    Integer numOfDice;
    Integer numOfSims;

    public Simulation(int numOfDice, int numOfSims) {
        this.numOfDice = numOfDice;
        this.numOfSims = numOfSims;
    }

    public void runSimulation() {
        Dice dice = new Dice(numOfDice);
        Integer possibleOutcomes = (numOfDice*6) - 1;
        int[] bins;
        bins = new int [possibleOutcomes];
        float probability;
        Integer binIndex = 0;
        Integer tossResult = 0;

        for(int i = 1; i <= numOfSims; i++) {
            tossResult = dice.tossAndSum();
            binIndex = tossResult - 2;
            bins[binIndex]++;
        }

        System.out.println("Simulation of " + numOfDice + " dice tossed " + numOfSims + " times\n");

        int starCount;
        for (int i = 0; i < bins.length; i++) {
            probability = (float) bins[i]/numOfSims;
            System.out.println(i+2 + ": " + bins[i] + " : " + Math.floor(probability*100) / 100);
        }
    }

}
