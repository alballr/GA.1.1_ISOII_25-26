package Domain;

public class ControlConfigureSystemParameters {

    private SystemParameters currentParameters;

    public ControlConfigureSystemParameters() {
        // initialize with some default values
        this.currentParameters = new SystemParameters(14, 2, "08:00 - 20:00", 0.50);
    }

    public SystemParameters loadCurrentParameters() {
        return currentParameters;
    }

    /**
     * Applies the new configuration IF the parameters are valid.
     */
    public boolean applyNewConfiguration(SystemParameters newParams) {
        if (newParams == null) return false;
        if (!newParams.validateParameters()) return false;

        this.currentParameters = newParams;
        return true;
    }
}