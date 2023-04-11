public interface Type {
    double getMultiplierAgainst(Type t);
}

class FireType implements Type {
    public double getMultiplierAgainst(Type t) {
        if (t instanceof GrassType) {
            return 2.0;
        } else if (t instanceof WaterType ) {
            return 0.5;
        } else {
            return 1.0;
        }
    }
}

class WaterType implements Type {
    public double getMultiplierAgainst(Type t) {
        if (t instanceof FireType) {
            return 2.0;
        } else if (t instanceof GrassType) {
            return 0.5;
        } else {
            return 1.0;
        }
    }
}

class GrassType implements Type {
    public double getMultiplierAgainst(Type t) {
        if (t instanceof WaterType) {
            return 2.0;
        } else if (t instanceof FireType) {
            return 0.5;
        } else {
            return 1.0;
        }
    }
}
