public class HelloGit extends Git{
	public static void master(){
		System.out.println("master added new method");
	}
	public static final String VERSION ="0.3";
	public static void main(String[] args){
		System.out.println("HelloGit: " + VERSION);
		master();

		Git git = new Git();
		git.welcome();
	}
}

Class Git(){
	public  void welcome(){
		System.out.println("Welcome to the Git project!");
	}
}