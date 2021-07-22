package refactor.exemplos.extract_function;

import com.google.common.collect.ImmutableMap;

/**
 * Se voce tiver que gastar esforcos para observar um fragmento de codigo e descobrir o QUE ele faz, entao deve extrai-lo para uma funcao
 * e atribuir um nome um nome com base no " o que "
 * ATALHO : CTRL + ALT + M
 */

public class PrintDevedoresRefactor {

    public void printaDevedores(){
        var devedoresList = getDevedoresList();
        printaNomesDevedores(devedoresList);
        getValorTotal(devedoresList);
        System.out.println(getValorTotal(devedoresList));
    }

    private Double getValorTotal(ImmutableMap<String, Double> devedoresList) {
        return devedoresList.values().stream().reduce(0.0, Double::sum);
    }

    private void printaNomesDevedores(ImmutableMap<String, Double> devedoresList) {
        devedoresList.keySet().asList().stream().forEach(System.out::println);
    }

    private ImmutableMap<String, Double> getDevedoresList() {
        return  ImmutableMap.<String, Double>builder()
                .put("Eric", 100.00)
                .put("Clapton", 300.00)
                .build();
    }
}
