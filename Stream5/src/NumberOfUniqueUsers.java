import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


public class NumberOfUniqueUsers implements Collector<LogEntry, HashSet<String>, Integer> {

    @Override
    public Supplier<HashSet<String>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<HashSet<String>, LogEntry> accumulator() {
        return (strings, logEntry) -> strings.add(logEntry.getUserName());
    }

    @Override
    public BinaryOperator<HashSet<String>> combiner() {
        return (hashSet1, hashSet2) -> {
            hashSet1.addAll(hashSet2);
            return hashSet1;
        };
    }

    @Override
    public Function<HashSet<String>, Integer> finisher() {
        return HashSet::size;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}
