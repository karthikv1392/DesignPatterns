import org.filesystem.*;

public class FileSystemDemo {
    public static void main(String[] args){
        // Create some folders
        Folder root = new Folder("root");
        Folder home = new Folder("home");
        Folder user = new Folder("user");
        Folder documents = new Folder("documents");
        Folder pictures = new Folder("pictures");
        Folder music = new Folder("music");
        Folder user1 = new Folder("user1");
        Folder user2 = new Folder("user2");

        // Create some files
        File document1 = new File("document1", 300);
        File picture1 = new File("picture1", 400);
        File music1 = new File("music1", 500);

        // Add folders to root
        root.addFS(home);

        // Add files to folders
        home.addFS(user);
        user.addFS(user1);
        user.addFS(user2);
        user1.addFS(documents);
        user1.addFS(pictures);
        user1.addFS(music);
        documents.addFS(document1);
        pictures.addFS(picture1);
        music.addFS(music1);

        System.out.println("The main Component");
        root.print("");

        System.out.println("The composite Component which itself can also be Component");
        user1.print("");
    }
}