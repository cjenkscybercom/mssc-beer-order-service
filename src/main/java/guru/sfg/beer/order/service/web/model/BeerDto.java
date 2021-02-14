package guru.sfg.beer.order.service.web.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor
@Data
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private BigDecimal price;
}
