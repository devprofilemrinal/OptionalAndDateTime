package Optional.code;

import java.util.Optional;

public class CreateOptional {
    public static void main(String[] args) {
        createOptionals();
    }
    public static void createOptionals(){
        // Empty Optional
        Optional<Void> emptyOptional = Optional.empty();
        /*
        * Since optional acts as Container<Box>
        * avoid initialising it to null*/
        Optional<String> nullOp = null;

        // Wrap in Optional
        Optional<String> optionalWrapper = Optional.of("hello");
        System.out.println(optionalWrapper.get());

        //Optional from nullable
        Optional<String> nullableOptional = Optional.ofNullable(null);

    }
}
