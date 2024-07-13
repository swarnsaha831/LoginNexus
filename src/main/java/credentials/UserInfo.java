package credentials;

public class UserInfo {

	String githubUsername = " YOUR_GITHUB_USERNAME ";
	String githubPassword = " YOUR_GITHUB_PASSWORD ";
	
	String practiceUsername = "student";
	String practicePassword = "Password123";
	
	String macysUsername = " YOUR_MACYS_USERNAME ";
	String macysPassword = " YOUR_MACYS_PASSWORD ";
	
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
