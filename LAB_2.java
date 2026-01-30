public class MovieDecision {
    public static void main(String[] args) {
        int temperature = 28;               
        String genre = "Thriller";          
        boolean partnerReady = true;        
        String director = "Nolan";          
        if (temperature > 25){
            System.out.println("Temperature is good for movie.");
            if (genre.equalsIgnoreCase("Thriller")){
                System.out.println("Movie genre is thriller.");
                if (partnerReady){
                    System.out.println("Partner is ready.");
                    if (director.equalsIgnoreCase("Nolan")){
                        System.out.println("Director is Nolan.");
                        System.out.println("Yes! You can go for the movie.");
                    }else{
                        System.out.println("Director is not Nolan. Maybe skip the movie.");
                    }
                }else{
                    System.out.println("Partner is not ready. Cannot go.");
                }
            }else{
                System.out.println("Movie genre is not thriller. Cannot go.");
            }
        }else{
            System.out.println("Temperature is not good. Cannot go.");
        }
    }
}
