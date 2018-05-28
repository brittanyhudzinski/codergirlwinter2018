package Blog;

public class User {

        //members
        public String webAddress;
        public String userName;
        private String realName;
        private String emailAddress;

        //this is a constructor
        public User(String webAddress, String userName, String realName, String emailAddress)
        {
            this.webAddress = webAddress;
            this.userName = userName;
            this.realName = realName;
            this.emailAddress = emailAddress;
        }

        //methods
         public String getWebAddress()
        {
            return webAddress;
        }

        public String getUserName()
        {
            return userName;
        }

        public String getRealName()
        {
            return realName;
        }

        public String getEmailAddress()
        {
            return emailAddress;
        }

        public void displayUser()
        {
            System.out.println("User Name: " + userName);
            System.out.println("Web Address: " + webAddress);
            System.out.println("Name: " + realName);
            System.out.println("Email Address: " + emailAddress);
        }
}
