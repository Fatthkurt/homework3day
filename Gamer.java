package byrak;

public class Gamer {
	String nickName;
	int Id;
	String nationalId;
	String email;

	public Gamer() {}

	public Gamer(int Id, String nickName, String nationalId,String email ) {
		this.Id = Id;
		this.nickName = nickName;
		this.nationalId = nationalId;
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
