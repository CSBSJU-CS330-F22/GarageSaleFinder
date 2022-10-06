package controllers;
import people.*;

/**
 * Class with methods connecting to the database
 * @author .......
 * @version 9/29/2022
 */
public class DatabaseController {

    /**
     * Method to add an account to the database........INCOMPLETE!!
     * @param a the account to add to the database
     */
    public void addAccount(Account a){
        //add account to database
    }

    /**
     * Method to get the account corresponding to the given username from the database......INCOMPLETE!!
     * @param username the username of the account to grab
     * @return the account
     */
    public Account getAccount(String username){
        return new User("This", "is", "temporary", "dummy", 'U', 'Y');
        //grab real account from database based on username
    }

    /**
     * method to get an array list of all post objects from the database
     * @return array list of all post objects from the database
     */
    public Arraylist<Post> getAllPosts(){
        new Arraylist<Post> allPosts;
        //databse method to get a 2d array of sale data (once databse is setup)
        //iterate over data to create a arraylist of post objects
        return allPosts;
    }
    /**
     * Method to find sales in the database that are in the city given by the user ***NOT HOOKED UP TO DATABASE***
     * @param city the city where the user wants to find garage sales
     * @return the post object
     */
    public ArrayList<Post> searchByLocation(String city){
        new Arraylist<Post> allPosts = getAllPosts();//not yet working
        new Arraylist<Post> matching;
        int x == 0;
        for(i = 0; i < allPosts.size(); i++){
            if((allPosts.get(i).getLocation()).equals(city)){
                matching.add(x, Post);
                x++;
            }
        }

        return matching;
        //this method needs to be hooked up to the database
    }
    
}
