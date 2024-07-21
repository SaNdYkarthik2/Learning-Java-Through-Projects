import java.util.Scanner;
class MovieList{
    String movieTitle,directedBy;
    int yearofrelease;
    float rating;


    MovieList(String MovieTitle,int YearOfRelease,float Rating, String DirectedBy){
        this.movieTitle = MovieTitle;
        this.yearofrelease = YearOfRelease;
        this.rating = Rating;
        this.directedBy = DirectedBy;
    }

}
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MovieList [] flimData = new MovieList[]{

                new MovieList("Seven Samurai",1954, 7.6F,"Akria Kurosawa"),
                new MovieList("Rashomon",1950, 8.2F,"Akria Kurosawa"),
                new MovieList("Ikiru",1952, 7.5F,"Akria Kurosawa"),
                new MovieList("Dil se..",1998, 7.6F,"Mani ratnam"),
                new MovieList("Raavanan",2010, 9.6F,"Mani ratnam"),
                new MovieList("Guru",2007, 8.4F,"Mani ratnam"),
                new MovieList("Iruvar",1997, 9.1F,"Mani ratnam"),
                new MovieList("The Grandmaster",2013, 6.5F,"Wong-kar-wai"),
                new MovieList("My Blueberry Nights",2007, 6.2F,"Wong-kar-wai"),
                new MovieList("Ashes of time",1997, 5.4F,"Wong-kar-wai"),
        };

        System.out.print("Enter the Rating : " );
        float rate = scanner.nextFloat();
        scanner.close();

        for (int i = 0; i < flimData.length; i++){
            if(rate < flimData[i].rating){
                System.out.println("Movie Title : "+ flimData[i].movieTitle + "\n" +
                                   "Year of Release : "+ flimData[i].yearofrelease + "\n" +
                                   "Rating : "+flimData[i].rating + "\n" +
                                   "Directed by : "+flimData[i].directedBy + "\n\n");
            }else if(rate > flimData[i].rating){
                continue;
            }else{
                System.out.println("Error: Invalid Input.");
            }
        }


    }
}