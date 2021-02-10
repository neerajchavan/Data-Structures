import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class JavaStream{
    public static void main(String[] args) {
        
        List<String> teamA = Arrays.asList("Sachin","Dhoni","Bumrah");
        List<String> teamB = Arrays.asList("Cook","Root","John");
        List<String> teamC = Arrays.asList("ABD","DE KOCK","Dale");

        List<List<String>> combinedTeams = Arrays.asList(teamA,teamB,teamC);

        List<String> finalList = combinedTeams.stream()
        .flatMap(st -> st.stream())
        .map(name -> name + " IN")
        .collect(Collectors.toList());
        System.out.println(finalList);
        
        

    }
}