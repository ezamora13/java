package tipoDatosGenericos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class ExamplePair<K, V> {

    private K key;
    private V value;
}
