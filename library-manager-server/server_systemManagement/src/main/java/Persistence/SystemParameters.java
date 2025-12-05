package Persistence;

public class SystemParameters {

    private int loanPeriod;
    private int maxRenewals;
    private String openingHours;
    private double penaltyRate;

    public SystemParameters() {}

    public SystemParameters(int loanPeriod, int maxRenewals, String openingHours, double penaltyRate) {
        this.loanPeriod = loanPeriod;
        this.maxRenewals = maxRenewals;
        this.openingHours = openingHours;
        this.penaltyRate = penaltyRate;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public int getMaxRenewals() {
        return maxRenewals;
    }

    public void setMaxRenewals(int maxRenewals) {
        this.maxRenewals = maxRenewals;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public double getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(double penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    /**
     * Validates the configuration to prevent invalid system states.
     */
    public boolean validateParameters() {
        if (loanPeriod <= 0) return false;
        if (maxRenewals < 0) return false;
        if (penaltyRate < 0) return false;
        if (openingHours == null || openingHours.isEmpty()) return false;
        return true;
    }

    @Override
    public String toString() {
        return "SystemParameters{" +
                "loanPeriod=" + loanPeriod +
                ", maxRenewals=" + maxRenewals +
                ", openingHours='" + openingHours + '\'' +
                ", penaltyRate=" + penaltyRate +
                '}';
    }
}