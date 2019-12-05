package warmups;

import java.util.List;
        import java.util.Map;
import java.util.stream.Collectors;

import static warmups.Common.*;

public class Task2 {

    List<String> solution1(Map<String, List<String>> assoc_subj_verb,
                           Map<String, List<String>> assoc_verb_obj) {
        List<String> outcome=
        assoc_subj_verb.keySet().stream().flatMap(subj ->
                assoc_subj_verb.get(subj).stream().flatMap(verb ->
                        assoc_verb_obj.get(verb).stream().map(obj ->
                                combine(subj, verb,obj)))).collect(Collectors.toList());
        return outcome;
        //throw new IllegalArgumentException("not implemented yet");
    }

    public static void main(String[] args) {
        Map<String, List<String>> assoc_subj_verb = map(
                of("Noel", list("wrote", "chased", "slept on")),
                of("The cat", list("meowed at", "chased", "slept on")),
                of("The dog", list("barked at", "chased", "slept on")));

        Map<String, List<String>> assoc_verb_obj = map(
                of("wrote", list("the book", "the letter", "the code")),
                of("chased", list("the ball", "the dog", "the cat")),
                of("slept on", list("the bed", "the mat", "the train")),
                of("meowed at", list("Noel", "the door", "the food cupboard")),
                of("barked at", list("the postman", "the car", "the cat")));

        Task2 app = new Task2();
        List<String> sentences = app.solution1(assoc_subj_verb, assoc_verb_obj);
        sentences.forEach(System.out::println);
    }
}
