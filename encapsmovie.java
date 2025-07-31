class Movie{
    private String title;
    private String director;
    private double rating;
     Movie(String title,String director,double rating){
        this.title=title;
        this.director=director;
        this.setrating(rating);
     }
    public String gettitle(){
        return title;
    }
    public String getdirector(){
        return director;
    }
    public double getrating(){
        return rating;
    }
    public void setrating(double newrating){
        if(newrating>=0.0 && newrating<=10.0){
            rating = newrating;
        }
        else{
            System.out.println("Invalid Rating");
        }

    }
}

public class encapsmovie {
    
    public static void main(String[] args) {
        Movie m=new Movie("Lovely Runner","jhgdhg",0);
        System.out.println(m.gettitle());
        System.out.println(m.getdirector());
        System.out.println(m.getrating());
    }
}
