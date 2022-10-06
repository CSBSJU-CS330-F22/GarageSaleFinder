package controllers;
import people.*;

/**
 * Class with methods related to a user's functionality
 * @author .......
 * @version 9/29/2022
 */
public class UserFuncController {

    DatabaseController dbc = new DatabaseController();

    /**
     * Method for a user to create an account. Username must not be null
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param username the username of the user
     * @param password the password of the user
     * @param type the type of account ('U')
     * @param status the status of the user ('Y' or 'N')
     */
    public void makeAccount(String firstName, String lastName, String username, String password, char type, char status){
        if (!(username.equals(null))){
            Account a = new User(firstName, lastName, username, password, type, status);
            dbc.addAccount(a); //not yet functional
        }
    }

    /**
     * Method for user to search garage sales by location
     * @param city the city where the user wants to find garage sales
     * @return 2d array containing the title of the sale, and username of the sale
     * host for all sales in the city that is being searched
     */
    public Arraylist<Post> searchByLocation(String city){
        if(city.equals(null)){
           //figure out what to do if input is null
        }
        else{
           return dbc.searchByLocation(city);
        }

    }

    public Arraylist<Post> searchByCategory(String category){
        if(category.equals(null)){
            //figure this out
        }
        else{
            return dbc.searchByCategory();
        }
    }
}
