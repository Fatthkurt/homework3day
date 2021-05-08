package byrak;

public class GameManager implements GameService {
	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi. " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun GŁncellendi. " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi. " + game.getName());
	}

}
