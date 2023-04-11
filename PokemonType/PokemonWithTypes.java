public abstract class PokemonWithTypes extends Pokemon {
    private Type type;

    public PokemonWithTypes(String name, int level, int hp, Type type) {
        super(name, level, hp);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public double getTypeEffectiveness(PokemonWithTypes p) {
        double effectiveness = type.getMultiplierAgainst(p.getType());
        p.takeDamage((int) (20 * effectiveness));
        return effectiveness;
    }
}

class FirePokemon extends PokemonWithTypes {
    public FirePokemon(String name, int level) {
        super(name, level, 50 + level * 5, new FireType());
    }
}

class WaterPokemon extends PokemonWithTypes {
    public WaterPokemon(String name, int level) {
        super(name, level, 50 + level * 5, new WaterType());
    }
}

class GrassPokemon extends PokemonWithTypes {
    public GrassPokemon(String name, int level) {
        super(name, level, 50 + level * 5, new GrassType());
    }
}
