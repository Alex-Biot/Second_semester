import java.util.Comparator;

public class ComparatorAddressPort implements Comparator<AddressPort> {
    @Override
    public int compare(AddressPort o1, AddressPort o2) {
        return o1.key-o2.key;
    }
}
