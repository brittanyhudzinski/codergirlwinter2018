package Blog;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu2 {
    static Scanner keyboard = new Scanner(System.in);
    static public User currentUser;
    static ArrayList users = new ArrayList();
    static ArrayList posts = new ArrayList();

    public static void main(String[] args)
    {
        int menuChoice;

        while(true) {
            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");

            //how do I know who the current user is at start of program?
            //TODO figure out how to check if currentUser exists
            if (currentUser == null) {
                System.out.println("What would you like to do?");
            }
            else {
                System.out.println("You are currently user " + currentUser.getUserName() + ". What would you like to do?");
            }
            menuChoice = keyboard.nextInt();

            if (menuChoice == 1) {
                //create new user
                users.add(createUser());
                //currentUser = createUser().getUserName();
            }
            else if (menuChoice == 2) {
                //become an existing user
                currentUser = becomeExistingUser();
            }
            else if (menuChoice == 3) {
                //create a post as the current user
                posts.add(createPost());
            }
            else if (menuChoice == 4) {
                //print all posts
                printPosts();
            }
            else if (menuChoice == 5) {
                //print all users
                printUsers();
            }


        }
    }

    //methods
    static public User createUser()
    {
        String webAddress;
        String userName;
        String realName;
        String emailAddress;

        System.out.println("Enter your web address:");
        keyboard.skip("\n");
        webAddress = keyboard.nextLine();
        System.out.println("Enter your user name:");
        userName = keyboard.nextLine();
        System.out.println("Enter your first and last name:");
        realName = keyboard.nextLine();
        System.out.println("Enter your email address:");
        emailAddress = keyboard.nextLine();

        User newUser;
        newUser = new User(webAddress, userName, realName, emailAddress);
        return newUser;
    }

    static public User becomeExistingUser()
    {
        //TODO search through users and become existing user from keyboard input user name
        String existingUserName;
        String enteredUserName;
        User existingUser = null;

        System.out.println("Enter the user name you would like to become:");
        enteredUserName = keyboard.next();

        for(int i = 0; i < users.size(); i++)
        {
            existingUserName = ((User)users.get(i)).getUserName();
            if (existingUserName.equals(enteredUserName))
            {
                existingUser = (User)users.get(i);
            }
        }
        if (existingUser == null)
        {
            System.out.println("That user does not exist.");
            return null;
        }
            // TODO check to see if existing user is null before printing
        System.out.println("You are now " + existingUser.getUserName());
        return existingUser;
    }

    static public Post createPost()
    {
        //TODO current user creates new post
        String contentsOfPost;


        System.out.println("Enter your post here:");
        keyboard.skip("\n");
        contentsOfPost = keyboard.nextLine();

        Post newPost;
        newPost = new Post(currentUser.getUserName(), contentsOfPost);

        return newPost;
    }

    static public void printPosts()
    {
        for(int i = 0; i < posts.size(); i++)
        {
            ((Post)posts.get(i)).displayPost();
        }
    }

    static public void printUsers()
    {
        for(int i = 0; i < users.size(); i++)
        {
            ((User)users.get(i)).displayUser();
        }
    }
}
