
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine().toUpperCase();

        int contadorDeJogos = 0;
        int contadorDeVitorias = 0;
        int contadorDeDerrotas = 0;

        try {
            Scanner leitor = new Scanner(Paths.get(file));

            while (leitor.hasNextLine()) {

                String linha = leitor.nextLine();

                String[] parts = linha.split(",");

                if (parts.equals("")) {
                    continue;
                }

                String homeTeam = parts[0].trim();
                String enemyTeam = parts[1].trim();
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int enemyTeamPoints = Integer.valueOf(parts[3]);

                if (team.equals(homeTeam.toUpperCase())){
                    contadorDeJogos++;

                    if (homeTeamPoints > enemyTeamPoints){
                        contadorDeVitorias++;
                    } else {
                        contadorDeDerrotas++;
                    }
                }

                if (team.equals(enemyTeam.toUpperCase())){
                    contadorDeJogos++;

                    if (enemyTeamPoints > homeTeamPoints){
                        contadorDeVitorias++;
                    } else {
                        contadorDeDerrotas++;
                    }
                }
            }
            System.out.println("Games: " + contadorDeJogos);
            System.out.println("Wins: " + contadorDeVitorias);
            System.out.println("Losses: " + contadorDeDerrotas);

        } catch (Exception e){
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}
