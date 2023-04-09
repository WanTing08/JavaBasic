package test;

import domain.Movie;

import java.util.Scanner;

public class MovieService {

    private Movie[] movies;
    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    /** 启动电影信息管理系统 **/
    public void star() {



        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {
            System.out.println("-----------Movie Information System-------------");
            System.out.println("Please enter your choice: ");
            System.out.println("1. search information of all movies");
            System.out.println("2. output the information of a movie according to its id");
            System.out.println("3. exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    queryMovieInfos();
                    break;
                case 2:
                    System.out.println("output the information of a movie according to its id");
                    break;
                case 3:
                    System.out.println("Thank you, bye~");
                    break lo;
                default:
                    System.out.println("your input is wrong, please check it");
                    break;
            }
        }
    }

    private void queryMovieInfos() {
        /** 遍历数组，取出每一个电影对象 */
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            /** System.out.println(movie); 打印对象名，会看到内存地址 */
            /** 2. 通过电影对象，调用内部getXxx方法，获取信息并打印 */
            System.out.println(movie.getTitle());
        }
    }
}
