package credentials;

public class UserInfo {

	String githubUsername = "swarnsaha831";
	String githubPassword = "Timetoexplode1!";
	
	String practiceUsername = "student";
	String practicePassword = "Password123";
	
	String macysUsername = "spartancreed3000@gmail.com";
	String macysPassword = "Timetoexplode1!";
	
	public String githubUsername() {
		return githubUsername.replaceAll(" ", "");
	}

	public String githubPassword() {
		return githubPassword.replaceAll(" ", "");
	}
	
	public String practiceUsername() {
		return practiceUsername.replaceAll(" ", "");
	}
	
	public String practicePassword() {
		return practicePassword.replaceAll(" ", "");
	}
	
	public String macysUsername() {
		return macysUsername.replaceAll(" ", "");
	}
	
	public String macysPassword() {
		return macysPassword.replaceAll(" ", "");
	}
	
}
