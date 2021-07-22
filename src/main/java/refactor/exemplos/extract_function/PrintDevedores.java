package refactor.exemplos.extract_function;

import com.google.common.collect.ImmutableMap;

;

public class PrintDevedores {

    public void printaDevedores(){
        var devedoresList = getDevedoresList();
        devedoresList.keySet().asList().stream().forEach(System.out::println);
        Double sum = devedoresList.values().stream().reduce(0.0, Double::sum);
        System.out.println(sum);
    }

    private ImmutableMap<String, Double> getDevedoresList() {
        return  ImmutableMap.<String, Double>builder()
                .put("Eric", 100.00)
                .put("Clapton", 250.00)
                .build();
    }
}


