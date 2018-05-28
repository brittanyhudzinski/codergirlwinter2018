package Blog;

public class Post {

    private int orderOfPost;
    public String userName;
    public String contentsOfPost;

    static int counter = 1;

    public Post(String userName, String contentsOfPost)
    {
        this.userName = userName;
        this.contentsOfPost = contentsOfPost;
        this.orderOfPost = counter;
        counter++;
    }

    public void displayPost()
    {
        System.out.println(orderOfPost);
        System.out.println(userName + ": " + contentsOfPost);
    }

}
