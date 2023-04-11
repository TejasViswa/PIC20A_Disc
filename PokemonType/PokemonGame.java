public class PokemonGame {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 10);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 10);

        System.out.println(charmander.getName() + " (Fire) vs. " + bulbasaur.getName() + " (Grass)");
        System.out.println(charmander.getName() + "'s attack against " + bulbasaur.getName() + " did " + 20 * charmander.getTypeEffectiveness(bulbasaur) + " damage.");
        System.out.println(bulbasaur.getName() + "'s attack against " + charmander.getName() + " did " + 10 * bulbasaur.getTypeEffectiveness(charmander) + " damage.");
    }
}
