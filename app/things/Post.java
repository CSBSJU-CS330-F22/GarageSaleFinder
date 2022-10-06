package things;

/**
 * Abstract class for creating a post
 * @author ........
 * @version 9/29/2022
 */
public abstract class Post {

    private String owner;
    private String location;
    private String title;
    //add list of items
    private String description;
    private String date;
    private String time;
    //add image
    private int priceRange;



    /**
     * Constructor to create a Post
     * @param owner the username of the user who created the post
     * @param location the location of the sale
     * @param title the title of the sale
     * @param description the description of the post
     * @param date the date the sale is taking place
     * @param time the time the sale is taking place
     * @param priceRange the pricerange of the sale (1-5), where 1 is the cheapest and 5 is the most expensive
     */
    public Post(String owner, String location, String title, String description, String date,
                String time, int priceRange){
       this.owner = owner;
       this.location = location;
       this.title = title;
       this.description = description;
       this.date = date;
       this.time = time;
       this.priceRange = priceRange;
    }

    /**
     * method to set the owner of the sale
     * @param owner the username of the owner of the post
     */
    public setOwner(String owner){
        this.owner = owner;
    }

    /**
     * method to get the owner of the sale
     * @return returns the username of the owner of the post
     */
    public String getOwner(){
        return this.owner;
    }

    /**
     * method to set the location of the sale
     * @param location the location of the sale
     */
    public setLocation(String location){
        this.location=location;
    }

    /**
     * method to get the location of a sale
     * @return the location of the sale
     */
    public String getLocation(){
        return this.location;
    }

    /**
     * method to set the title of the post
     * @param title the title of the post
     */
    public setTitle(String title){
        this.title = title;
    }

    /**
     * method to get the title of the post
     * @return the title of the post
     */
    public String getTitle(){
        return this.title;
    }

    /**
     * method to set the description of the post
     * @param description the description of the post
     */
    public setDescription(String description){
        this.description = description;
    }

    /**
     * method to get the description of the post
     * @return the description of the post
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * method to get the date of the post
     * @param date the date of the sale
     */
    public setDate(String date){
        this.date = date;
    }

    /**
     * method to get the date of the sale
     * @return the date of the sale
     */
    public String getDate(){
        return this.date;
    }

    /**
     * method to set the time of the sale
     * @param time the time the sale will take place
     */
    public setTime(String time){
        this.time = time;
    }

    /**
     * method to get the time of the sale
     * @return the time of the sale
     */
    public String getTime(){
        return this.time;
    }

    /**
     * method to set the price range of the sale
     * @param priceRange the price range of the sale (1-5) 1 begin the cheapest, 5 being the most expensive
     */
    public setPriceRange(int priceRange){
        this.priceRange = priceRange;
    }

    /**
     * method to get the proce range of the sale
     * @return the price range of the sale (1-5) 1 begin the cheapest, 5 being the most expensive
     */
    public String getPriceRange(){
        return this.priceRange;
    }
}