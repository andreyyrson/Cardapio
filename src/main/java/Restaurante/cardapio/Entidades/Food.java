package Restaurante.cardapio.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "food")
@Table(name = "food")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titlle;
    private String image;
    private int price;

    public Food(FoodRequestDTO data) {
        this.image = data.image();
        this.price = data.price();
        this.titlle = data.title();
    }

}
