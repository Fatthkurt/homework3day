package byrak;

public interface GameService {

	void add(Game game);

	void update(Game game);

	void delete(Game game);

	void sellGame(Game game, Gamer gamer);

	void sellGame(Game game, Gamer gamer, Campaign campaign);
}